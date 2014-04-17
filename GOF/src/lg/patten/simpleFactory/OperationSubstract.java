package lg.patten.simpleFactory;

import java.math.BigDecimal;

public class OperationSubstract extends Operation{

	public BigDecimal getResult(){
		return super.getNum1().subtract(super.getNum2());
	}
}
