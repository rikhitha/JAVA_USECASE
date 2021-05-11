package airvoice.java.streams.com;

public class Customer 
{

	private String customerid;
    public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getConnectiontype() {
		return connectiontype;
	}
	public void setConnectiontype(String connectiontype) {
		this.connectiontype = connectiontype;
	}
	
	private String customername;
    public Customer(String customerid, String customername, String country, String phonenumber, String connectiontype,
			String vas) {
		this.customerid = customerid;
		this.customername = customername;
		this.country = country;
		this.phonenumber = phonenumber;
		this.connectiontype = connectiontype;
		this.vas = vas;
	}
	private String country;
    private String phonenumber;
    private String connectiontype;
    private String vas;
	public String getVas() {
		return vas;
	}
	public void setVas(String vas) {
		this.vas = vas;
	}
}
