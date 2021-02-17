package com.example.practicacup;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.StringReader;
import java.util.ArrayList;

import Forma.Formas;
import codigo.Parser;

public class MainActivity extends AppCompatActivity {
    ArrayList<Formas> formasMain = new ArrayList<Formas>();
    public static final String EXTRA_MESSAGE= "com.example.practicacup.Mensaje";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();


        Parser s = new Parser(new codigo.LexerCup(new StringReader(message)));

        try {
            s.parse();
            formasMain=s.getListaFormas();
            System.out.println(String.valueOf(formasMain.size()));
            intent.putExtra(EXTRA_MESSAGE,String.valueOf(formasMain.size()));
            startActivity(intent);
        } catch (Exception ex) {
            System.out.println("Error irrecuperable " + ex);

        }
    }

}