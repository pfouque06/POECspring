package org.eclipse.springtp07restapi.dao;

import java.util.List;

import org.eclipse.springtp07restapi.model.*;
import org.springframework.data.jpa.repository.*;

public interface PersonneRepository extends JpaRepository <Personne, Long> {

	List<Personne> findByNomAndPrenom(String nom, String prenom);
	List<Personne> findByNom(String nom);
	List<Personne> findByPrenom(String prenom);
}
