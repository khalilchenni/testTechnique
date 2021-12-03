package test;


import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khalil
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>(100);
            
        for (int i0=0;i0<n;i0++){
            int i=i0+1;
            if ((i % 3 == 0) && (i % 5 == 0)) {
                answer.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                answer.add("Fizz");
            }
            else if ((i) % 5 == 0) {
                answer.add("Buzz");
            }
            else{
               answer.add(Integer.toString(i));
               }
        }
    
    return answer;
        
        
    }
}
