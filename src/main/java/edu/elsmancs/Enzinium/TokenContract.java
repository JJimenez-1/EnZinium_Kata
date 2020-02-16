package edu.elsmancs.Enzinium;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class TokenContract {
    private String name;
    private String symbol;
    private double totalSupply;
    private final Address owner;
    private Map<PublicKey, Double> balances = new HashMap<PublicKey, Double>();

    public TokenContract(Address owner) {
        this.owner = owner;
    }

    public String name() {
        return name;
    }

    public String symbol() {
        return symbol;
    }

    public double totalSupply() {
        return totalSupply;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }

    public Map<PublicKey, Double> getBalances() {
        return balances;
    }


}
