package com.projet.entrepot.entites;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "Commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commande")
    private int idCommande;

    @Column(name = "num_commande")
    private String numCommande;

    @Column(name = "date_commande")
    private Date dateCommande;

    private String type;

    @ManyToOne
    @JoinColumn(name = "id_facture")
    private Facture facture;

    @ManyToOne
    @JoinColumn(name = "id_operat")
    private Operation operation;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

}
