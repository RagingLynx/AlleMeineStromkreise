package com.example.Stromkreis;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "series", path = "series")
public interface Series_Repository extends PagingAndSortingRepository<Series, Long>{
	List<Series> findByName(@Param("name") String name);

}
