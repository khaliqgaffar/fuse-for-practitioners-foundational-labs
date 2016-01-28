package org.globex;

public class Account {

    @Override
	public String toString() {
		return "Account [company=" + company + ", contact=" + contact
				+ ", clientId=" + clientId + ", salesRepresentative="
				+ salesRepresentative + "]";
	}

	private Company company;
    private Contact contact;
    private int clientId;
    private String salesRepresentative;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getSalesRepresentative() {
        return salesRepresentative;
    }

    public void setSalesRepresentative(String salesRepresentative) {
        this.salesRepresentative = salesRepresentative;
    }
}
