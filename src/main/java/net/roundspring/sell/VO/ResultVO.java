package net.roundspring.sell.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ResultVO<T> {

    /** error code. */
    private Integer code;

    private String msg;
    private T data;
}
