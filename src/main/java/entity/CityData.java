package entity;

public class CityData {
	private int id;
	private String cityName;
	private String bankName;
	private String bankAccountName;
	private String bankAccount;
	public CityData() {
		super();
	}
	public CityData(String cityName, String bankName, String bankAccountName, String bankAccount) {
		super();
		this.cityName = cityName;
		this.bankName = bankName;
		this.bankAccountName = bankAccountName;
		this.bankAccount = bankAccount;
	}
	public CityData(int id, String cityName, String bankName, String bankAccountName, String bankAccount) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.bankName = bankName;
		this.bankAccountName = bankAccountName;
		this.bankAccount = bankAccount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccountName() {
		return bankAccountName;
	}
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	@Override
	public String toString() {
		return "CityData [id=" + id + ", cityName=" + cityName + ", bankName=" + bankName + ", bankAccountName="
				+ bankAccountName + ", bankAccount=" + bankAccount + "]";
	}
	
	
}
