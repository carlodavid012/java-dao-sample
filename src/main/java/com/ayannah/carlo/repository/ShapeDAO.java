package com.ayannah.carlo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ayannah.carlo.entity.Shape;
import com.ayannah.carlo.entity.ShapeType;

public interface ShapeDAO extends CrudRepository <Shape, Long> {
	
	@Query(value="SELECT * from Shape where shape_type = :shapeType", nativeQuery = true)
	List<Shape> findByShape(@Param("shapeType") String shapeType);

}