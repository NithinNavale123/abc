package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class My_class1 {
	@Id
	int id;
	String name;
	String branch;
	String usn;
	String college;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {

		return "[ID=" + id + ",Name=" + name + ",Branch=" + branch + ",Usn=" + usn + ",College=" + college + "]";
	}

}
