
package com.iman;

import java.util.List;

import com.iman.domain.Compte;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "compte", path = "compte")
public interface CompteDao extends PagingAndSortingRepository<Compte, Long>{
	List<Compte>  findByPrenomCompte(@Param("prenomcompte") String prenom);
	Compte findByLoginCompteAndPasswordCompte (@Param("logincompte") String loginCompte, @Param("passwordcompte") String passwordCompte);
	Compte findByIdCompte(long id);
}