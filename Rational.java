// Frances Shapiro
// pd 8
// HW27
// 2013-11-18


public class Rational {

    private int num;
    private int den;

    public Rational() {
	num = 0;
	den = 1;
    }

    public Rational( int n, int d) {
	String message;
	if (d == 0) {
	    message = "Invalid denominator. Cannot be 0, changing to 1.";
	    
	    num = n;
	    den = 1;

	System.out.print(message);
	}
	else{
	num = n;
	den = d;
	    }

    }


    public float floatValue() {
	float ans;
	ans = ((float) num) / ((float) den);
	return ans;
    }

    public void multiply(Rational foo) {

	num *= (foo.num);

	den *= (foo.den);
    }


    public void divide(Rational foo) {
	if (foo.num != 0) {
	num *= (foo.den);

	den *= (foo.num);
    }
    else {
    	System.out.println("Cannot divide by 0")
    }
    }

    public String toString() {
	String message = "";

	if (num >=0 && den > 0) {
	    message = "This rational number is: " + num + "/" + den + " a.k.a. " + num/(double) den;
	}

	else if ((num >=0 && den < 0) || (num < 0 && den > 0)) {
	    message = "This rational number is: " + "-" + Math.abs(num) + "/" + Math.abs(den) + " a.k.a. " + num/(double) den;
	}

	else if (num < 0 && den < 0) {
	    message = "This rational number is: " + Math.abs(num) + "/" + Math.abs(den) + " a.k.a. " + num/(double) den;
	}

	return message;
    }


    //part 2

   public void add(Rational foo) {
       num = num*(foo.den) + (foo.num)*den;

	den *= (foo.den);
    } 


   public void subtract(Rational foo) {
       num = num*(foo.den) - (foo.num)*den;

	den *= (foo.den);
    } 


   public int gcd() {
       int a = Math.max(num, den);
       int b = Math.min(num, den);

        while (b != 0) {
            int ans = b;
            b = a % b;
            a = ans;
        }
        return a;
    }

 public void reduce() {
     int gcd = this.gcd();

     num /= gcd;

     den /= gcd;

    }


    //part 3

  public static int gcdint(int a, int b) {
        while (b != 0) {
            int ans = b;
            b = a % b;
            a = ans;
        }
        return a;
    }

    public int compareTo(Rational foo) {
	int ans;
	if ((foo.floatValue()) == (this.floatValue())) {
	    ans = 0;
	}
	else if ((foo.floatValue()) > (this.floatValue())) {
	    ans = -80;
	}
	else ans = 80;
	return ans;
    }




    public static void main(String [] args) {
Rational r = new Rational(2,3); //Stores the rational number 2/3
Rational s = new Rational(1,2); //Stores the rational number 1/2
Rational q = new Rational(3,30);
Rational t = new Rational(-10,100);



System.out.println(r.compareTo(s));


System.out.println(r);
System.out.println(s);
r.multiply(s);
System.out.println(r);

System.out.println(q);
q.reduce();
System.out.println(q);


q.add(r);
System.out.println(q);


r.add(s);
System.out.println(r);

s.add(r);
System.out.println(s);

System.out.println(t);
t.reduce();
System.out.println(t);

System.out.println(Math.abs(-10));
    }



}
