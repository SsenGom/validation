package hello.itemservice.validation;

import hello.itemservice.domain.item.Item;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class BeanValidationTest {

    @Test
    void beanValidation(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validation =factory.getValidator();

        Item item = new Item();
        item.setItemName(" ");
        item.setQuantity(0);
        item.setQuantity(11111);

        Set<ConstraintViolation<Item>> violations = validation.validate(item);
        for (ConstraintViolation<Item> violation : violations){
            System.out.println("violation = " + violation);
            System.out.println("violation.getMessage() = " + violation.getMessage());
        }
    }
}
