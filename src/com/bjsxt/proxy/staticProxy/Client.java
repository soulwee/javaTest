package com.bjsxt.proxy.staticProxy;

public class Client {
	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		
		proxy.collectMoney();
	}

	public void aaa(String[] args){
		System.out.println(args);
	}
	 Client(){
		System.out.println("cons");
	}
}
