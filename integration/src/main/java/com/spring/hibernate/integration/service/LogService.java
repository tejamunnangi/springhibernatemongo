package com.spring.hibernate.integration.service;

import org.bson.types.ObjectId;

/**
 * Used for logging data.
 * 
 * @author pascal
 */
public interface LogService<T> {

    public ObjectId add(T log);
    public T get(ObjectId id);  
  
}