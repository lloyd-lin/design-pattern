package lg.pattern.prototype;

public class HuntJob {
	public static void main(String[] args){
		Resume ori = new Resume();
		ori.setAge("24");
		ori.setName("Superman");
		ori.setExperience("IBM", "2012-2014");
		ori.display();
		
		Resume newOne = ori.clone();
		newOne.setName("Captain American");
		newOne.display();
	}
}
