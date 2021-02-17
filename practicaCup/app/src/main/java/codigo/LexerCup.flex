package codigo;
import java_cup.runtime.Symbol;
import java.io.Reader;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%unicode
%column
%public
SEPARADOR = \r|\n|\r\n
ESPACIO = {SEPARADOR} | [ \t\f]
D=[0-9]+
%{
    private Symbol symbol(int type, String lexeme) {
        return  new Symbol(type, new Token(lexeme, yyline + 1, yycolumn + 1));
      }
%}
%%


/* Espacios en blanco */
{ESPACIO} {}

/* Coma */
( "," ) {return symbol(sym.coma,  yytext());}

/* Reservada Anterior */
( anterior ) {return symbol(sym.anterior,  yytext());}

/* Reservada Objeto */
( objeto ) {return symbol(sym.objeto, yytext());}

/* Reservada Animar */
( animar ) {return  symbol(sym.animar, yytext());}

/* Reservada Graficar */
( graficar ) {return  symbol(sym.graficar, yytext());}


/* Forma Circulo */
( circulo) {return  symbol(sym.circulo, yytext());}

/* Forma Cuadrado */
(  cuadrado  ) {return  symbol(sym.cuadrado, yytext());}

/* Forma Rectangulo */
( rectangulo ) {return  symbol(sym.rectangulo, yytext());}

/* Forma Poligono */
( poligono ) {return  symbol(sym.poligono, yytext());}

/* Forma Linea */
( linea ) {return  symbol(sym.linea, yytext());}

/* Tipo animacion */
( curva ) {return  symbol(sym.curva, yytext());}

/* Salto de linea */
( "\n" ) {return  symbol(sym.SLinea, yytext());}

/* Colores */
( negro | azul | rojo | verde | amarillo | naranja | morado | cafe  ) {return  symbol(sym.T_color, yytext());}

/* Operador Suma */
( "+" ) {return  symbol(sym.Suma, yytext());}

/* Operador Resta */
( "-" ) {return  symbol(sym.Resta, yytext());}

/* Operador Multiplicacion */
( "*" ) {return  symbol(sym.Multiplicacion, yytext());}

/* Operador Division */
( "/" ) {return  symbol(sym.Division, yytext());}

/* Parentesis de apertura */
( "(" ) {return  symbol(sym.Parentesis_a, yytext());}

/* Parentesis de cierre */
( ")" ) {return  symbol(sym.Parentesis_c, yytext());}

/* Numero */
{D}+ {return  symbol(sym.Numero, yytext());}

/* Error de analisis */
 . {return  symbol(sym.error,  yytext());}
