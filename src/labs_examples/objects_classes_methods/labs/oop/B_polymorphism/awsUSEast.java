package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class awsUSEast extends aws {

     String vpcCidrBlock;

    public void createVPC(String cidrBlock) {

        System.out.println("aws ec2 create-vpc --cidr-block " + cidrBlock");

        this.vpcCidrBlock = cidrBlock;


    }

    public void createVPC(String cidrBlock, String instanceTenancy) {

        System.out.println("aws ec2 create-vpc --cidr-block " + cidrBlock + "--instance-tenancy " + instanceTenancy);

        this.vpcCidrBlock = cidrBlock;


    }

    @Override
    public void dedicatedNetwork() {
        super.dedicatedNetwork();

        System.out.println("aws directconnect create-direct-connect-gateway --direct-connect-gateway-name \"DxGateway1\"");

    }



}
