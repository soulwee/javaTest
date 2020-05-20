package com.bjsxt.facade;

public interface SWJ {
	void taxCertificate();  //办理税务登记证
}


class HaiDianSWJ implements SWJ {

	@Override
	public void taxCertificate() {
		System.out.println("在HaiDianSWJ办理税务登记证！");
	}

}
