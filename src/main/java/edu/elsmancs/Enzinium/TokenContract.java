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

    @Override
    public String toString() {
        return ("\n" + "name = " + name() + "\n" + "symbol = " + symbol() + "\n" + "totalSupply = " + totalSupply()
                + "\n" + "owner PK = " + owner.getPK().hashCode());
    }
    public void addOwner(PublicKey PK, double units) {
        if(!balances.containsKey(PK)) {
            balances.put(PK, units);
        }
    }

    public double balanceOf(PublicKey pk) {
        return balances.getOrDefault(pk, 0d);
    }

    public int numOwners() {
        return getBalances().size();
    }
}
