package lg.pattern.simplefactory;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class OperationDivide extends Operation{

	public BigDecimal getResult(){
		MathContext mc = new MathContext(2, RoundingMode.HALF_DOWN);
		return super.getNum1().divide(super.getNum2(),mc);
	}
}
