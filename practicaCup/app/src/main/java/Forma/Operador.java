package Forma;

public class Operador extends Error  {
    private String ocurrencia;

    public Operador(String lexema, int linea, int columna, int tokenSiguiente, String ocurrencia) {
        super(lexema, linea, columna, tokenSiguiente);
        this.ocurrencia = ocurrencia;
    }

    public String getOcurrencia() {
        return ocurrencia;
    }

    public void setOcurrencia(String ocurrencia) {
        this.ocurrencia = ocurrencia;
    }
}
