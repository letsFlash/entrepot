package com.projet.entrepot.entites;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Stockage")
@Data
public class Stockage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stock")
    private int idStock;

    @ManyToOne
    @JoinColumn(name = "id_operat")
    private Operation operation;

    @ManyToOne
    @JoinColumn(name = "id_facture")
    private Facture facture;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    private int rang;
    private int etage;
    private String emplacement;

    @Column(name = "date_debut")
    private Date dateDebut;

    @Column(name = "date_fin")
    private Date dateFin;

}
