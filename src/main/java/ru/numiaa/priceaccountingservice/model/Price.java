package ru.numiaa.priceaccountingservice.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name = "prices")
@Getter
@Setter
public class Price {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    private UUID id;
    @Column(name = "product_code")
    private String productCode;
    @Column(name = "price_number")
    private Integer priceNumber;
    @Column(name = "department")
    private Integer department;
    @Column(name = "date_begin")
    private Date dateBegin;
    @Column(name = "date_end")
    private Date dateEnd;
    @Column(name = "price_value")
    private BigDecimal priceValue;
}
