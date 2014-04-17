package lg.pattern.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class OperationFactory {
	
	public Operation getOperation (String op) {		
		switch (switchOperation(op)){
		case 0 :
			return new OperationAdd();
		case 1 :
			return new OperationSubstract();
		case 2 :
			return new OperationMultiply();
		case 3:
			return new OperationDivide();
		default:
			return null;	
		}
	}
	
	public int switchOperation(String op){
		if ("+".equals(op))
			return 0;
		if ("-".equals(op))
			return 1;
		if ("*".equals(op))
			return 2;
		if ("/".equals(op))
			return 3;
		return -1;
	}
	
	public static void main(String args[]) throws IOException{
		System.out.print("输入两个数:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigDecimal num1 = new BigDecimal(br.readLine());
//		br = new BufferedReader(new InputStreamReader(System.in));
		BigDecimal num2= new BigDecimal(br.readLine());
		
		System.out.println("输入运算符:");
//		br = new BufferedReader(new InputStreamReader(System.in));
		String op = br.readLine();
		
		Operation operation = new OperationFactory().getOperation(op);
		operation.setNum1(num1);
		operation.setNum2(num2);
		
		System.out.println("计算结果:" + operation.getResult());
		
	}
}
