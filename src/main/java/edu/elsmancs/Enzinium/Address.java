package edu.elsmancs.Enzinium;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {

    private PublicKey PK = null;
    private PrivateKey SK = null;
    private double balance = 0d;
    private final String symbol = "EZY";

    public Address() {
    }


    public PublicKey getPK() {
        return PK;
    }
    public void setPK(PublicKey PK) {
        this.PK = PK;
    }

    public PrivateKey getSK() {
        return SK;
    }
    public void setSK(PrivateKey SK) {
        this.SK = SK;
    }

    public double getBalance() {
        return balance;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return ("\n" + "PK = " + getPK().hashCode() + "\n" + "Balance = " + getBalance() + " " + getSymbol());
    }

    public void generateKeyPair() {
        KeyPair pair = edu.elsmancs.enzinium.GenSig.generateKeyPair();
        this.setPK(pair.getPublic());
        this.setSK(pair.getPrivate());
    }

    public void transferEZI(double EZI) {
        this.balance = balance + EZI;
    }
}
