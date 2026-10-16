package chapter4;

public class EncapsulationLesson{
    public static void main(String[] args) {
        Swan mother = new Swan();
        // mother.numberEggs = 31;
        mother.setNumberEggs(31);
        System.out.println(mother.getNumberEggs());
        

    }
}

class Swan {
    private int numberEggs;                    
    public int getNumberEggs() {                    
      return numberEggs;
    }
    public void setNumberEggs(int numberEggs) {    
        if (numberEggs >= 0)                     
            this.numberEggs = numberEggs;
        else
            System.out.println("invalid numberEggs");
    } }
