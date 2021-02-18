package com.valuemomentum.training.bank.HelloMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "******Banking Application************" );
        
        Customer obj = new Customer(101,"Utkarsh",10000);
        obj.display();
    }
}
