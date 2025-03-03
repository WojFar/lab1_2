package pl.com.bottega.ecommerce.sales.domain.factory;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.payment.Payment;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class PaymentFactory {
    
    public static Payment getPayment(Id aggregateId, ClientData clientData, Money amount)
    {
        return new Payment(aggregateId, clientData, amount);
    }
}
