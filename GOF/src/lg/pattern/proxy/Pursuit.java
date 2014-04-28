package lg.pattern.proxy;

public class Pursuit implements GiveGift{

	private PrettyGirl pg;
	public Pursuit (PrettyGirl pg){
		this.pg = pg;
	}
	@Override
	public void giveGift() {
		System.out.println(pg.getName()+",送你礼物");
	}

	//other action
}
