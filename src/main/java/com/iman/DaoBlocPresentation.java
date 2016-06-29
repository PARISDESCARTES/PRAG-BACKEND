package com.iman;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.iman.domain.BlocPresentation;

public interface DaoBlocPresentation extends PagingAndSortingRepository<BlocPresentation, Long> {
	List<BlocPresentation> findAll();
	
}
