package lg.pattern.strategy.cash;

public class CashContent {
	private CashSuper cs;
	
	public CashContent (CashSuper cs){
		this.cs = cs;
	}
	
	public double calculCash(double cash){
		return cs.accpetCash(cash);
	}
}
