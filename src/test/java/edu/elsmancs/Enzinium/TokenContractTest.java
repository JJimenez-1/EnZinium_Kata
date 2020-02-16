package edu.elsmancs.Enzinium;

import org.junit.Before;
import org.junit.Test;

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
        prueba.
    }
}
