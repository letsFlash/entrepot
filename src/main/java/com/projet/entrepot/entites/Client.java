package com.projet.entrepot.entites;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private int idClient;

    private String nom;
    private String prenom;
    private String tel;
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_adresse")
    private Adresse adresse;

}
