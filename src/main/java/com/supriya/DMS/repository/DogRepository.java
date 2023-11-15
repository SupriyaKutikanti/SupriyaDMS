package com.supriya.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.supriya.DMS.Models.Dog;

/**
*
* @author Supriya Kutikanti
*/
public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
