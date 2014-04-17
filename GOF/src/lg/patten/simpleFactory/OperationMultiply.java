package lg.patten.simplefactory;

import java.math.BigDecimal;

public class OperationMultiply extends Operation{

	public BigDecimal getResult(){
		return super.getNum1().multiply(super.getNum2());
	}
}
