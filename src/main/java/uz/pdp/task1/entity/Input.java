package uz.pdp.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private Date date;

    @ManyToOne
    private WareHouse wareHouse;

    @ManyToOne
    private Supplier supplier;

    @ManyToOne
    private Currency currency;

    @Column(nullable = false)
    private String factureNumber;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
}
