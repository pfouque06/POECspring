package org.eclipse.springtp06thymeleaf.repository;

import java.util.List;
import java.util.Optional;

import org.eclipse.springtp06thymeleaf.model.*;
import org.springframework.data.jpa.repository.*;

public interface PersonneRepository extends JpaRepository <Personne, Long> {

	List<Personne> findByNomAndPrenom(String nom, String prenom);
	List<Personne> findByNom(String nom);
	List<Personne> findByPrenom(String prenom);
}
