package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class AzureUSEast extends Azure {

    String cidrBlock;
    String resourceGroup;
    String location;

    public AzureUSEast(String resourceGroup, String location) {
        System.out.println("Creating virtual network");
        this.resourceGroup = resourceGroup;
        this.location = location;
    }

    public void createVnet() {

        System.out.println("Creating virtual network");
        System.out.println("az group create --name " + this.resourceGroup + "--location " + this.location);

        }

        // method overloading with different arguments.

    public void createVnet(String cidrBlock,String vnet) {
        System.out.println("az network vnet create -g " + resourceGroup + " -n " + vnet + " --address-prefix " + cidrBlock);

        this.cidrBlock = cidrBlock;
    }


  // overrides method from the super class.

    @Override
    public void dedicatedNetwork() {
        super.dedicatedNetwork();

        System.out.println("az network express-route create --bandwidth 200 -n MyCircuit --peering-location \"Silicon Valley\" -g " + resourceGroup + " --provider \"Equinix\" -l \"West US\" --sku-family MeteredData --sku-tier Standard\n");


    }

    }


