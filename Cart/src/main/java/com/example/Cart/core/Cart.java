package com.example.Cart.core;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Account")
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String email;
    private String password;
}
