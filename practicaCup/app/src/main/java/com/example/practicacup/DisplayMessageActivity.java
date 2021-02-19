package com.example.practicacup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import Forma.Circulo;
import Forma.Cuadrado;
import Forma.Formas;
import Forma.Linea;
import Forma.Poligono;
import Forma.Rectangulo;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vista vista = new Vista(this);
        setContentView(vista);


    }

    class Vista extends View {
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Bundle_Array");
        ArrayList<Formas> formas = (ArrayList<Formas>) bundle.getSerializable("formas");

        public Vista(Context context) {
            super(context);
        }

        public void onDraw(Canvas canvas) {
            //canvas.drawRGB(255, 255, 0);
            for (Formas formaElegida : formas) {
                Paint paint = establecerColor(formaElegida.getColor());
                if (formaElegida.getForma().equals("circulo")) {
                    paint.setStyle(Paint.Style.FILL);
                    Circulo circulo = (Circulo) formaElegida;
                    canvas.drawCircle(formaElegida.getPosX(), formaElegida.getPosY(), circulo.getRadio(), paint);
                } else if (formaElegida.getForma().equals("cuadrado")) {
                    paint.setStyle(Paint.Style.FILL);
                    Cuadrado cuadrado = (Cuadrado) formaElegida;
                    Path path = new Path();
                    path.moveTo(cuadrado.getPosX(), cuadrado.getPosY());
                    path.lineTo(cuadrado.getPosX() + cuadrado.getTamanioLado(), cuadrado.getPosY());
                    path.lineTo(cuadrado.getPosX() + cuadrado.getTamanioLado(), cuadrado.getPosY() + cuadrado.getTamanioLado());
                    path.lineTo(cuadrado.getPosX(), cuadrado.getPosY() + cuadrado.getTamanioLado());
                    canvas.drawPath(path, paint);
                } else if (formaElegida.getForma().equals("rectangulo")) {
                    paint.setStyle(Paint.Style.FILL);
                    Rectangulo rectangulo = (Rectangulo) formaElegida;
                    Path path = new Path();
                    path.moveTo(rectangulo.getPosX(), rectangulo.getPosY());
                    path.lineTo(rectangulo.getPosX() + rectangulo.getAncho(), rectangulo.getPosY());
                    path.lineTo(rectangulo.getPosX() + rectangulo.getAncho(), rectangulo.getPosY() + rectangulo.getAlto());
                    path.lineTo(rectangulo.getPosX(), rectangulo.getPosY() + rectangulo.getAlto());
                    canvas.drawPath(path, paint);
                } else if (formaElegida.getForma().equals("linea")) {
                    Linea linea = (Linea) formaElegida;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(5);
                    canvas.drawLine(linea.getPosX(), linea.getPosY(), linea.getPosX1(), linea.getPosY1(), paint);
                } else if (formaElegida.getForma().equals("poligono")) {
                    Poligono poligo = (Poligono) formaElegida;
                    paint.setStyle(Paint.Style.FILL);
                    Path path = new Path();

                    for(int a = 0; a < 2*Math.PI; a+=.02){
                        double r=250*Math.cos(Math.PI/poligo.getCantLados())
                        double x = 250*Math.cos(a);
                        double y = 250*Math.sin(a);

                        canvas.drawLine(250, 250,Float.parseFloat(String.valueOf(x)),Float.parseFloat(String.valueOf(y)), paint);
                        System.out.println(String.valueOf(a) + "FORMA: " +String.valueOf(x) + " " + String.valueOf(y));
                    }
                    for(int i = 0; i <= poligo.getCantLados(); i++){
                        double x = 600 * Math.cos(2*Math.PI*(i) + (poligo.getCantLados()-2)*180) + 300;
                        double  y = 600 * Math.sin(2*Math.PI*(i) + (poligo.getCantLados()-2)*180) + 300;


                    }

                }

            }

        }

        public Paint establecerColor(String color) {
            Paint paint = new Paint();
            if (color.equals("azul")) {
                paint.setColor(Color.BLUE);
                return paint;
            }else if(color.equals("rojo")){
                paint.setColor(Color.RED);
                return paint;
            }else if(color.equals("verde")){
                paint.setColor(Color.GREEN);
                return paint;
            }else if(color.equals("amarillo")){
                paint.setColor(Color.YELLOW);
                return paint;
            }else if(color.equals("morado")){
                paint.setColor(Color.argb(255,87,35,100));
                return paint;
            }else if(color.equals("naranja")){
                paint.setColor(Color.argb(255,239,127,26));
                return paint;
            }else if(color.equals("cafe")){
                paint.setColor(Color.argb(255,128,64,0));
                return paint;
            }else if(color.equals("negro")){
                paint.setColor(Color.BLACK);
                return paint;
            }
            return paint;
        }
    }
}