package net.roundspring.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class OrderForm {

    @NotEmpty(message = "name is required")
    private String name;

    @NotEmpty(message = "phone is required")
    private String phone;

    @NotEmpty(message = "address is required")
    private String address;

    @NotEmpty(message = "openid is required")
    private String openid;

    @NotEmpty(message = "cart cannot be empty")
    private String items;
}
