/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sl2605
 */
import java.util.Scanner;
public class UserName {
    public static void main (String []args){
        Scanner kbd = new Scanner (System.in);
        String name;
        int password;
        System.out.println( " Please enter your username");
        name = kbd.nextLine();
        System.out.println( "Please enter your password" );
        password = kbd.nextInt();
        System.out.print ( "student"+ name + ". welcome to CSC 201 Class and your password is " + password );
        
    }
}
        
                
        
        
        
    
    

