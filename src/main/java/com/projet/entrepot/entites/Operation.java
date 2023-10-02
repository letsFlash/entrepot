package com.projet.entrepot.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "Operation")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_operat")
    private int idOperat;

    @Column(name = "type_operat")
    private String typeOperat;

    @ManyToOne
    @JoinColumn(name = "id_facture")
    private Facture facture;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    // Getters and setters
}
