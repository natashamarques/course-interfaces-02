package entities;

import java.util.Date;

public class Contract {
	private Integer number;
	private Date date;
	private double totalValue;

	public Contract(Integer number, Date date, double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}
	

}
