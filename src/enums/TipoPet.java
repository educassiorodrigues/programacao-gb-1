package enums;

public enum TipoPet {
    AVE(0),
    PEIXE(1),
    MAMIFERO(2);

    private final int valor;

    TipoPet(int valorOpcao){
        valor = valorOpcao;
    }

    public int getValor(){
        return valor;
    }
}
