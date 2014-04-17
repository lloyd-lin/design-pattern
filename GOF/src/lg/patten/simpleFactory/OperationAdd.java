package lg.patten.simplefactory;

import java.math.BigDecimal;

public class OperationAdd extends Operation{

	public BigDecimal getResult(){
		return super.getNum1().add(super.getNum2());
	}
}
