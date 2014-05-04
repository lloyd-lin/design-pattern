package lg.pattern.prototype;

public class Resume implements Cloneable {
	private String name;
	private String age;
	private WorkExperience experience;

	public Resume(){
		this.experience = new WorkExperience();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public WorkExperience getExperience() {
		return experience;
	}

	public void setExperience(WorkExperience experience) {
		this.experience = experience;
	}

	public void setExperience(String companyName, String duriation) {
		this.experience.setCompanyName(companyName);
		this.experience.setDuriation(duriation);
	}

	@Override
	public Resume clone() {
		Resume resume = new Resume();
		resume.setAge(this.age);
		resume.setName(this.name);
		resume.setExperience(this.experience.clone());
		return resume;
	}
	
	public void display(){
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.experience.getCompanyName());
		System.out.println(this.experience.getDuriation());
	}
}
