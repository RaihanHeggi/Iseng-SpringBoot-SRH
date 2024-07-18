package raihan_heggi.core.factory;

import lombok.Data;

// Sebuah kelas yang tidak dapat dirubah karena milik third-party atau apapun
@Data
public class PaymentGatewayClient {

    private String endpoint;
    private String privateKey;
    private String publicKey;

}
  