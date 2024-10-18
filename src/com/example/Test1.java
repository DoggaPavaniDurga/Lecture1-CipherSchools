package com.example;


interface olaCustomer{
	void bookcab();
	void findARide();
	void rentCab();
	void rateDriver();
	void schedulecab();
	void cancelCab();
	void addMoneytoWallet();
	void raiseTicket();
	void signUp();
	void signIn();
}

interface olaDriver {
	void acceptBooking();
	void getCustomerLocation();
	void setAvaiableStatus();
	void getMyComission();
	void raiseMoneyTransferRequest();
	void callcustomer();
	void setUpYourVehicle();
	void customerFeedback();
}

interface olaOwner {
	void getDeriverRecords();
	void getReportByDriverID();
	void getReportByRegion();
	void gettotalRevenue();
	void getCustomerFeedback();
	void addDeriver();
	void removeDriver();
	void changeDriverStatus();
}

public class Test1  implements olaCustomer,olaDriver,olaOwner{
	
	
	public static void main(String[] args) {
		olaCustomer cust =new Test1();
		
		olaDriver driver = new Test1();
	}
	@Override
	public void getDeriverRecords() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getReportByDriverID() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getReportByRegion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gettotalRevenue() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerFeedback() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDeriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeDriverStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptBooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAvaiableStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMyComission() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void raiseMoneyTransferRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callcustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUpYourVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void customerFeedback() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookcab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findARide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rentCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void schedulecab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMoneytoWallet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void raiseTicket() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signIn() {
		// TODO Auto-generated method stub
		
	}
	
	

}
