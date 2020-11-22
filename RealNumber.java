public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return "" + getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other){
    double currVal = this.getValue();
    double newVal = other.getValue();
    double percent = 0.001 * 0.01 * currVal;
    double diff = 0.0;

    if (currVal >= newVal) {
      diff = currVal - newVal;
    } else {
      diff = newVal - currVal;
    }

    if (currVal.equals(0)) {
      return (newVal.equals(0));
    } else if (newVal.equals(0)) {
      return (currVal.equals(0));
    } else if (diff > percent) {
      return false;
    }

    return true;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
   //other can be ANY RealNumber, including a RationalNumber
   //or other subclasses of RealNumber (that aren't written yet)
   double currVal = this.getValue();
   double newVal = other.getValue();
   RealNumber answer = new RealNumber();
   answer = currVal + newVal;
   return answer;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    double currVal = this.getValue();
    double newVal = other.getValue();
    RealNumber answer = new RealNumber();
    answer = currVal * newVal;
    return answer;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
    double currVal = this.getValue();
    double newVal = other.getValue();
    RealNumber answer = new RealNumber();
    answer = currVal / newVal;
    return answer;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    double currVal = this.getValue();
    double newVal = other.getValue();
    RealNumber answer = new RealNumber();
    answer = currVal - newVal;
    return answer;
  }

}
