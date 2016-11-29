/* Assignment 6.1: Write a simple Timer that can periodically print a timeout message.
	This assignment will help to master the following concepts:
	> Multithreading
	> Thread Class/Runnable interface and its Methods
*/

class Timer implements Runnable {	//Runnable interface used with Class Timer

	public void run(){	// run method from runnable interface
		for (int i = 10; i > 0; i--){
			System.out.println(Thread.currentThread().getName() + "\t" + i);
			try {
				Thread.currentThread().sleep(200);
			} catch (Exception e){}
		}
		System.out.println(Thread.currentThread().getName() + "\tTIMEOUT!!!");
	}

	public static void main(String[] args){

		Timer tm = new Timer();	// Object tm of class Timer

		Thread t1 = new Thread(tm);	// Thread t1 created using Thread class.
		Thread t2 = new Thread(tm);	// Thread t2 created using Thread class.
		Thread t3 = new Thread(tm);	// Thread t3 created using Thread class.

		// Set name for each thread.
		t1.setName("Cartier");
		t2.setName("Rolex");
		t3.setName("Tissot");

		// Start method to initiate multi-threading!
		t1.start();
		t2.start();
		t3.start();
	}
}