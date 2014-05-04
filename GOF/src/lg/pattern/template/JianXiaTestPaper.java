package lg.pattern.template;

public abstract class JianXiaTestPaper {
	
	public void testQuestion1(){
		System.out.println("剑侠情缘3中一共有几个门派？ A。7个  B。8个  C。9个 D。10个");
		System.out.println(answer1());
	}
	
	public void testQuestion2(){
		System.out.println("所有门派中只招收女弟子的门派是？ A。七秀 B。五毒 C。纯阳 D。明教");
		System.out.println(answer2());
	}
	
	public void testQuestion3(){
		System.out.println("以下哪个人不是九天？ A。多多 B。李复 C。无名 D。谢云流");
		System.out.println(answer3());
	}
	
	public abstract String answer1();
	
	public abstract String answer2();
	
	public abstract String answer3();
}
