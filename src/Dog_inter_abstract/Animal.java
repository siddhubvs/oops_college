package Dog_inter_abstract;

public abstract class Animal {
    public abstract void speak();
}
class Dog extends Animal implements play{
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog plays with humans");
    }
}
