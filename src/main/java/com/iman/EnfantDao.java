package com.iman;

import com.iman.domain.Enfant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Sébastien on 27/06/2016.
 */
@Component
@RepositoryRestResource(collectionResourceRel = "enfant", path = "enfant")
public interface EnfantDao extends PagingAndSortingRepository<Enfant,Long> {
    List<Enfant> findAll();



}