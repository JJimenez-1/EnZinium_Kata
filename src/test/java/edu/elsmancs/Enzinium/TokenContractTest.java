package edu.elsmancs.Enzinium;

import org.checkerframework.checker.fenum.qual.SwingTitlePosition;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import edu.elsmancs.Enzinium.Address;
import edu.elsmancs.Enzinium.TokenContract;

public class TokenContractTest {

    private Address morty = null;
    private Address rick = null;
    private Address summer = null;
    private TokenContract prueba = null;

    @Before
    public void crearTokenContract() {
        morty = new Address();
        morty.generateKeyPair();
        rick = new Address();
        rick.generateKeyPair();
        summer = new Address();
        summer.generateKeyPair();

        prueba = new TokenContract(morty);
        prueba.setTotalSupply(90);
        prueba.addOwner(morty.getPK(), prueba.totalSupply());
        prueba.setName("21 Pilots");
        prueba.setSymbol("21");

        assertEquals(1, prueba.numOwners());
    }

    @Test
    public void toStringTest() {
        System.out.println(prueba.toString());
    }

    @Test
    public void balanceOfTest() {
        double delta = 0.001;
        assertEquals(90, prueba.balanceOf(morty.getPK()), delta);
    }

    @Test
    public void transferTest() {
        double delta = 0.001;
        prueba.transfer(rick.getPK(), morty.getPK(), 5d);
        assertEquals(5, prueba.balanceOf(rick.getPK()),delta);
        assertEquals(85, prueba.balanceOf(morty.getPK()), delta);
    }
}
