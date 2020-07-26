package c6.decorate2;

public class Shoes extends Clothes {

	@Override 
	public void show() {
		super.show();
		System.out.println("穿鞋子");
	}
	
}
