package entities;

import java.util.Date;

public class Installment {
	private Date date;
	private double amount;
	private double totalValue;

	public Installment(Date date, double amount, double totalValue) {
		super();
		this.date = date;
		this.amount = amount;
		this.totalValue = totalValue;
	}

}
