package c2.strategy;

public class CashContext {
	
	private CashSuper cash;
	
	public CashContext(String type) {
		switch (type) {
		case "normal":
			this.cash = new CashNormal();
			break;
		case "discount":
			this.cash = new CashDiscount();
			break;
		default:
			throw new RuntimeException();
		}
	}
	
	public double getResult(double money) {
		return this.cash.getMoney(money);
	}

}
