package com.bjsxt.facade;

public interface ZJJ {
	void  orgCodeCertificate();  //办理组织机构代码证
}



class HaiDianZJJ implements ZJJ {

	@Override
	public void orgCodeCertificate() {
		System.out.println("在HaiDianZJJ办理组织机构代码证！");
	}

}
