package uz.pdp.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.task1.entity.template.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Supplier extends AbstractEntity {
    @Column(nullable = false, unique = true)
    private String phoneNumber;
}
