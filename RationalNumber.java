public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    this.numerator = nume;
    if (deno == 0) {
      this.numerator = 0;
      this.denominator = 1;
    }
    this.denominator = deno;
  }


  public double getValue(){
    return (this.numerator / this.denominator);
  }


  /**
  *@return the numerator
  */
  public int getNumerator(){
    return this.numerator;
  }


  /**
  *@return the denominator
  */
  public int getDenominator(){
    return this.denominator;
  }


  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber answer = new RationalNumber(this.denominator, this.numerator);
    return answer;
  }


  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if (this.getNumerator() == other.getNumerator()) {
      if (this.getDenominator() == other.getDenominator()) {
        return true;
      }
    }
    return false;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    String answer = "";
    answer += this.getNumerator() + "/" + this.getDenominator();
    return answer;
  }


  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    // http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    int first = a;
    int last = b;
    int rem = 1;

    if (first < last) {
      first = b;
      last = a;
    }

    while (rem != 0) {
      rem = first % last;
      if (rem == 0) {
        return last;
      } else {
        first = last;
        last = rem;
      }
    }

    return 1;
  }


  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int gcd = this.gcd();
    this.numerator = this.numerator / gcd;
    this.denominator = this.denominator / gcd;
  }

  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
