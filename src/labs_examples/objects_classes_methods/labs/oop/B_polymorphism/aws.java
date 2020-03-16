package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class aws implements publicCloud {


    @Override
    public void cloudVirtualNetworking() {
        System.out.println("This is virtual private cloud in AWS");

        System.out.println("More information for its description and how its created are mentioned here. https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html");


    }

    @Override
    public void crossPremisesConnectivity() {

        System.out.println("This AWS service is AWS VPN gateway");

        System.out.println("More information about it is mentioned here. https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html ");

    }

    @Override
    public void dnsManagement() {
        System.out.println("This AWS service is called Route 53");

        System.out.println("More information about it is mentioned here. https://aws.amazon.com/route53/ ");

    }

    @Override
    public void dedicatedNetwork() {

        System.out.println("This AWS service is called AWS direct connect");

        System.out.println("More information is mentioned here.https://aws.amazon.com/directconnect/");


    }

    @Override
    public void iam() {

        System.out.println("This AWS service is called AWS Identity and access management.");

        System.out.println("More information about it is described here. https://aws.amazon.com/iam/");


    }

    @Override
    public void waf() {

        System.out.println("This service is just called AWS WAF");

        System.out.println("More information about it is described here. https://aws.amazon.com/waf/");

    }






}
