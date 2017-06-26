package com.spring.hibernate.integration.dao;


import org.bson.types.ObjectId;

/**
 * Base DAO for Hibernate Entities
 * @author pascal
 */
public interface BaseDao<T> {
  
    T selectByPk(ObjectId id);
    ObjectId insert(T entity);
}