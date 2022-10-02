package product;

public class Product {
	
	//e-commerce  product	pid	 pname	 pdescription   pprice  	pqty
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdescription=" + pdescription + ", pprice=" + pprice
				+ ", pqty=" + pqty + "]";
	}
	private int pid;
	private String pname;
	private String pdescription;
	private double pprice;
	private int pqty;
	
	public Product(int pid, String pname, String pdescription,double pprice,int pqty) {
		this.pid=pid;
		this.pname= pname;
		this.pdescription=pdescription;
		this.pprice=pprice;
		this.pqty=pqty;
		
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public int getPqty() {
		return pqty;
	}
	public void setPqty(int pqty) {
		this.pqty = pqty;
	}
	

}
