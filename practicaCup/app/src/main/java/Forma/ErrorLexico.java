package Forma;

import java.io.Serializable;

public class ErrorLexico extends Error implements Serializable {


    public ErrorLexico(String lexema, int linea, int columna, int tokenSiguiente) {
        super(lexema, linea, columna, tokenSiguiente);
    }
}
