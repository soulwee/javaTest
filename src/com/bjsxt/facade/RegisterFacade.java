package com.bjsxt.facade;

/**
 * 办理注册公司流程的门面对象
 * @author Administrator
 *
 */
public class RegisterFacade {
	public void register(){
		GSJ  a = new HaiDianGSJ();
		a.checkName();
		ZJJ b = new HaiDianZJJ();
		b.orgCodeCertificate();
		SWJ  c  = new HaiDianSWJ();
		c.taxCertificate();
		Bank  d = new ICBCBank();
		d.openAccount();
	}
}
