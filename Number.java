package lab8_2;

public class Number {
	private int number;
	public Number() {
		// TODO Auto-generated constructor stub
	setValue((int) (Math.random()*100));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public int getValue() {
		return number;
	}

	public void setValue(int number) {
		this.number = number;
	}
	public String toString(){
		return (Integer.toString(getValue()));
	}
}
