package com.codecool.brightxchange.model;

import com.codecool.brightxchange.springSecurity.entity.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Order {
    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )
    @JsonProperty("id")
    private Long id;
    @ManyToOne
    @JsonIgnore
    private Client client;
    @OneToMany
    private List<CartItem> products;
    @ManyToOne
    private Address address;
}
