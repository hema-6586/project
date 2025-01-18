import java.util.Scanner;

public class Project {
	public static void main(String args[]) {
		atmSoftware();
	}
	 static SBI sbi=new SBI();
		

	public static void atmSoftware() {
		  System.out.println("1.add Money");
		  System.out.println("2.withdraw money");
		  System.out.println("3.view balance");
		  System.out.println("4.Exit");
		  
		  Scanner sc = new Scanner(System.in);
		  int userinput=sc.nextInt();
		  		  
		  switch(userinput)  {
		  case 1:{
			  System.out.println("Enter the amount to be added: ");
			  int userMoney=sc.nextInt();
			  sbi.addMoney(userMoney);
			  atmSoftware();
			  break;
		  }  
		  case 2:{
			  System.out.println("Enter the amount to be withdraw: ");
			  int userMoney=sc.nextInt();
			  sbi.withdrawMoney(userMoney);
			  atmSoftware();
			  break;
		  }
		  case 3:{
			  sbi.viewBalance();
			  atmSoftware();
			  break;
		  }
		  case 4:{
			  break;
		  }
		default:{
			System.out.println("Invalid input try again: ");
			atmSoftware();
		}
		  }
		}
}
