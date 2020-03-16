package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class azure implements publicCloud {



    @Override
    public void cloudVirtualNetworking() {
        System.out.println("This service in Azure is just called virtual network");

        System.out.println("More information is described here. https://azure.microsoft.com/en-us/services/virtual-network/");
    }

    @Override
    public void crossPremisesConnectivity() {

        System.out.println("This service is called Azure VPN gateway.");

        System.out.println("More information of it is described here. https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-about-vpngateways.");


    }


    @Override
    public void dnsManagement() {

        System.out.println("This service is called Azure DNS");

        System.out.println("More information about it is described here https://azure.microsoft.com/en-us/services/dns/ ");



    }

    @Override
    public void dedicatedNetwork() {

        System.out.println("This service in Azure is called Azure Express Route");

        System.out.println("More information about it is described here https://azure.microsoft.com/en-us/services/expressroute/");

    }

    @Override
    public void iam() {

        System.out.println("This service in Azure is called Azure Active directory");

        System.out.println("More information about it is described here https://azure.microsoft.com/en-us/services/active-directory/");

    }

    @Override
    public void waf() {

        System.out.println("This service in Azure is called Azure Firewall.");

        System.out.println("More information about it is described here https://azure.microsoft.com/en-us/services/azure-firewall/");

    }


}
