public class MeioDePagamentoFactory {

    public static IMeioDePagamento createMeioDePagamento(TipoMeioDePagamento tipo) {

        if (tipo == null)
            return null;

        switch (tipo) {
            case CARTAO_CREDITO:
                return new CartaoCreditoSystem();
            case PIX:
                return new PixSystem();
            default:
                throw new IllegalArgumentException("Unknown channel " + tipo);
        }
    }

}
