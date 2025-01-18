public class SBI implements atmSoftware {
	AtmModel model=new AtmModel();
	
   public void addMoney(int inputMoney) {
     	int balance=model.getBankBalance();
    	int newBalance=balance+inputMoney;
	    model.setBankBalance(newBalance);
	    System.out.println("Your new balance is: "+newBalance);

     }
public void withdrawMoney(int inputMoney) {
	int balance=model.getBankBalance();
	int newBalance = balance - inputMoney;
	if(newBalance < 0) {
		System.out.println("Insufficient balance");
	}
	else {
    model.setBankBalance(newBalance);
    System.out.println("Your new balance is: "+newBalance);
	}

}
public void viewBalance() {
	int balance=model.getBankBalance();
	System.out.println("Your balance is: "+balance);

}
}