class Mother
{
    void show()
    {
        System.out.println("Welcome 1!!");
    }
}
class Child extends Mother
{
    void show()
    {
        System.out.println("Welcome 2!!");
        super.show();
    }
}
class Main
{
    public static void main(String[] args)
    {
        Child m1=new Child();
        m1.show();
    }
}