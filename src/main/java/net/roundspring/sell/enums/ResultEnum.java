package net.roundspring.sell.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "parameter error"),
    CART_EMPTY(2, "cart is empty"),
    PRODUCT_NOT_EXIST(10, "product does not exist"),
    INSUFFICIENT_STOCK(11, "product does not have enough stock"),
    ORDER_NOT_EXIST(12, "order does not exist"),
    ORDER_DETAIL_NOT_EXIST(13, "order detail does not exist"),
    ORDER_STATUS_ERROR(14, "order status error"),
    ORDER_UPDATE_FAIL(15, "order update error"),
    ORDER_DETAIL_EMPTY(16, "order detail is empty"),
    ORDER_PAY_STATUS_ERROR(17, "pay status error"),
    OPENID_NOT_MATCH(18, "the order does not belong to the current buyer"),
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
