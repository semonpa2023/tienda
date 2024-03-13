package com.example.tienda.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "productos" )

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String NombrePed;
}
