package Forma;

import java.io.Serializable;

public class Error implements Serializable {
    private String lexema;
    private int linea;
    private int columna;
    private int tokenSiguiente;

    public Error(String lexema, int linea, int columna, int tokenSiguiente) {
        this.lexema = lexema;
        this.linea = linea;
        this.columna = columna;
        this.tokenSiguiente = tokenSiguiente;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getTokenSiguiente() {
        return tokenSiguiente;
    }

    public void setTokenSiguiente(int tokenSiguiente) {
        this.tokenSiguiente = tokenSiguiente;
    }
}
