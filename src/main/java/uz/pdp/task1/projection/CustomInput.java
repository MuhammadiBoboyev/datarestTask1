package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Currency;
import uz.pdp.task1.entity.Input;
import uz.pdp.task1.entity.Supplier;
import uz.pdp.task1.entity.WareHouse;

import java.util.Date;

@Projection(types = Input.class)
public interface CustomInput {
    int getId();

    Date getDate();

    WareHouse getWareHouse();

    Supplier getSupplier();

    Currency GetCurrency();

    String getFactureNumber();

    String getCode();
}
