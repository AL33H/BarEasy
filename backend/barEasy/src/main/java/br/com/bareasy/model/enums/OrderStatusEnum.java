package br.com.bareasy.model.enums;

public enum OrderStatusEnum {
    /**
     * (Consumindo): Clientes consomem os itens pedidos.
     */
    CONSUMING {
        @Override
        public OrderStatusEnum next() {
            return PAYMENT_PENDING;
        }
    },
    /**
     * (Pagamento Pendente): O pedido foi concluído e está aguardando pagamento.
     */
    PAYMENT_PENDING {
        @Override
        public OrderStatusEnum next() {
            return PAYMENT_COMPLETED;
        }
    },
    /**
     * (Pagamento Concluído): O pagamento foi realizado, mas a mesa ainda está ocupada.
     */
    PAYMENT_COMPLETED {
        @Override
        public OrderStatusEnum next() {
            return FINALIZED;
        }
    },
    /**
     * (Finalizado): O pedido foi completamente pago e processado, a mesa está pronta para ser liberada.
     */
    FINALIZED {
        @Override
        public OrderStatusEnum next() {
            return FINALIZED;
        }
    };

    public abstract OrderStatusEnum next();
}
