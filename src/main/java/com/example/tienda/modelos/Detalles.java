package com.example.tienda.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Detalles" )
public class Detalles {
    private String id;
    private Double costoTotal;

    private String cantidadProductos;

}
