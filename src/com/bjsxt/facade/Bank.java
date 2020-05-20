package com.bjsxt.facade;

public interface Bank {
	void  openAccount();  //开户
}


class ICBCBank implements Bank {

	@Override
	public void openAccount() {
		System.out.println("在ICBCBank开户！");
	}

}
