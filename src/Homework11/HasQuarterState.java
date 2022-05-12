package Homework11;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public String insertQuarter() {
		return "You can't insert another quarter";
	}
 
	public String ejectQuarter() {
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		return "Quarter returned";
	}
 
	public String turnCrank() {
		gumballMachine.setState(gumballMachine.getSoldState());
		return "You turned...";
	}

    public String dispense() {
        return "No gumball dispensed";
    }
    
    public void refill() { }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
