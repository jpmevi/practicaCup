package com.example.practicacup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

import Forma.Error;
import Forma.ErrorLexico;
import Forma.Formas;

public class Errores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_errores);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("ArrayErrores");
        ArrayList<Forma.Error> error = (ArrayList<Forma.Error>) bundle.getSerializable("errores");
        ArrayList<ErrorLexico> errorLexico = (ArrayList<ErrorLexico>) bundle.getSerializable("erroresLexicos");
        TableLayout tabla = (TableLayout) findViewById(R.id.tabla);
        for (int i=0;i<errorLexico.size();i++){
            TableRow row = new TableRow(this);
            TextView tvlexema = new TextView(this);
            TextView tvlinea = new TextView(this);
            TextView tvcolumna = new TextView(this);
            TextView tvtipo = new TextView(this);
            TextView tvdescripcion = new TextView(this);
            tvlexema.setText(errorLexico.get(i).getLexema());
            tvlinea.setText(String.valueOf(errorLexico.get(i).getLinea()));
            tvcolumna.setText(String.valueOf(errorLexico.get(i).getColumna()));
            tvtipo.setText("Lexico");
            tvdescripcion.setText("Símbolo no existe");
            tvlexema.setPadding(0,50,70,50);
            tvlinea.setPadding(50,50,50,50);
            tvcolumna.setPadding(50,50,10,50);
            tvtipo.setPadding(30,50,30,50);
            tvdescripcion.setPadding(30,50,30,50);
            row.addView(tvlexema); row.addView(tvlinea); row.addView(tvcolumna); row.addView(tvtipo); row.addView(tvdescripcion);
            tabla.addView(row);
        }

        for (int i=0;i<error.size();i++){
            TableRow row = new TableRow(this);
            TextView tvlexema = new TextView(this);
            TextView tvlinea = new TextView(this);
            TextView tvcolumna = new TextView(this);
            TextView tvtipo = new TextView(this);
            TextView tvdescripcion = new TextView(this);
            tvlexema.setText(error.get(i).getLexema());
            tvlinea.setText(String.valueOf(error.get(i).getLinea()));
            tvcolumna.setText(String.valueOf(error.get(i).getColumna()));
            tvtipo.setText("Sintactico");
            tvdescripcion.setText("Se esperaba");

            tvlexema.setPadding(70,50,70,50);
            tvlinea.setPadding(50,50,50,50);
            tvcolumna.setPadding(50,50,10,50);
            tvtipo.setPadding(30,50,30,50);
            tvdescripcion.setPadding(30,50,30,50);
            row.addView(tvlexema); row.addView(tvlinea); row.addView(tvcolumna); row.addView(tvtipo); row.addView(tvdescripcion);
            tabla.addView(row);
        }



    }



}