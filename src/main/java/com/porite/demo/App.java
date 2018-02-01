package com.porite.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
private static final Logger logger = LoggerFactory.getLogger(App.class);
    
    public static void main(String[] args) {
        Message message = new Message();
        
        logger.debug("Starting debugging");
        
        message.sayHello();
        
        logger.debug("Ending debugging");
    }
}
