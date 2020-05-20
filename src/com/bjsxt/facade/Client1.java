package com.bjsxt.facade;

public class Client1 {
	public static void main(String[] args) {
//		GSJ  a = new HaiDianGSJ();
//		a.checkName();
//		ZJJ b = new HaiDianZJJ();
//		b.orgCodeCertificate();
//		SWJ  c  = new HaiDianSWJ();
//		c.taxCertificate();
//		Bank  d = new ICBCBank();
//		d.openAccount();
		
		new RegisterFacade().register();
		
	}
}
