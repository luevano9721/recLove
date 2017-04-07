/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


/**
 *
 * @author Money
 */
public class Rectangles {

    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter number of Iterations\n");
            int niteration=Integer.parseInt(br.readLine());
            if(niteration<=5 & niteration>=1) {
                System.out.print("Iteration should be >=1 and <=5\n");
                break;
            }
            while( niteration > 0 ){
            System.out.print("Enter N M K values\n");
            String line=br.readLine();
            String[] matrixValues=line.split(" ");
//                for (String value : matrixValues) {
//                    System.out.println(value);
//                }
                niteration--;
        }
            
            
            
        } catch (Exception e) {
            System.out.println("unexpected error");
        }
     
        

    }
    /**
 * Produce a List<String> which contains every combination which can be
 * made by taking one String from each inner String array within the
 * provided two-dimensional String array.
 * @param twoDimStringArray a two-dimensional String array which contains
 * String arrays of variable length.
 * @return a List which contains every String which can be formed by taking
 * one String from each String array within the specified two-dimensional
 * array.
 */

}
