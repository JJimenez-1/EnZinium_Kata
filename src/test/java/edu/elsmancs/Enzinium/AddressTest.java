/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.elsmancs.Enzinium;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddressTest {

   Address prueba = new Address();

   @Test
    public void generateKeyPairTest() {
       prueba.generateKeyPair();
       System.out.println(prueba.toString());
   }

}
