package lg.pattern.template;

public class GoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JianXiaTestPaper paper1 = new PaperA();
		JianXiaTestPaper paper2 = new PaperB();
		
		paper1.testQuestion1();
		paper1.testQuestion2();
		paper1.testQuestion3();
		
		paper2.testQuestion1();
		paper2.testQuestion2();
		paper2.testQuestion3();
	}

}
