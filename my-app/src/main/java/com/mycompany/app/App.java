package com.mycompany.app;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Resolve DNS!
 */
public class App 
{
    public static void main( String[] args ) throws UnknownHostException
    {
    	 long now = System.currentTimeMillis();

         InetAddress addr = InetAddress.getByName("www.google.com");

         System.out.println(addr.getHostName());
         System.out.println(addr.getHostAddress());


         long after = System.currentTimeMillis();

         System.out.println((after - now) + " ms");
    }
}
