package com.example;

public class Test {
	public static void main(String[] args) {
	Amazon customer = new Amazon();
		
		float payAmt=customer.Transaction(1000);
		System.out.println("Total Payable : "+payAmt);
	}
	
	

}

class Amazon{
	
	float Transaction(float amt) {
		Gpay gpay=new Gpay();
		gpay.setTxnCharge(0.05f);
		float total=amt+(amt*gpay.getTxnCharge());
		return total;
		
	}
}

class Gpay{
	 private float txnCharge=0.5f;

	public float getTxnCharge() {
		return txnCharge;
	}

	public void setTxnCharge(float txnCharge) {
		if(txnCharge<0.05f) {
			System.out.println("Invalid charges");
		}
		this.txnCharge = txnCharge;
	}
	 
	
}
