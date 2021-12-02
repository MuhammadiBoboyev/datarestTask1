package uz.pdp.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.task1.entity.WareHouse;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDate date;

    @ManyToOne
    private WareHouse wareHouse;

    @ManyToOne
    private Currency currency;

    @Column(nullable = false)
    private String factureNumber;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;

    @ManyToOne
    private Client client;
}
