package com.user.usuarios.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id // Identifica el campo como llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generación del ID
    private Long id;

    @Column(nullable = false, length = 100) // Configuración de la columna
    private String nombre;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    // Getters y Setters
}

