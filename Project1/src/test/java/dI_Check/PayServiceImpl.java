package dI_Check;

public class PayServiceImpl implements IPayService {
	
	/*private CashPayment cashPayment;
	
	

	public PayServiceImpl() {
		this.cashPayment = new CashPayment();
	}



	public void performPayment() {
		// TODO Auto-generated method stub
		cashPayment.executePayment();
	}*/
	
	private IPayment payment;

	public PayServiceImpl(IPayment payment) {
		super();
		this.payment = payment;
	}

	public void performPayment() {
		// TODO Auto-generated method stub
		payment.executePayment();
	}
	
	
	

}
