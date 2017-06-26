package com.spring.hibernate.integration;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.hibernate.integration.service.MongoDBLoggerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        MongoDBLoggerServiceImpl mongoDBServiceImpl = (MongoDBLoggerServiceImpl) context.getBean("logService");
        LogItem item =  new LogItem();
        item.setMessage("Hello World");
        item.setTimestamp(new Date().toString());
        mongoDBServiceImpl.add(item);
    }
}
