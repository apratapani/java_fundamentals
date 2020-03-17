package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Cloudpol {

    publicCloud cloud;


    public Cloudpol(publicCloud cloud) {
        this.cloud = cloud;
    }


    public void setCloud(publicCloud cloud) {
        this.cloud = cloud;
    }


    public void buildCloud() {

        cloud.cloudVirtualNetworking();

        cloud.crossPremisesConnectivity();

        cloud.dnsManagement();

        cloud.dedicatedNetwork();

        cloud.iam();

        cloud.waf();


    }


    public static void main(String[] args) {

        String cidr = "10.0.0.0/16";

        String tenanacy = "dedicated";

        String resgroup = "Anil_resource";

        String azloc = "eastus";

        String vnet = "Anil_vnet";

        Aws aws = new Aws();
        Cloudpol cl = new Cloudpol(aws);  // using interfaces.

        cl.buildCloud();

        Azure azure = new Azure();

        cl.setCloud(azure);

        cl.buildCloud();

        AwsUSEast awsUSEast = new AwsUSEast();

        AzureUSEast azureUSEast = new AzureUSEast(resgroup,azloc);

        awsUSEast.createVPC(cidr);

        awsUSEast.createVPC(cidr,tenanacy);  // example of method overloading.

        awsUSEast.dedicatedNetwork();

        azureUSEast.createVnet();  // call to override function in subclass.

        azureUSEast.createVnet(cidr,vnet);  // example of method overloading.

        azureUSEast.dedicatedNetwork(); // call to override function in subclass.





    }



}
