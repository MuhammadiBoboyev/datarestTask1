package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Client;
import uz.pdp.task1.entity.Currency;
import uz.pdp.task1.entity.Output;
import uz.pdp.task1.entity.WareHouse;

import java.time.LocalDate;

@Projection(types = Output.class)
public interface CustomOutput {
    int getId();

    LocalDate getDate();

    WareHouse getWareHouse();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();

    Client getClient();
}
