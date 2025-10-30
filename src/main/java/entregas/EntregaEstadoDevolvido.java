package entregas;

public class EntregaEstadoDevolvido extends EntregaEstado {
    private EntregaEstadoDevolvido() {};
    private static EntregaEstadoDevolvido instance = new EntregaEstadoDevolvido();
    public static EntregaEstadoDevolvido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Devolvido";
    }
}
