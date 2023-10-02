package com.projet.entrepot.entites;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "Facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int idFacture;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_produit")
    private Produit produit;

    private int duree;

    @Column(name = "date_facture")
    private Date dateFacture;

}
