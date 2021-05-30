package net.roundspring.sell.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum {
    WAIT(0, "not paid"),
    SUCCESS(1, "paid")
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
