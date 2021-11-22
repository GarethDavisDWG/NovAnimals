package code.example.tsi.animalexample;

public abstract class Mammal extends Animal{

    //////////////////////////////Attributes////////////////////////////////
        private int size = 10;




    /////////////////////////////////Constructors//////////////////////////







    /////////////////////////////////Methods///////////////////////////////

    public String Breathe(){
        return "I am breathing";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Mammal reproduce(){
        return new Cat();
    }
}
