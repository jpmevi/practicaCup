package com.example.practicacup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

import Forma.Circulo;
import Forma.Cuadrado;
import Forma.Error;
import Forma.ErrorLexico;
import Forma.Formas;
import Forma.Linea;
import Forma.Operador;
import Forma.Poligono;
import Forma.Rectangulo;

public class Reportes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        int contadorCir = 0, contadorCua = 0, contadorRec = 0, contadorLin = 0, contadorPol = 0, contadorAzul = 0, contadorRojo = 0,
                contadorVerde = 0, contadorAmarillo = 0, contadorNaranja = 0, contadorMorado = 0, contadorCafe = 0, contadorNegro = 0;
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Bundle_Array");
        ArrayList<Operador> operador = (ArrayList<Operador>) bundle.getSerializable("operadores");
        ArrayList<Formas> formas = (ArrayList<Formas>) bundle.getSerializable("formas");
        TableLayout tabla = (TableLayout) findViewById(R.id.tabla);
        TextView t8 = (TextView)  findViewById(R.id.textView8);
        TextView t9 = (TextView)  findViewById(R.id.textView9);
        TextView t10 = (TextView)  findViewById(R.id.textView10);
        TextView t11 = (TextView)  findViewById(R.id.textView11);
        TextView objeto = new TextView(this);
        TextView cantidad = new TextView(this);

        for (Formas formaElegida : formas) {
            if (formaElegida.getForma().equals("circulo")) {
                contadorCir++;
            } else if (formaElegida.getForma().equals("cuadrado")) {
                contadorCua++;
            } else if (formaElegida.getForma().equals("rectangulo")) {
                contadorRec++;
            } else if (formaElegida.getForma().equals("linea")) {
                contadorLin++;
            } else if (formaElegida.getForma().equals("poligono")) {
                contadorPol++;
            }
            if (formaElegida.getColor().equals("azul")) {
                contadorAzul++;
            } else if (formaElegida.getColor().equals("rojo")) {
                contadorRojo++;
            } else if (formaElegida.getColor().equals("verde")) {
                contadorVerde++;
            } else if (formaElegida.getColor().equals("amarillo")) {
                contadorAmarillo++;
            } else if (formaElegida.getColor().equals("morado")) {
                contadorMorado++;
            } else if (formaElegida.getColor().equals("naranja")) {
                contadorNaranja++;
            } else if (formaElegida.getColor().equals("cafe")) {
                contadorCafe++;
            } else if (formaElegida.getColor().equals("negro")) {
                contadorNegro++;
            }
        }
        if(operador.size()==0){
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
        }
        for (int i = 0; i < operador.size(); i++) {
            TableRow row = new TableRow(this);
            TextView tvoperador = new TextView(this);
            TextView tvlinea = new TextView(this);
            TextView tvcolumna = new TextView(this);
            TextView tvocurrencia = new TextView(this);
            tvoperador.setText(operador.get(i).getLexema());
            tvlinea.setText(String.valueOf(operador.get(i).getLinea()));
            tvcolumna.setText(String.valueOf(operador.get(i).getColumna()));
            tvocurrencia.setText(operador.get(i).getOcurrencia());
            tvoperador.setPadding(30, 50, 70, 50);
            tvlinea.setPadding(50, 50, 50, 50);
            tvcolumna.setPadding(50, 50, 10, 50);
            tvocurrencia.setPadding(30, 50, 30, 50);
            row.addView(tvoperador);
            row.addView(tvlinea);
            row.addView(tvcolumna);
            row.addView(tvocurrencia);
            tabla.addView(row);
        }
        if (contadorCir > 0 || contadorCua > 0 || contadorLin > 0 || contadorRec > 0 || contadorPol > 0) {
            TableRow row = new TableRow(this);
            objeto.setText("Objeto");
            cantidad.setText("Cantidad");
            objeto.setTextColor(Color.parseColor("#000000"));
            cantidad.setTextColor(Color.parseColor("#000000"));
            row.addView(objeto);
            row.addView(cantidad);
            tabla.addView(row);
        }
        if (contadorCir > 0) {
            addRowObjeto(contadorCir, "Circulo");
        }
        if (contadorRec > 0) {
            addRowObjeto(contadorRec, "Rectangulo");
        }
        if (contadorCua > 0) {
            addRowObjeto(contadorCua, "Cuadrado");
        }
        if (contadorLin > 0) {
            addRowObjeto(contadorLin, "Linea");
        }
        if (contadorPol > 0) {
            addRowObjeto(contadorPol, "Poligono");
        }
        if (contadorAzul > 0 || contadorRojo > 0 || contadorVerde > 0 || contadorAmarillo > 0 || contadorNaranja > 0 || contadorMorado > 0 || contadorCafe > 0|| contadorNegro > 0) {
            TableRow row = new TableRow(this);
            objeto = new TextView(this);
            cantidad = new TextView(this);
            objeto.setText("Color");
            cantidad.setText("Cantidad");
            objeto.setTextColor(Color.parseColor("#000000"));
            cantidad.setTextColor(Color.parseColor("#000000"));
            row.addView(objeto);
            row.addView(cantidad);
            tabla.addView(row);
        }
        if (contadorAzul > 0) {
            addRowObjeto(contadorAzul, "Azul");
        }
        if (contadorRojo > 0) {
            addRowObjeto(contadorRojo, "Rojo");
        }
        if (contadorVerde > 0) {
            addRowObjeto(contadorVerde, "Verde");
        }
        if (contadorAmarillo > 0) {
            addRowObjeto(contadorAmarillo, "Amarillo");
        }
        if (contadorNaranja > 0) {
            addRowObjeto(contadorNaranja, "Naranja");
        }
        if (contadorMorado > 0) {
            addRowObjeto(contadorMorado, "Morado");
        }
        if (contadorCafe > 0) {
            addRowObjeto(contadorCafe, "Cafe");
        }
        if (contadorNegro > 0) {
            addRowObjeto(contadorNegro, "Negro");
        }
    }

    public void addRowObjeto(int contador, String figura) {
        TableLayout tabla = (TableLayout) findViewById(R.id.tabla);
        TableRow row = new TableRow(this);
        TextView objeto = new TextView(this);
        TextView cantidad = new TextView(this);
        objeto.setPadding(30, 50, 70, 50);
        cantidad.setPadding(50, 50, 50, 50);
        objeto.setText(figura);
        cantidad.setText(String.valueOf(contador));
        row.addView(objeto);
        row.addView(cantidad);
        tabla.addView(row);
    }
}