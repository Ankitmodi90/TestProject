package dI_Check;

public class Main {
	
	public static void main(String[] args) {
		
		IPayService payservice = new PayServiceImpl(new CashPayment());
		payservice.performPayment();
		
		payservice = new PayServiceImpl(new CreditPayment());
		payservice.performPayment();
		
	}

}
