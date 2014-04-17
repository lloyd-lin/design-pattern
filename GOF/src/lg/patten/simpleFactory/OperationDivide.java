package lg.patten.simpleFactory;

import java.math.BigDecimal;

public class OperationDivide extends Operation{

	public BigDecimal getResult(){
		return super.getNum1().divide(super.getNum2()).setScale(4);
	}
}
