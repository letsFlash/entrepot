package com.projet.entrepot.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "Livraison")
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_livraison")
    private int idLivraison;

    @ManyToOne
    @JoinColumn(name = "id_adresse")
    private Adresse adresse;

    private int numero;
    private String rue;

    @Column(name = "code_postale")
    private String codePostale;
    private String pays;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    // Getters and setters
}
