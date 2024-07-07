package br.com.bareasy.model.enums;

public enum OrderStatusEnum {
    /**
     * (Consumindo): Clientes consomem os itens pedidos.
     */
    CONSUMING {
        @Override
        public void next() {
        }
    },
    /**
     * (Pagamento Pendente): O pedido foi concluído e está aguardando pagamento.
     */
    PAYMENT_PENDING {
        @Override
        public void next() {
        }
    },
    /**
     * (Pagamento Concluído): O pagamento foi realizado, mas a mesa ainda está ocupada.
     */
    PAYMENT_COMPLETED {
        @Override
        public void next() {
        }
    },
    /**
     * (Finalizado): O pedido foi completamente pago e processado, a mesa está pronta para ser liberada.
     */
    FINALIZED {
        @Override
        public void next() {
        }
    };

    public abstract void next();
}
