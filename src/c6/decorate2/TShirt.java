package c6.decorate2;

public class TShirt extends Clothes {

	@Override
	public void show() {
		super.show();
		System.out.println("穿T恤");
	}
	
}
