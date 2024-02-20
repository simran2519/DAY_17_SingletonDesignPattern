package DAY_17.Singleton_Class;

public class SingletonClass
{
    private static SingletonClass variable;
    private SingletonClass()
    {
    }
    public static SingletonClass getInstance()
    {
//
        //It is not specific to threads This means if there are multiple threads and they are running parallely then at the same time they will get variable as null and the object can be created more than once.
        //so make the method as synchronized
        if(variable==null)

        {
//            Until any thread is executing then no any other thread cannot enter in the below block
            synchronized (SingletonClass.class)
            {
                if(variable==null)
                {
                    variable=new SingletonClass();
                }
            }
        }
        return variable;
    }
}
