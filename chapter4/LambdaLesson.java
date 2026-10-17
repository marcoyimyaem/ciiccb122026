package chapter4;
import java.util.*;
import java.util.function.*;
public class LambdaLesson {

    static void print(List<Animal> animals,Predicate<Animal> checker){
        for(Animal animal: animals){
            if( checker.test(animal)){
                System.out.print(animal+", ");
            }
        }
        System.out.println("*************");
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish", false, true,1));
        animals.add(new Animal("Kangaroo", true, false,5));
        animals.add(new Animal("Rabbit", true, false,2));
        animals.add(new Animal("Trutle", false, true,10));
        animals.add(new Animal("Frog", true, true,2));
        animals.add(new Animal("Kaola", false, false,6));
        // print(animals, new CheckIfHopper());
        // print(animals, new CheckIfSwimmer());
        print(animals, a->a.canSwim());
        print(animals, a->a.canHop());
        print(animals, a->(a.canHop() && a.canSwim()));
        print(animals, a->(!a.canHop() && !a.canSwim()));
        print(animals, a->a.getAge()>3);
        NumberIterface sumTwoNums = (a,b,c) -> a+b;
        NumberIterface prodTwoNums = (x,y,z) -> x*y;
        System.out.println(sumTwoNums.aOpsB(31, 56,""));
        System.out.println(prodTwoNums.aOpsB(31, 56,""));
        Discount tenPercent = a-> a-(a*0.10);
        Discount twentyPercent = (a)-> a-(a*0.20);
        Discount fiftyPercent = a-> a-(a*0.50); 
        int price = 1000;
        System.out.println(tenPercent.applyDC(price));
        System.out.println(twentyPercent.applyDC(price));
        System.out.println(fiftyPercent.applyDC(price));
        
        
        
    }
    
}

class Animal{
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;
    public Animal(String speciesName,boolean hopper,boolean swimmer,int age){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
        this.age = age;
    }
    public boolean canHop(){ return canHop;}
    public boolean canSwim(){ return canSwim;}
    public int getAge(){ return age;}
    public String toString(){ return species;}
}


// interface CheckTrait{
//     boolean test(Animal a);
// }
// class CheckIfHopper implements CheckTrait{
//     public boolean test(Animal a){
//         return a.canHop();
//     }
// }
// class CheckIfSwimmer implements CheckTrait{
//     public boolean test(Animal a){
//         return a.canSwim();
//     }
// }
interface NumberIterface{
    int aOpsB(int a,int b,String s);
}
interface Discount{
    double applyDC(double i);
}