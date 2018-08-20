package com.ayannah.carlo.repository;

import org.springframework.data.repository.CrudRepository;

import com.ayannah.carlo.entity.Shape;

public interface ShapeDAO extends CrudRepository <Shape, Long> {


}