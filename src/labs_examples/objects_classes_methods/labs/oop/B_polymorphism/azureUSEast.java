package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class azureUSEast extends azure {

    String cidrBlock;
    String resourceGroup;
    String location;

    public azureUSEast(String resourceGroup,String location) {
        this.resourceGroup = resourceGroup;
        this.location = location;
    }

    public void createVnet() {

        System.out.println("az group create --name " + this.resourceGroup "--location " + this.location);

        }


    public void createVnet(String cidrBlock,String vnet) {
        System.out.println("az network vnet create -g " + resourceGroup + " -n " + vnet + " --address-prefix " + cidrBlock);

        this.cidrBlock = cidrBlock;
    }



    
}
