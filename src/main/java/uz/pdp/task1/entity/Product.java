package uz.pdp.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.task1.entity.Category;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = false)
    private Category category;

    @OneToOne
    private Attachment attachment;

    @ManyToOne
    private Measurement measurement;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
}
