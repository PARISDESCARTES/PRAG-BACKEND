package com.iman;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.iman.domain.Don;

public interface DaoDon extends PagingAndSortingRepository<Don, Long> {
	List<Don> findAll();
}
