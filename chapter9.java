//snippet2
class GearTest{
    public void test(){
        Gear1 gear = new Gear1(52,11,26,2);
        assertEquals(137.1,gear.gear_inches());

    }
}

class Gear1 {


    double chainring ;
    double cog;
    double rim;
    double tyre;


    public Gear1(double chainring,double cog, double rim, double tyre)
    {
        this.chainring = chainring;
        this.cog = cog;
        this.rim = rim;
        this.tyre = tyre;
    }


    double ratio()
    {
        return chainring/cog;
    }

    double gear_inches()
    {
        Wheel1 wheel = new Wheel1(rim,tyre);

        return ratio()*wheel.diameter();
    }
}


class Wheel1 {

    double rim;
    double tyre;

    public Wheel1(double rim,double tyre)
    {
        this.rim = rim;
        this.tyre = tyre;
    }

    double diameter()
    {
        return rim + (tyre*2);

    }

}

//snippet2
class WheelTest{
    public void test(){
        Wheel2 wheel = new Wheel2(26, 2);
        assertEquals(30,wheel.diameter());

    }
}

class Wheel2 {

    double rim;
    double tyre;

    public Wheel2(double rim,double tyre)
    {
        this.rim = rim;
        this.tyre = tyre;
    }

    double diameter()
    {
        return rim + (tyre*2);

    }
}