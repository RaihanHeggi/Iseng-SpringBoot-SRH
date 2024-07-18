package raihan_heggi.core.factory;

import lombok.Data;

@Data
public class PaymentGatewayClient {

    private String endpoint;
    private String privateKey;
    private String publicKey;

}
  