package com.spring.hibernate.integration.service;


import org.apache.log4j.Logger;
import org.bson.types.ObjectId;

import com.spring.hibernate.integration.LogItem;
import com.spring.hibernate.integration.dao.BaseDao;

/**
  */
public class MongoDBLoggerServiceImpl implements LogService<LogItem> {

    private static final Logger logger = Logger.getLogger(MongoDBLoggerServiceImpl.class);
    private BaseDao dao;

    public BaseDao getDao() {
        return dao;
    }

    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    public ObjectId add(LogItem log) {
        logger.debug("Adding a new LogItem instance");
        return dao.insert(log);
    }

    public LogItem get(ObjectId id) {
        return (LogItem) dao.selectByPk(id);
    }
}
