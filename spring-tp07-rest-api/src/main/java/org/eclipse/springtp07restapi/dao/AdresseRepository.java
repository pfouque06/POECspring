package org.eclipse.springtp07restapi.dao;

import org.eclipse.springtp07restapi.model.*;
import org.springframework.data.jpa.repository.*;

public interface AdresseRepository extends JpaRepository <Adresse, Long> {

//	List<Adresse> findByNomAndPrenom(String nom, String prenom);
//	List<Adresse> findByNom(String nom);
//	List<Adresse> findByPrenom(String prenom);
}
