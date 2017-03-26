/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercises;

/**
 *
 * @author kagan
 */
public class PentagonalNumbers {
    
    public static void main(String[] args) {
        
        for(int i = 1; i <=100; i++)
        {
            System.out.println(getPentagonalNumber(i));
        }
    }
    
public static int getPentagonalNumber(int n)
{
    return (3*n*n-n)/2;
}
    
}
