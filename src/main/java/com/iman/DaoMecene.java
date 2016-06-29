package com.iman;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.iman.domain.Mecene;

public interface DaoMecene extends PagingAndSortingRepository<Mecene, Long> {
	List<Mecene> findAll();
	Mecene findByIdMecene(long id);
}
