package com.example.tienda.modelos;

import jakarta.persistence.*;

@Entity
@Table (name = "productos" )


public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private Integer cantidadBodega;
    private Double precioUnitario;
    private String descripcion;
    private String fotografia;
    private String talla;
}
