package com.bjsxt.facade;

public interface GSJ  {
	void checkName();  //核名
}

class HaiDianGSJ implements GSJ {

	@Override
	public void checkName() {
		System.out.println("检查名字是否有冲突！");
	}

}
