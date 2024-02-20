package DAY_17.Singleton_Class;

public class secondSingletonClass
{
    private static secondSingletonClass newvar=new secondSingletonClass();
    public static secondSingletonClass getInstance()
    {
        return newvar;
    }
}
