package labs_examples.packages.labs.package_01;

public class DemoPackageController {

    public static void main(String[] args) {

        // call to protected method in a class within same package.

        System.out.println("Demo of access modifiers with packages.");

        labs_examples.packages.labs.package_01.Packagelab.packageAccessProtectedModifiers();
        labs_examples.packages.labs.package_01.Packagelab.packageAccessPublicModifiers();

        labs_examples.packages.labs.package_02.PackageLab.packageAccessPublicModifiers();

       // labs_examples.packages.labs.package_02.PackageLab.packageAccessProtectedModifiers();  This does not work as its protected class from another package.




    }
}
