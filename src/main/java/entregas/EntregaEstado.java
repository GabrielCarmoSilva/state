package entregas;

public abstract class EntregaEstado {
    public abstract String getEstado();

    public boolean pagar(Entrega entrega) {
        return false;
    }

    public boolean separar(Entrega entrega) {
        return false;
    }

    public boolean enviar(Entrega entrega) {
        return false;
    }

    public boolean sairParaEntrega(Entrega entrega) {
        return false;
    }

    public boolean entregar(Entrega entrega) {
        return false;
    }

    public boolean marcarComoAtrasado(Entrega entrega) {
        return false;
    }

    public boolean devolver(Entrega entrega) {
        return false;
    }

    public boolean cancelar(Entrega entrega) {
        return false;
    }
}
