package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.entity.WareHouse;

import java.util.List;

@Projection(types = User.class)
public interface CustomUser {
    int getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    boolean isActive();

    List<WareHouse> getWareHouses();
}
