package com.example.practicacup;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.io.StringReader;
import java.security.interfaces.DSAPrivateKey;
import java.util.ArrayList;
import java.util.List;

import Forma.ErrorLexico;
import Forma.Formas;
import codigo.LexerCup;
import codigo.Parser;

public class MainActivity extends AppCompatActivity {
    ArrayList<Formas> formasMain = new ArrayList<Formas>();
    ArrayList<Forma.Error> errores = new ArrayList<Forma.Error>();
    ArrayList<ErrorLexico> erroresLexicos = new ArrayList<ErrorLexico>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendForma(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        Bundle bundle = new Bundle();
        EditText editText = (EditText) findViewById(R.id.editText);

        String message = editText.getText().toString();
        LexerCup lexer = new  LexerCup(new StringReader(message));
        Parser s = new Parser(lexer);
        erroresLexicos=lexer.getErrorsLexList();
        formasMain=s.getListaFormas();
        errores=s.getErrorsList();
        List<Integer> erroresperado=s.expected_token_ids();
        TextView error =(TextView) findViewById(R.id.errortxt);
        try {
            error.setText("");
            s.parse();
            bundle.putSerializable("formas",(Serializable)formasMain);
            intent.putExtra("Bundle_Array",bundle);
            startActivity(intent);
        } catch (Exception ex) {
            System.out.println("Error irrecuperable " + ex);
            for(int i=0; i< errores.size();i++){
                error.setText(String.valueOf(erroresperado.size()));
            }
        }
    }

    public void sendErrores(View view){
        if(errores.size()>0 || erroresLexicos.size()>0){
            Intent intent = new Intent(this, Errores.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("errores",(Serializable)errores);
            bundle.putSerializable("erroresLexicos",(Serializable)erroresLexicos);
            intent.putExtra("ArrayErrores",bundle);
            startActivity(intent);
        }else{
            TextView error =(TextView) findViewById(R.id.errortxt);
            error.setText("Debe tener errores para generar el reporte");
        }
    }

}