package lg.pattern.strategy.cash;

public class CashReturn extends CashSuper{

	private double sum;
	private double discount;
	
	public CashReturn (double sum, double discount){
		this.sum=sum;
		this.discount=discount;
	}

	@Override
	public double accpetCash(double cash) {
		return cash - cash / sum * discount;
	}
	
	
}
