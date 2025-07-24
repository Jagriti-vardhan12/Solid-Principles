package com.example.jv;

interface PaymentMethod
{
	void pay();	
}
class creditCard implements PaymentMethod
{
	public void pay() {
		System.out.println("process Creditcard payment");
	}
}
//this new features
class debitCard implements PaymentMethod
{
	@Override
	public void pay() {
		System.out.println("process debitcard payment");
	}
}

class Processor
{
	void Process(PaymentMethod paymentMethod) {
		paymentMethod.pay();
	}
}
public class Open_Close_principal {

	public static void main(String[] args) {
		Processor p = new Processor();
		p.Process(new creditCard());
		p.Process(new debitCard());
	}

}
