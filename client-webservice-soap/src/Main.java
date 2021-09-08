import proxy.BanqueService;
import proxy.BanqueWS;

public class Main {

    public static void main(String[] args) {

        // stub c'est le proxy ou le representant du web service

        BanqueService stub  = new BanqueWS().getBanqueServicePort();

        System.out.println(stub.conversionEuroToDH(158));
    }
}
