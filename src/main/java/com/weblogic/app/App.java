package com.weblogic.app;
import java.util.logging.Level; 
import java.util.logging.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger 
            = Logger.getLogger( 
                GFG.class.getName());
        logger.log(Level.INFO,"The Title is");
    }
}
