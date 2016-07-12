package account;
public abstract class Account {
	double balance;
	void withdraw(){
		System.out.println("account class withdraw ");
	}
	void deposit(){
		System.out.println("account class deposit method");
	}
	abstract void rateOfInterest();}
	class SavingAccount extends Account{
		void rateOfInterest(){
			System.out.println("saving account class  roi method");
		}
		
	}
	 class CurrentAccount extends Account{
		void rateOfInterest(){
			System.out.println("current account class");
		}
	}
	 class TestAbstraction {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				SavingAccount sa=new SavingAccount();
				sa.deposit();
				sa.rateOfInterest();

			}

		}
	


