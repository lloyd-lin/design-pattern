package lg.pattern.proxy;

public class PursuitProxy implements GiveGift {

	private Pursuit boy;

	public PursuitProxy(PrettyGirl pg) {
		this.boy = new Pursuit(pg);
	}

	@Override
	public void giveGift() {
		boy.giveGift();
	}

	public static void main(String args[]) {
		PrettyGirl mimi = new PrettyGirl("MIMI");
		PursuitProxy proxy = new PursuitProxy(mimi);
		proxy.giveGift();
	}
}
