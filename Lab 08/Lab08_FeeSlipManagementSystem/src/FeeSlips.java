import javax.persistence.*;

@Entity
@Table(name="feeslips")
public class FeeSlips {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="regNumber")
	private int regNumber;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="feeMonth")
	private String feeMonth;
	@Column(name="currentDate")
	private String currentDate;
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public int getregNumber() {return regNumber;}
	public void setregNumber(int regNumber) {this.id = regNumber;}
	public String getfirstName(){return firstName;}
	public void setfirstName(String firstName){this.firstName = firstName;}
	public String getlastName(){return lastName;}
	public void setlastName(String lastName){this.firstName = lastName;}
	public String getfeeMonth(){return feeMonth;}
	public void setfeeMonth(String feeMonth){this.feeMonth = feeMonth;}
	public String getcurrentDate(){return currentDate;}
	public void setcurrentDate(String currentDate){this.currentDate = currentDate;}
}