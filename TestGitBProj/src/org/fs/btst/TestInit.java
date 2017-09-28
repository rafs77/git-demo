package org.fs.btst;

/**
 * Launch business test
 * @author rafs
 *
 */
public class TestInit {

	/**
	 * Constructor
	 */
	public TestInit(){
		
	}
	/**
	 * Init business test execution
	 */
	public void execute(){
		CommisionBean commB = new CommisionBean();
		commB.setAmount(10.20);
	}
	/**
	 * main entry
	 * @param args
	 */
	public static void main(String[] args) {
		TestInit app = new TestInit();
		app.execute();

	}

}
