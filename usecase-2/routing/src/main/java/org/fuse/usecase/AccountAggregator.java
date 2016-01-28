package org.fuse.usecase;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.globex.Account;
import org.globex.CorporateAccount;

/**
 * Aggregator implementation which extract the id and salescontact from
 * CorporateAccount and update the Account
 */
public class AccountAggregator implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		try {
			System.out.println("aggregate being called");

			if (oldExchange == null) {

				return newExchange;
			}

			Account account = oldExchange.getIn().getBody(Account.class);
			Account newAccount;
			CorporateAccount ca;

			if (newExchange.getIn().getBody().getClass()
					.isInstance(Account.class)) {
				System.out.println("Accoutn instance");
				newAccount = newExchange.getIn().getBody(Account.class);
				account.getCompany().setGeo(newAccount.getCompany().getGeo());
			} else {

				ca = newExchange.getIn().getBody(CorporateAccount.class);
			
					account.setClientId(ca.getId());
					account.setSalesRepresentative(ca.getSalesContact());
					System.out.println("Geo:" + account.getCompany().getGeo());
				
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return oldExchange;
	}

}