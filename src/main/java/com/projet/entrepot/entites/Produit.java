package com.projet.entrepot.entites;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Produit")
@Data
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produit")
    private int idProduit;

    private String nom;
    private int quantite;
    private double poids;

    @ManyToOne
    @JoinColumn(name = "id_livraison")
    private Livraison livraison;

    @ManyToOne
    @JoinColumn(name = "id_adresse")
    private Adresse adresse;

    @ManyToOne
    @JoinColumn(name = "id_operat")
    private Operation operation;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @Column(name = "date_livraison")
    private Date dateLivraison;

}
