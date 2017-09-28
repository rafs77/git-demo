package org.fs.tst;

public class AppInit {

	public AppInit(){
		
	}
	public void execute(){
		//Crea bean
		TBean tBean = new TBean();
		tBean.setNombre("x");
	}
	/**
	 * Initial entry point
	 * @param args
	 */
	public static void main(String[] args) {
		AppInit app = new AppInit();
		app.execute();

	}

}
