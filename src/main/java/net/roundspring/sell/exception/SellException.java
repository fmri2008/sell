package net.roundspring.sell.exception;

import net.roundspring.sell.enums.ResultEnum;

public class SellException extends RuntimeException {

    private Integer code;
    private String msg;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }
}
