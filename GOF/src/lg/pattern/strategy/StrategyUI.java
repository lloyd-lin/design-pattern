package lg.pattern.strategy;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class StrategyUI {
	private Display display;
	private static StrategyUI window;
	
	//can be call by reflect
	private StrategyUI(Display display){
		this.display = display;
	}
	
	public static final StrategyUI getInstance(){
		if (window == null){
			window = new StrategyUI(Display.getDefault());
			
		}
		return window;
	}
	
	public void generateView(){
		Shell shell = new Shell(StrategyUI.getInstance().display);
		GridLayout grid = new GridLayout(10, false);
		shell.setLayout(grid);
		shell.setText("Cash 计算系统");
		/*
		 * Composite c = new Composite(shell, style)
		 * Control c = new Con
		 */
		GridData gridDataCol3 = new GridData();
		gridDataCol3.horizontalSpan = 3;
		gridDataCol3.horizontalAlignment = GridData.FILL;
		gridDataCol3.grabExcessHorizontalSpace = true;
		gridDataCol3.widthHint=50;
		
		GridData gridDataCol5 = new GridData();
		gridDataCol5.horizontalAlignment = GridData.FILL;
		gridDataCol5.horizontalSpan = 5;
		gridDataCol5.grabExcessHorizontalSpace = true;
		gridDataCol5.widthHint=50;
		
		GridData gridDataCol2 = new GridData();
		gridDataCol2.horizontalAlignment = GridData.FILL;
		gridDataCol2.horizontalSpan = 2;
		gridDataCol2.grabExcessHorizontalSpace = true;
		gridDataCol2.widthHint=50;
		
		Label prize = new Label(shell, SWT.CENTER);
		prize.setText("单价:");
		prize.setLayoutData(gridDataCol3);
		
		Text text = new Text(shell, SWT.NONE);
		text.setLayoutData(gridDataCol5);
		
		Button calBtn = new Button(shell, SWT.CENTER);
		calBtn.setText("计算");
		calBtn.setLayoutData(gridDataCol2);
		
		shell.pack();
		shell.open();
		
		  while (!shell.isDisposed()) { 
			   if (!display.readAndDispatch()) 
			    display.sleep(); 
			  } 
			  display.dispose();

	}
}
