class RHD extends Duck implements Quack,Fly
{
    @Override
    public void quack() {
        System.out.println("Quack! The Red Head Duck quacks.");
    }
    @Override
    public void fly() {
        System.out.println("The Red Head Duck flies.");
    }
}