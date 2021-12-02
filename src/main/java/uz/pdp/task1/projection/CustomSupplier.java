package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    int getId();

    String getName();

    boolean isActive();

    String getPhoneNumber();
}