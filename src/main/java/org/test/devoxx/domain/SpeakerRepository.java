package org.test.devoxx.domain;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface SpeakerRepository extends CrudRepository<Speaker, Long> {

	@RestResource(path = "by-twitter")
	Speaker findByTwitter(@org.springframework.data.repository.query.Param("id") String twitter);

	Collection<Speaker> findBylastname(String lastName);

}
