package com.example.tienda.modelos;
import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
@Table (name= "usuarios")

public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Integer id;
        private String nombres;

        private String apellidos;
        private String cedula;
        private String correo;
        private Integer telefono;
        private String direccion;
        private String genero;
        private String medioDePago;
        private String pais;
        private String departamento;
        private String codigoPostal;




    }

