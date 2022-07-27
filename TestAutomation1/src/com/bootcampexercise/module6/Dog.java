package src.com.bootcampexercise.module6;

//TODO: Dog class should implement Animal
public class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Dog says: 'Wuf Wuf'!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }

}