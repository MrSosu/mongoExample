package com.example.mongoExample.prodotti;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prodotto {

    @Id
    private String id;
    private String nome;
    private String descrizione;
    private Integer quantita;

}