package src.com.bootcampexercise.module6;

//TODO: Cat class should implement Animal
public class Cat implements Animal  {
    @Override
    public void animalSound() {
        System.out.println("Cat says: 'Meow Meow'!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping!");
    }

}
