package com.java.vendingMachine;


/*
 * This Vending Machine exhibits STATE Design Pattern, because below are the methods (or) states that are valid
 *  Also using SOLID principles of Object Oriented Programming, this structure is expected.
 */
public interface State {
	
	public void collectCash(int cash);
	public void dispenseItem(String productCode);
	public void dispenseChange(String productCode);
	public void cancelTransaction();

}
