// chapter 3

//snippet 1 (injecting dependency)

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
		return ratio() * (new Wheel(rim, tire).diameter());
	}
}

//snippet 2 (isolating dependency)

class Gear {
	private double chainring, cog, rim, tire;
	private Wheel wheel;

	Gear(double chainring, double cog, double rim, double tire)  {
		this.chainring = chainring;
		this.cog = cog;
		this.wheel = new Wheel(rim, tire);
	}

	public double ratio() {
		return chainring / cog;
	}

	public gear_inches() {
		return ratio() * wheel.diameter();
	}
}


//removing argument order dependencies
new Gear(52, 11, new Wheel(26, 1.5)).gear_inches()

//reversing dependencies

class Gear {
	private double chainring, cog, rim, tire;

	Gear(double chainring, double cog)  {
		this.chainring = chainring;
		this.cog = cog;
	}

	public double ratio() {
		return chainring / cog;
	}

	public gear_inches(diameter) {
		return ratio() * diameter();
	}
}

class Wheel {
	private double rim, tire;
	private Gear gear;

	Wheel(double rim, double tire, double gear) {
		this.tire = tire;
		this.rim = rim;
		this.gear = gear;
	}

	public double diameter() {
		return rim + tire * 2;
	}

	public double gear_inches() {
		return gear.gear_inches(diameter());
	}

}


