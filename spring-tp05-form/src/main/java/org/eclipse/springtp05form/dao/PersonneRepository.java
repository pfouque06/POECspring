package org.eclipse.springtp05form.dao;

import java.util.List;

import org.eclipse.springtp05form.model.*;
import org.springframework.data.jpa.repository.*;

public interface PersonneRepository extends JpaRepository <Personne, Long> {

	List<Personne> findByNomAndPrenom(String nom, String prenom);
	List<Personne> findByNom(String nom);
	List<Personne> findByPrenom(String prenom);
}
