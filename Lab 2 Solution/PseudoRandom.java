public class PseudoRandom {
    private int seed;
    private int multiplier;
    private int increment;
    private int modulus;
	
	//Cosntructor with parameters
    public PseudoRandom(int seed, int multiplier, int increment, int modulus) {
        this.seed = seed;
        this.multiplier = multiplier;
        this.increment = increment;
        this.modulus = modulus;
    }
	
	//Setters (Will set values to the instance variables)
    public void setSeed(int seed) {
        this.seed = seed;
    }
    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
    public void setIncrement(int increment) {
        this.increment = increment;
	}
	public void setModulus(int modulus) {
        this.modulus = modulus;
	}
	
	//Generate next number (Will generate the next pseudorandom number and update the seed)
	public int getNextNumber() {
		seed = (multiplier*seed+increment) % modulus;
		return seed;
	}
	
}