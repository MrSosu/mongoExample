package com.example.mongoExample.categorie;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Categoria {

    private String id;
    private String nome;
    private String descrizione;

}
