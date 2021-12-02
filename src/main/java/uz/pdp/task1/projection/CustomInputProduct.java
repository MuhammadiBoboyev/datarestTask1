package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Input;
import uz.pdp.task1.entity.InputProduct;
import uz.pdp.task1.entity.Product;

import java.time.LocalDate;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    int getId();

    Product getProduct();

    int getAmount();

    double getPrice();

    LocalDate getExpireDate();

    Input getInput();
}
