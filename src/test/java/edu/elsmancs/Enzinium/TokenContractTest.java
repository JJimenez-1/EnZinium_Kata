package edu.elsmancs.Enzinium;

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
}
