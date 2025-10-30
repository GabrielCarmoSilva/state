package entregas;

public class EntregaEstadoEntregue extends EntregaEstado {
    private EntregaEstadoEntregue() {};
    private static EntregaEstadoEntregue instance = new EntregaEstadoEntregue();
    public static EntregaEstadoEntregue getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Entregue";
    }

    public boolean devolver(Entrega entrega) {
        entrega.setEstado(EntregaEstadoDevolvido.getInstance());
        return true;
    }
}
