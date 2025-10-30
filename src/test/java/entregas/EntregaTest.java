package entregas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntregaTest {
    Entrega entrega;

    @BeforeEach
    public void setUp() {
        entrega = new Entrega();
    }

    // Entrega paga

    @Test
    public void naoDevePagarEntregaPaga() {
        entrega.setEstado(EntregaEstadoPago.getInstance());
        assertFalse(entrega.pagar());
    }

    @Test
    public void deveSepararEntregaPaga() {
        entrega.setEstado(EntregaEstadoPago.getInstance());
        assertTrue(entrega.separar());
        assertEquals(EntregaEstadoSeparado.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveEnviarEntregaPaga() {
        entrega.setEstado(EntregaEstadoPago.getInstance());
        assertFalse(entrega.enviar());
    }

    @Test
    public void naoDeveSairParaEntregaEntregaPaga() {
        entrega.setEstado(EntregaEstadoPago.getInstance());
        assertFalse(entrega.sairParaEntrega());
    }

    @Test
    public void naoDeveEntregarEntregaPaga() {
        entrega.setEstado(EntregaEstadoPago.getInstance());
        assertFalse(entrega.entregar());
    }

    @Test
    public void naoDeveMarcarComoAtrasadoEntregaPaga() {
        entrega.setEstado(EntregaEstadoPago.getInstance());
        assertFalse(entrega.marcarComoAtrasado());
    }

    @Test
    public void naoDeveDevolverEntregaPaga() {
        entrega.setEstado(EntregaEstadoPago.getInstance());
        assertFalse(entrega.devolver());
    }

    @Test
    public void deveCancelarEntregaPaga() {
        entrega.setEstado(EntregaEstadoPago.getInstance());
        assertTrue(entrega.cancelar());
        assertEquals(EntregaEstadoCancelado.getInstance(), entrega.getEstado());
    }

    // Entrega separada

    @Test
    public void naoDevePagarEntregaSeparada() {
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        assertFalse(entrega.pagar());
    }

    @Test
    public void naoDeveSepararEntregaSeparada() {
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        assertFalse(entrega.separar());
    }

    @Test
    public void deveEnviarEntregaSeparada() {
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        assertTrue(entrega.enviar());
        assertEquals(EntregaEstadoEnviado.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveSairParaEntregaEntregaSeparada() {
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        assertFalse(entrega.sairParaEntrega());
    }

    @Test
    public void naoDeveEntregarEntregaSeparada() {
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        assertFalse(entrega.entregar());
    }

    @Test
    public void naoDeveMarcarComoAtrasadoEntregaSeparada() {
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        assertFalse(entrega.marcarComoAtrasado());
    }

    @Test
    public void naoDeveDevolverEntregaSeparada() {
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        assertFalse(entrega.devolver());
    }

    @Test
    public void deveCancelarEntregaSeparada() {
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        assertTrue(entrega.cancelar());
        assertEquals(EntregaEstadoCancelado.getInstance(), entrega.getEstado());
    }

    // Entrega enviada

    @Test
    public void naoDevePagarEntregaEnviada() {
        entrega.setEstado(EntregaEstadoEnviado.getInstance());
        assertFalse(entrega.pagar());
    }

    @Test
    public void naoDeveSepararEntregaEnviada() {
        entrega.setEstado(EntregaEstadoEnviado.getInstance());
        assertFalse(entrega.separar());
    }

    @Test
    public void naoDeveEnviarEntregaEnviada() {
        entrega.setEstado(EntregaEstadoEnviado.getInstance());
        assertFalse(entrega.enviar());
    }

    @Test
    public void deveSairParaEntregaEntregaEnviada() {
        entrega.setEstado(EntregaEstadoEnviado.getInstance());
        assertTrue(entrega.sairParaEntrega());
        assertEquals(EntregaEstadoSaiuParaEntrega.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveEntregarEntregaEnviada() {
        entrega.setEstado(EntregaEstadoEnviado.getInstance());
        assertFalse(entrega.entregar());
    }

    @Test
    public void deveMarcarComoAtrasadoEntregaEnviada() {
        entrega.setEstado(EntregaEstadoEnviado.getInstance());
        assertTrue(entrega.marcarComoAtrasado());
        assertEquals(EntregaEstadoAtrasado.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveDevolverEntregaEnviada() {
        entrega.setEstado(EntregaEstadoEnviado.getInstance());
        assertFalse(entrega.devolver());
    }

    @Test
    public void deveCancelarEntregaEnviada() {
        entrega.setEstado(EntregaEstadoEnviado.getInstance());
        assertTrue(entrega.cancelar());
        assertEquals(EntregaEstadoCancelado.getInstance(), entrega.getEstado());
    }

    // Entrega saiu

    @Test
    public void naoDevePagarEntregaQueSaiu() {
        entrega.setEstado(EntregaEstadoSaiuParaEntrega.getInstance());
        assertFalse(entrega.pagar());
    }

    @Test
    public void naoDeveSepararEntregaQueSaiu() {
        entrega.setEstado(EntregaEstadoSaiuParaEntrega.getInstance());
        assertFalse(entrega.separar());
    }

    @Test
    public void naoDeveEnviarEntregaQueSaiu() {
        entrega.setEstado(EntregaEstadoSaiuParaEntrega.getInstance());
        assertFalse(entrega.enviar());
    }

    @Test
    public void naoDeveSairParaEntregaEntregaQueSaiu() {
        entrega.setEstado(EntregaEstadoSaiuParaEntrega.getInstance());
        assertFalse(entrega.sairParaEntrega());
    }

    @Test
    public void naoDeveEntregarEntregaQueSaiu() {
        entrega.setEstado(EntregaEstadoSaiuParaEntrega.getInstance());
        assertTrue(entrega.entregar());
        assertEquals(EntregaEstadoEntregue.getInstance(), entrega.getEstado());
    }

    @Test
    public void deveMarcarComoAtrasadoEntregaQueSaiu() {
        entrega.setEstado(EntregaEstadoSaiuParaEntrega.getInstance());
        assertTrue(entrega.marcarComoAtrasado());
        assertEquals(EntregaEstadoAtrasado.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveDevolverEntregaQueSaiu() {
        entrega.setEstado(EntregaEstadoSaiuParaEntrega.getInstance());
        assertFalse(entrega.devolver());
    }

    @Test
    public void deveCancelarEntregaQueSaiu() {
        entrega.setEstado(EntregaEstadoSaiuParaEntrega.getInstance());
        assertTrue(entrega.cancelar());
        assertEquals(EntregaEstadoCancelado.getInstance(), entrega.getEstado());
    }

    // Entrega entregue

    @Test
    public void naoDevePagarEntregaEntregue() {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertFalse(entrega.pagar());
    }

    @Test
    public void naoDeveSepararEntregaEntregue() {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertFalse(entrega.separar());
    }

    @Test
    public void naoDeveEnviarEntregaEntregue() {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertFalse(entrega.enviar());
    }

    @Test
    public void naoDeveSairParaEntregaEntregaEntregue() {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertFalse(entrega.sairParaEntrega());
    }

    @Test
    public void naoDeveEntregarEntregaEntregue() {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertFalse(entrega.entregar());
    }

    @Test
    public void naoDeveMarcarComoAtrasadoEntregaEntregue() {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertFalse(entrega.marcarComoAtrasado());
    }

    @Test
    public void deveDevolverEntregaEntregue() {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertTrue(entrega.devolver());
        assertEquals(EntregaEstadoDevolvido.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveCancelarEntregaEntregue() {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertFalse(entrega.cancelar());
    }

    // Entrega atrasada

    @Test
    public void naoDevePagarEntregaAtrasado() {
        entrega.setEstado(EntregaEstadoAtrasado.getInstance());
        assertFalse(entrega.pagar());
    }

    @Test
    public void naoDeveSepararEntregaAtrasado() {
        entrega.setEstado(EntregaEstadoAtrasado.getInstance());
        assertFalse(entrega.separar());
    }

    @Test
    public void naoDeveEnviarEntregaAtrasado() {
        entrega.setEstado(EntregaEstadoAtrasado.getInstance());
        assertFalse(entrega.enviar());
    }

    @Test
    public void naoDeveSairParaEntregaEntregaAtrasado() {
        entrega.setEstado(EntregaEstadoAtrasado.getInstance());
        assertFalse(entrega.sairParaEntrega());
    }

    @Test
    public void deveEntregarEntregaAtrasado() {
        entrega.setEstado(EntregaEstadoAtrasado.getInstance());
        assertTrue(entrega.entregar());
        assertEquals(EntregaEstadoEntregue.getInstance(), entrega.getEstado());
    }

    @Test
    public void naoDeveMarcarComoAtrasadoEntregaAtrasado() {
        entrega.setEstado(EntregaEstadoAtrasado.getInstance());
        assertFalse(entrega.marcarComoAtrasado());
    }

    @Test
    public void naoDeveDevolverEntregaAtrasado() {
        entrega.setEstado(EntregaEstadoAtrasado.getInstance());
        assertFalse(entrega.devolver());
    }

    @Test
    public void deveCancelarEntregaAtrasado() {
        entrega.setEstado(EntregaEstadoAtrasado.getInstance());
        assertTrue(entrega.cancelar());
        assertEquals(EntregaEstadoCancelado.getInstance(), entrega.getEstado());
    }

    // Entrega devolvida

    @Test
    public void naoDevePagarEntregaDevolvido() {
        entrega.setEstado(EntregaEstadoDevolvido.getInstance());
        assertFalse(entrega.pagar());
    }

    @Test
    public void naoDeveSepararEntregaDevolvido() {
        entrega.setEstado(EntregaEstadoDevolvido.getInstance());
        assertFalse(entrega.separar());
    }

    @Test
    public void naoDeveEnviarEntregaDevolvido() {
        entrega.setEstado(EntregaEstadoDevolvido.getInstance());
        assertFalse(entrega.enviar());
    }

    @Test
    public void naoDeveSairParaEntregaEntregaDevolvido() {
        entrega.setEstado(EntregaEstadoDevolvido.getInstance());
        assertFalse(entrega.sairParaEntrega());
    }

    @Test
    public void naoDeveEntregarEntregaDevolvido() {
        entrega.setEstado(EntregaEstadoDevolvido.getInstance());
        assertFalse(entrega.entregar());
    }

    @Test
    public void naoDeveMarcarComoAtrasadoEntregaDevolvido() {
        entrega.setEstado(EntregaEstadoDevolvido.getInstance());
        assertFalse(entrega.marcarComoAtrasado());
    }

    @Test
    public void naoDeveDevolverEntregaDevolvido() {
        entrega.setEstado(EntregaEstadoDevolvido.getInstance());
        assertFalse(entrega.devolver());
    }

    @Test
    public void naoDeveCancelarEntregaDevolvido() {
        entrega.setEstado(EntregaEstadoDevolvido.getInstance());
        assertFalse(entrega.cancelar());
    }

    // Entrega cancelada

    @Test
    public void naoDevePagarEntregaCancelado() {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        assertFalse(entrega.pagar());
    }

    @Test
    public void naoDeveSepararEntregaCancelado() {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        assertFalse(entrega.separar());
    }

    @Test
    public void naoDeveEnviarEntregaCancelado() {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        assertFalse(entrega.enviar());
    }

    @Test
    public void naoDeveSairParaEntregaEntregaCancelado() {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        assertFalse(entrega.sairParaEntrega());
    }

    @Test
    public void naoDeveEntregarEntregaCancelado() {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        assertFalse(entrega.entregar());
    }

    @Test
    public void naoDeveMarcarComoAtrasadoEntregaCancelado() {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        assertFalse(entrega.marcarComoAtrasado());
    }

    @Test
    public void naoDeveDevolverEntregaCancelado() {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        assertFalse(entrega.devolver());
    }

    @Test
    public void naoDeveCancelarEntregaCancelado() {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        assertFalse(entrega.cancelar());
    }
}
