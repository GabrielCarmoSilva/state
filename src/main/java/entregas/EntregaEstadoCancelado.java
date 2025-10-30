package entregas;

public class EntregaEstadoCancelado extends EntregaEstado {
    private EntregaEstadoCancelado() {};
    private static EntregaEstadoCancelado instance = new EntregaEstadoCancelado();
    public static EntregaEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }
}
