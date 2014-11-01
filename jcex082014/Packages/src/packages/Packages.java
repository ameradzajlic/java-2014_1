package packages;
import packages.myinnerpackage.MyInnerPackageClass;
import packages.myinnerpackage.evendeeperpackage.*;
public class Packages {
    public static void main(String[] args) {
        MyDeepClass myDeepClass = new MyDeepClass();
        MyInnerPackageClass myInnerPackageClass = new MyInnerPackageClass();
        SomeClass someClass1 = new SomeClass(); 
        packages.myinnerpackage.evendeeperpackage.SomeClass someClass = 
                new packages.myinnerpackage.evendeeperpackage.SomeClass();
    }
}
