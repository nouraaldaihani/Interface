import model.Cat;
import model.Dog;

public class App {
    public static void main(String[] args){

        Cat myCat= new Cat();

        Dog myDog = new Dog();


        myCat.eat();
        myCat.sleep();
        myCat.makessound();
        myDog.eat();
        myDog.sleep();
        myDog.makessound();
    }

}