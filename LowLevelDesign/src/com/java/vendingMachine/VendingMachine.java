package com.java.vendingMachine;

import java.util.Map;
import java.util.Set;

public class VendingMachine {
	
	int collectedCash;
	private State state;
	Map<String, Set<String>> productItemMap;
	Map<String, Integer> productPriceMap;
	
	
	public void addCollectedCash(int collectedCash) {
		this.collectedCash = collectedCash;
	}
	
	public VendingMachine setCollectedCash(int collectedCash) {
        this.collectedCash = collectedCash;
        return this;
    }

    public State getState() {
        return state;
    }

    public VendingMachine setState(State state) {
        this.state = state;
        return this;
    }
	
    public void removeProduct(String productCode) {

    }

    public void dispenseChange(String productCode) {
        this.state.dispenseChange(productCode);
    }

    public void cancelTransaction() {
        this.state.cancelTransaction();
    }

    public int calculateChange(String productCode) {
        return collectedCash - productPriceMap.get(productCode);
    }

    public void dispenseItem(String productCode) {
        this.state.dispenseItem(productCode);
    }

    public int getCollectedCash() {
        return collectedCash;
    }

}
