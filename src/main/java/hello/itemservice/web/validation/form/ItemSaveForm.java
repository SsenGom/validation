package hello.itemservice.web.validation.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ItemSaveForm {
    @NotBlank (message = "공백x")
    private String itemName;
    @NotNull
    @Range (min = 1000, max = 10000000)
    private Integer price;

    @NotNull
    @Max(value = 999)
    private Integer quantity;
}
