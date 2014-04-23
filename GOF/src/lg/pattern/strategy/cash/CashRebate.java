package lg.pattern.strategy.cash;

public class CashRebate extends CashSuper{

	private double rebate;
	
	public CashRebate(double rebate){
		this.rebate = rebate;
	}

	@Override
	public double accpetCash(double cash) {
		return cash*rebate;
	}
	
	
}
