package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		Money a = new Money(0);
		a.amount = this.amount + money.amount;
		return a;
	}

	public Money minus(Money money) {
		Money a = new Money(0);
		a.amount = this.amount - money.amount;
		return a;
	}

	public Money multiply(Money money) {
		Money a = new Money(0);
		a.amount = this.amount * money.amount;
		return a;
	}

	public Money devide(Money money) {
		Money a = new Money(0);
		a.amount = this.amount / money.amount;
		return a;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}	
	
	public boolean equals(Money money) {
		return (this.amount == money.amount)? true : false;
	}
	
	public int hashCode() {
		return this.amount;
	}
}