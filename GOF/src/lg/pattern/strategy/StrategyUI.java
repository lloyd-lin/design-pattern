package lg.pattern.strategy;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;

public class StrategyUI {
	private Display display;
	private static StrategyUI window;

	// can be call by reflect
	private StrategyUI(Display display) {
		this.display = display;
	}

	public static final StrategyUI getInstance() {
		if (window == null) {
			window = new StrategyUI(Display.getDefault());

		}
		return window;
	}

	public void generateView() {
		Shell shell = new Shell(StrategyUI.getInstance().display);
		GridLayout grid = new GridLayout(10, false);
		shell.setLayout(grid);
		shell.setText("Cash 计算系统");
		/*
		 * Composite c = new Composite(shell, style)
		 */
		GridData gridDataCol3 = createGridData(GridData.FILL, 3, true, 50, 20);
		GridData gridDataCol5 = createGridData(GridData.FILL, 5, true, 100, 20);
		GridData gridDataCol2 = createGridData(GridData.FILL, 2, true, 50, 25);
		GridData testArea = createGridData(GridData.FILL, 7, true, 140, 80);
		GridData sumArea = createGridData(GridData.CENTER, 10, true, 180, 80);
		
		Label prize = new Label(shell, SWT.CENTER);
		prize.setText("单价:");
		prize.setLayoutData(gridDataCol3);

		Text pText = new Text(shell, SWT.NONE);
		pText.setLayoutData(gridDataCol5);

		Button calBtn = new Button(shell, SWT.CENTER);
		calBtn.setText("计算");
		calBtn.setLayoutData(gridDataCol2);

		Label number = new Label(shell, SWT.CENTER);
		number.setText("数量:");
		number.setLayoutData(gridDataCol3);

		Text nText = new Text(shell, SWT.NONE);
		nText.setLayoutData(gridDataCol5);
		
		Button resetBtn = new Button(shell, SWT.CENTER);
		resetBtn.setText("重置");
		resetBtn.setLayoutData(gridDataCol2);

		Label count = new Label(shell, SWT.CENTER);
		count.setText("打折:");
		count.setLayoutData(gridDataCol3);

		Combo strategy = new  Combo(shell, SWT.NONE);
		strategy.setLayoutData(gridDataCol5);
		
		Label statistic = new Label(shell, SWT.CENTER);
		statistic.setText("统计:");
		statistic.setLayoutData(gridDataCol3);

		Text list = new Text(shell, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL
				| SWT.H_SCROLL | SWT.BORDER);
		list.setLayoutData(testArea);

		Label sum = new Label(shell, SWT.NONE);
		sum.setText("总计:0.0");
		sum.setLayoutData(sumArea);
		
		//Add listener
		
		shell.pack();
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();

	}

	public GridData createGridData(int horizontalAlignment, int horizontalSpan,
			boolean grabExcessHorizontalSpace, int widthHint, int heightHint) {
		GridData gd = new GridData();
		gd.horizontalAlignment = horizontalAlignment;
		gd.horizontalSpan = horizontalSpan;
		gd.grabExcessHorizontalSpace = grabExcessHorizontalSpace;
		gd.widthHint = widthHint;
		gd.heightHint = heightHint;
		return gd;
	}
}
