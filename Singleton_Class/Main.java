package DAY_17.Singleton_Class;

import org.w3c.dom.ls.LSOutput;

public class Main
{
    public static void main(String[] args) {
        //Here we have to make atleast one object in the main class to use the method in class SingletonClass
        //We have to first make the object and then use it

        SingletonClass obj1= SingletonClass.getInstance();
        SingletonClass obj2=SingletonClass.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);

        //For printing singleton object of secondSingletonClass
        //Here atleast one object is already made in the class and we are just using(printing) it
        //But here is the problem that if user does not need the object right now then also the object is being created
        System.out.println(secondSingletonClass.getInstance());
        System.out.println(secondSingletonClass.getInstance());
    }
}
