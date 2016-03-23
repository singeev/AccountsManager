package com.singeev.bank.entity;

public class Account {

	private String iban;

	private String bic;

	public Account() {

	}

	public Account(String iban, String bic) {
		this.iban = iban;
		this.bic = bic;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	@Override
	public String toString() {
		return "Account [iban=" + iban + ", bic=" + bic + ']';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Account)) return false;

		Account account = (Account) o;

		if (!iban.equals(account.iban)) return false;
		return bic.equals(account.bic);

	}

	@Override
	public int hashCode() {
		int result = iban.hashCode();
		result = 31 * result + bic.hashCode();
		return result;
	}
}
