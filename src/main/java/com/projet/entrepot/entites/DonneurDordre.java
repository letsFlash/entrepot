package com.projet.entrepot.entites;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Donneur_dordre")
@Data
public class DonneurDordre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_donneur")
    private int idDonneur;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_commande")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "id_facture")
    private Facture facture;

    @ManyToOne
    @JoinColumn(name = "id_operation")
    private Operation operation;

    @ManyToOne
    @JoinColumn(name = "id_produit")
    private Produit produit;

    @Column(name = "nom_donneur")
    private String nomDonneur;

}
