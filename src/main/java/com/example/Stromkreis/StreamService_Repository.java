package com.example.Stromkreis;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "service", path = "service")
public interface StreamService_Repository extends PagingAndSortingRepository<StreamService, Long> {
	List<StreamService> findByName(@Param("name") String name);
}
