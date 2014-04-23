package lg.pattern.strategy;

import lg.pattern.strategy.cash.CashNormal;
import lg.pattern.strategy.cash.CashRebate;
import lg.pattern.strategy.cash.CashReturn;
import lg.pattern.strategy.cash.CashSuper;
import lg.pattern.strategy.cash.CashKind;

public class CashFactory {
	
	public static CashSuper getCash(CashKind ck){
		switch (ck){
		case 原价:
			return new CashNormal();
		case 打八折:
			return new CashRebate(0.8);
		case 满300返150:
			return new CashReturn(300, 150);
		default:
			throw new AssertionError("无效参数");
		}
	}
	
}
