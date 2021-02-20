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

import Forma.Formas;
import codigo.Parser;

public class MainActivity extends AppCompatActivity {
    ArrayList<Formas> formasMain = new ArrayList<Formas>();
    ArrayList<String> errores = new ArrayList<String>();
    public static final String EXTRA_MESSAGE= "com.example.practicacup.Mensaje";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        Bundle bundle = new Bundle();
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        Parser s = new Parser(new codigo.LexerCup(new StringReader(message)));
        formasMain=s.getListaFormas();
        errores=s.getErrorsList();
        TextView error =(TextView) findViewById(R.id.errortxt);
        try {
            s.parse();
            System.out.println(String.valueOf(formasMain.size()));
            bundle.putSerializable("formas",(Serializable)formasMain);
            intent.putExtra("Bundle_Array",bundle);
            startActivity(intent);

        } catch (Exception ex) {
            System.out.println("Error irrecuperable " + ex);
            for(int i=0; i< errores.size();i++){
                error.setText(error.getText()+ errores.get(i).toString()+"\n");
            }
        }
    }

    public ArrayList<Formas> regresarLista(){
        return formasMain;
    }
}