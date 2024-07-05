package com.example.mongoExample.prodotti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdottoService {

    @Autowired
    private ProdottoRepository prodottoRepository;

    public Prodotto saveProdotto(Prodotto prodotto) {
        return prodottoRepository.insert(prodotto);
    }

}
