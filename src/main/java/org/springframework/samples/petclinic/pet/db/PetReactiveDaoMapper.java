package org.springframework.samples.petclinic.pet.db;

import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.DaoKeyspace;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

/**
 * DataStax Java driver mapper for Pet. The mapper generates the 
 * boilerplate to execute queries and convert the results into 
 * application-level objects.
 * 
 * Documentation of the mapper:
 * - {@link https://docs.datastax.com/en/developer/java-driver/4.9/manual/mapper/}
 */
@Mapper
public interface PetReactiveDaoMapper {
    
    @DaoFactory
    PetReactiveDao petDao(@DaoKeyspace CqlIdentifier keyspace);
    
}
