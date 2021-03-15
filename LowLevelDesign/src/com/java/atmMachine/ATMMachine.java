package com.java.atmMachine;

public class ATMMachine implements MachineState {
	
	private MachineState state;
    public ATMMachine(){
    	state = new NoDebitCardState();
    }
 
    public MachineState getAtmMachineState() {
        return state;
    }
 
    public void setAtmMachineState(MachineState atmMachineState) {
        this.state = atmMachineState;
    }
 
    @Override
    public void insertDebitCard() {
    	state.insertDebitCard();
    }
 
    @Override
    public void cancelTransaction() {
    	state.cancelTransaction();
        if(state instanceof HasDebitCardState){
        	MachineState noDebitCardState = new NoDebitCardState();
            setAtmMachineState(noDebitCardState);
            System.out.println("ATM Machine internal state has been moved to"+state.getClass().getName());
        }
    }
 
    @Override
    public void enterPinAndCollectCash() {
    	state.enterPinAndCollectCash();
    }

}
