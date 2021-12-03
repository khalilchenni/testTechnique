package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author khalil
 */
public class NewEmptyJUnitTest {
    
   @Test
    public void test1() {
        Solution s=new Solution();
        final List<String> actual = s.fizzBuzz(3);
        List<String> expected = Arrays.asList("1","2","buzz");
        
        Assertions.assertEquals(expected, actual);
    }
    public void test2() {
        Solution s=new Solution();
        final List<String> actual = s.fizzBuzz(2);
        List<String> expected = Arrays.asList("1","2");
        
        Assertions.assertEquals(expected, actual);
    }
}
