package com.projet.entrepot.entites;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adresse")
    private int idAdresse;

    private int numero;
    private String rue;

    @Column(name = "code_postale")
    private String codePostale;

    private String pays;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

}
