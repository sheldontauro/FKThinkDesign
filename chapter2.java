//snippet1
class Gear {
	private double chainring, cog, rim, tire;

	Gear(double chainring, double cog, double rim, double tire)  {
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}

	public double ratio() {
		return chainring / cog;
	}

	public gear_inches() {
		return ratio() * (rim + (tire * 2));
	}

	public static void main(String[] args) {
		double newGear = new Gear(52, 11, 26, 1.25).gear_inches();
		System.out.println(newGear);
		newGear = new Gear(52, 11, 24, 1.25).gear_inches();
		System.out.println(newGear);
	}

}



//snippet 2 -> better code

class Wheel {
	private double rim, tire;

	Wheel(double rim, double tire) {
		this.tire = tire;
		this.rim = rim;
	}

	public double diameter() {
		return rim + tire * 2;
	}

	public double circumference() {
		return diameter * Math.PI;
	}

}

class Gear {
	private double chainring, cog;
	private Wheel = wheel;

	Gear(double chainring, double cog, Wheel wheel)  {
		this.chainring = chainring;
		this.cog = cog;
		this.wheel = wheel;
	}

	public double ratio() {
		return chainring / cog;
	}

	public gear_inches() {
		return ratio() * wheel.diameter();
	}
}

public class newClass {
	public static void main(String[] args) {
		Wheel wheel = new Wheel(26, 1.5);
		System.out.println(wheel.circumference);
		double ans = new Gear(52, 11, wheel).gear_inches();
		System.out.println(ans);
	}
}


//