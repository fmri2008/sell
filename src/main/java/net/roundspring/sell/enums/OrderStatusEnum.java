package net.roundspring.sell.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {
    NEW(0, "new order"),
    FINISHED(1, "fulfilled order"),
    CANCEL(2, "cancelled order")
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
