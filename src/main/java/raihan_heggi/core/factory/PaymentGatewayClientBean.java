package raihan_heggi.core.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

// Proses pembuatan bean dari PaymentClient agar bisa dimodifikasi dan digunakan oleh sistem
@Component("paymentGatewayClient")
public class PaymentGatewayClientBean implements FactoryBean<PaymentGatewayClient> {

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndpoint("https://example.com");
        client.setPrivateKey("private");
        client.setPublicKey("public"); 
        return client; 
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }

}
