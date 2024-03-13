package com.example.tienda.modelos;
import jakarta.persistence.*;

@Entity
@Table(name = "Tipo Prenda" )
public class tipoPrenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String NombrePrenda;
}

