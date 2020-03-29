package model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "`order`")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORD_ID")
    private int orderId;
    @Column(name = "ORD_DATE")
    private Date orderDate;
    @Column(name = "ORD_PRICE")
    private int orderPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORD_USR_ID", referencedColumnName = "USR_ID")
    private User orderUser;

}
