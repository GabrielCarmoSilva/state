package entregas;

public class EntregaEstadoSeparado extends EntregaEstado {
    private EntregaEstadoSeparado() {};
    private static EntregaEstadoSeparado instance = new EntregaEstadoSeparado();
    public static EntregaEstadoSeparado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Separado";
    }

    public boolean enviar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoEnviado.getInstance());
        return true;
    }

    public boolean cancelar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        return true;
    }
}
