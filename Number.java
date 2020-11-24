public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other RealNumber
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    if (this.compareTo(other)) {
      return 0;
    } else if (this.getValue() < other.getValue()) {
      return -1;
    } else {
      return 1;
    }
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
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
}
