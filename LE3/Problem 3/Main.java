class Main
{
    public static void main(String[] args)
    {
        Duck rd = new RD();
        rd.swim();
        ((RD) rd).squeak();
        Duck wd = new WD();
        wd.swim();
        Duck rhd = new RHD();
        rhd.swim();
        ((RHD) rhd).quack();
        ((RHD) rhd).fly();
        Duck ld = new LD();
        ld.swim();
        ((LD) ld).quack();
    }
}