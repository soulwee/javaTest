/**
 * synchronized关键字
 * 同步方法 - statictest
 * 静态同步方法，锁的是当前类型的类对象。在本代码中就是Test_02.class
 */
package concurrent.t01;

import java.util.concurrent.TimeUnit;

public class Test_02 {
	private static int staticCount = 0;
	/*for(int i=0;i<10;i++){
		System.out.println(Thread.currentThread().getName()
				+ " staticCount = " + staticCount++);
	}*/
	public void testSync4(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()
					+ " staticCount = " + staticCount++);
		}
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testSync5(){
		//synchronized(Test_02.class){
			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName()
						+ " staticCount = " + staticCount++);
			}
	//}
	}
	
}
