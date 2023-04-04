package enums;

public enum TipoFuncionario {
    GESTOR(0),
    VETERINARIO(1);

    private final int valor;

    TipoFuncionario(int valorOpcao) {
        valor = valorOpcao;
    }

    public int getValor() {
        return valor;
    }
}
