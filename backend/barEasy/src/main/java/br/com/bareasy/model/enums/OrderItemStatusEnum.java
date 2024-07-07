package br.com.bareasy.model.enums;

public enum OrderItemStatusEnum {

    /**
     * (Pendente): O pedido foi recebido pelo sistema, mas ainda não foi processado.
     */
    PENDING,
    /**
     * (Em Preparação): O pedido está a ser preparado.
     */
    PREPARATION,
    /**
     * (Cancelado): O pedido foi cancelado pelo cliente ou pelo bar.
     */
    CANCELED,
    /**
     * (Entregue): O pedido foi entregue na mesa do cliente.
     */
    DELIVERED,
    /**
     * (Rejeitado): O pedido foi rejeitado pelo cliente.
     */
    REJECTED,
    /**
     * (Completo): Fluxo completo.
     */
    COMPLETED,
    /**
     * (Falho) com erro em algum momento.
     */
    FAILED,

}
