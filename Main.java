package palla_canestro;


public class Main {

	public static void main(String[] args){

		Frame fr = new Frame();
		
		Thread thFr = new Thread(fr);
		thFr.start();
	}	
}