package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;


	public int run() {
		if(this.gasoline > 0) {
			this.gasoline--;
			return (int)Math.floor(Math.random() * 15 + 1);
		} else {
			return -1;
		}
	}
}
