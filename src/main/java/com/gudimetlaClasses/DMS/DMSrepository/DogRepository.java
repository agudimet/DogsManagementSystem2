package com.gudimetlaClasses.DMS.DMSrepository;
/**
*
* @author Anuradha Gudimetla S558919
*/
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gudimetlaClasses.DMS.Models.Dog;

import java.util.List;



@Repository
public interface DogRepository extends CrudRepository<com.gudimetlaClasses.DMS.Models.Dog,Integer>{

	List<Dog> findByName(String name);
}
