/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.security.auth.kerberos.EncryptionKey;

/**
 *
 * @author w20017074
 */
public class Test1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        try
        {
            BufferedReader cons=new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Enter the size of the student group:");
            int numStudents = Integer.parseInt(cons.readLine());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
