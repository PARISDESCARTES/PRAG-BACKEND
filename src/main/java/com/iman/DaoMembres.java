package com.iman;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.iman.domain.MembreAssociation;

public interface DaoMembres extends PagingAndSortingRepository<MembreAssociation, Long>  {
	List<MembreAssociation> findAll();
	
}
