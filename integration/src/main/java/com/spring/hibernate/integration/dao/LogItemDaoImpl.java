package com.spring.hibernate.integration.dao;

import org.bson.types.ObjectId;

import com.spring.hibernate.integration.LogItem;

/**
 *
 * @author pascal
 */
public class LogItemDaoImpl extends AbstractBaseDao implements BaseDao<LogItem> {

    public LogItem selectByPk(ObjectId id) {
        return (LogItem)mongoTemplate.findById(id, LogItem.class);
    }

    public ObjectId insert(LogItem log) {
        mongoTemplate.insert(log);
        return log.getId();
    }
}