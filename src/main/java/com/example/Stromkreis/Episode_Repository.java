package com.example.Stromkreis;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "episodes", path = "episodes")
public interface Episode_Repository extends PagingAndSortingRepository<Episode, Long> {

	// Kann leer bleiben oder weitere Zugriffsmethoden definieren
	List<Episode> findByName(@Param("name") String name);
}
