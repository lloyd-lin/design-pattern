package lg.pattern.prototype;

public class WorkExperience implements Cloneable {
	private String companyName;
	private String duriation;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDuriation() {
		return duriation;
	}

	public void setDuriation(String duriation) {
		this.duriation = duriation;
	}

	@Override
	public WorkExperience clone() {
		WorkExperience we = new WorkExperience();
		we.setCompanyName(this.companyName);
		we.setDuriation(this.duriation);
		return we;
	}
}
