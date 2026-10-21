package chapter5;

public class PolymorphismLesson {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.hasHair());
        System.out.println(lemur.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());
        // System.out.println(primate.isTailStriped());

        hasTail hastail = lemur;
        // System.out.println(hastail.hasHair());
        System.out.println(hastail.isTailStriped());
        Object object_lemur =lemur;
        System.out.println(((Lemur)object_lemur).hasHair());

        Bird bird = new Bird();
        bird.displayInformation();
        Bird pea = new Peacock();
        pea.displayInformation();
        ZooWorker.feed(new Reptile());
        ZooWorker.feed(new ComodoDragon());
        ZooWorker.feed(new Crocodile());
        ZooWorker.feed(new Aligator());
    }

}
abstract class Primate{
    abstract boolean hasHair();
}
interface hasTail{
    boolean isTailStriped();
}
class Lemur extends Primate implements hasTail{
    int age = 10;
    @Override
    public boolean isTailStriped(){
        return true;
    }
    @Override 
    public boolean hasHair(){
        return true;
    }
}
class Bird{
    public String getName(){
        return "unknown";
        
    }
    public void displayInformation(){
            System.out.println("the birds name is:"+getName());
        }
}
class Peacock extends Bird{
    public String getName(){
        return "Peacock";
        
    }
}
class Egul extends Bird{
    public String getName(){
        return "Egul";
        
    }
}
class Maya extends Bird{
    public String getName(){
        return "Maya";
        
    }
}
class Fish{
    public String getName(){
        return "Fish";
        
    }
}
class Reptile{
    public String getName(){
        return "Reptile";
        
    }
}
class Aligator  extends Reptile{
    public String getName(){
        return "Aligator";
        
    }
}
class Crocodile  extends Reptile{
    public String getName(){
        return "Crocodile";
        
    }
}
class ComodoDragon extends Reptile{
    public String getName(){
        return "ComodoDragon";
        
    }
}

class ZooWorker{
    public static void feed(Reptile reptile){
        System.out.println("Feeding: "+reptile.getName());
    }
}