package com.bibliotheque.service;

import com.bibliotheque.model.Bibliotheque;

import java.util.List;

public interface BibliothequeService {

    List<Bibliotheque> getAllBibliotheque();

    Bibliotheque createBibliotheque(Bibliotheque bibliotheque);

    Bibliotheque updateBibliotheque(long id, Bibliotheque bibliotheque);

    void deleteBibliotheque(long id);

    Bibliotheque getBibliothequeById(long id);
}
