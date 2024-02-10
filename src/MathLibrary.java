import java.sql.SQLOutput;

public class MathLibrary
{
    public static void main(String[] args)
    {
        System.out.println(Math.class);
        //class java.lang.Math
        System.out.println(Math.E);
        //Euler's number (e). Output is 2.718281828459045
        System.out.println(Math.PI);
        //pi. Output is 3.141592653589793
        System.out.println(Math.abs(-9));
        //Absolute value. Output is 9
        //Math.abs has float, int, and long
        System.out.println(Math.acos(-1));
        //arc cosine value. Output is 3.141592653589793
        System.out.println(Math.acos(0));
        //Output is 1.5707963267948966
        System.out.println(Math.addExact(4,5));
        //It adds the value exactly to prevent errors. Output is 9
        System.out.println(Math.asin(1));
        //arc sine value. Output is 1.5707963267948966
        System.out.println(Math.atan(1));
        //arc tangent value. Output is 0.7853981633974483
        System.out.println(Math.atan2(6,3));
        //arc tangent square value. Output is 1.1071487177940904
        System.out.println(Math.cbrt(8));
        //cbrt = cube root. Output is 2.0
        System.out.println(Math.ceil(2.3));
        //ceil = ceiling value. It rounds up a number even it is lower than 5. Output is 3.0
        System.out.println(Math.copySign(4,-2));
        //It copies the sign of the second argument for the first argument. Output is -4.
        System.out.println(Math.cos(0.5));
        //cosine value. Output is 0.8775825618903728
        System.out.println(Math.cosh(-0.2));
        //hyperbolic cosine value. Output is 1.020066755619076
        System.out.println(Math.decrementExact(25));
        //It decrements 1. Output is 24
        System.out.println(Math.exp(1));
        //Math.exp = Math.E raise to n. Output is 2.718281828459045
        System.out.println(Math.expm1(1));
        //Returns e raised to the power of a number, subtracted by 1. Output is 1.718281828459045
        System.out.println(Math.floor(2.5));
        //It rounds down the value even it is greater than or equal to 5. Output is 2.0
        System.out.println(Math.floorDiv(5,2));
        //floorDiv is Floor Division (//). Output is 2 which disregards remainder.
        System.out.println(Math.floorMod(5,2));
        //floorMod is Floor Modulus (/&). Output is 1 which returns the remainder.
        System.out.println(Math.getExponent(64));
        //Returns the unbiased exponent used in the representation of a double or float.
        //Output is 6. Search more details regarding this.
        System.out.println(Math.hypot(3,4));
        //hypot = hypotenuse. Gets the hypotenuse using pythagorean theorem. Output is 5.0.
        System.out.println(Math.IEEEremainder(5.4,3.1));
        //method computes the remainder operation on two arguments as prescribed by the IEEE 754 standard.
        //Output is -0.7999999999999998.
        System.out.println(Math.incrementExact(9));
        //Increments the value by 1. Output is 10.
        System.out.println(Math.log(Math.E));
        //log = logarithmic. Output is 1.0
        System.out.println(Math.log10(12));
        //log 10 =  logarithm base 10. Output is 1.0791812460476249.
        System.out.println(Math.max(9,25));
        //Returns the maximum value between two arguments. Output is 25.
        System.out.println(Math.min(10,18));
        //Returns the minimum value between two arguments. Output is 10.
        System.out.println(Math.multiplyExact(2,4));
        //Multiplies exactly to prevent error. Output is 8.
        System.out.println(Math.negateExact(43));
        //Returns a positive value to negative value. Output is -43.
        System.out.println(Math.nextAfter(31.432,-5.4));
        /* Returns the floating-point number adjacent to the first argument in the direction of the second
        argument. Search more detail regarding this.

        I guess this is limit.
        Output is 31.431999999999995.
         */
        System.out.println(Math.nextDown(43));
        //Output is 42.999996
        System.out.println(Math.nextUp(52));
        //Output is 52.000004
        System.out.println(Math.pow(3,4));
        //pow = power. Used to calculate a number raise to the power of some other number. Output is 81.0.
        System.out.println(Math.random());
        //generates a random number. Example output is 0.13718668749323426.
        System.out.println(Math.rint(5.69));
        //Returns a value that is closest to the specified value and its equal to the mathematical integer.
        //Output is 6.0
        System.out.println(Math.round(6.501));
        //Round up when the next number is greater than or equal to 5. Output is 7.
        System.out.println(Math.scalb(3,2));
        //used to get the value a x 2^scale. 3 x 2^2 = 3 x 4 = 12. Output is 12.0
        System.out.println(Math.signum(90));
        //Returns the significance number. Output is 1.0
        System.out.println(Math.sin(-0.2));
        //sin = sin value. Output is -0.19866933079506122.
        System.out.println(Math.sinh(-0.2));
        //hyperbolic sin. Output is -0.20133600254109402.
        System.out.println(Math.sqrt(4));
        //sqrt = square root. Output is 2.0.
        System.out.println(Math.subtractExact(6,3));
        //Subtracts exactly to prevent error. Output is 3.
        System.out.println(Math.tan(5));
        //tan = tangent. Output is -3.380515006246586.
        System.out.println(Math.tanh(0.3));
        //hyperbolic tangent. Output is 0.2913126124515909.
        System.out.println(Math.toDegrees(0.45));
        //Converts angular radian to degrees. Output is 25.783100780887047.
        System.out.println(Math.toIntExact((long) 6.5));
        //Convert a long to exact integer. Output is 6. Need to be narrowly casted.
        System.out.println(Math.toRadians(90));
        //Converts degrees to angular radian. Output is 1.5707963267948966.
        System.out.println(Math.ulp(6.4444));
        //Returns the size of an ulp of the argument. An ulp, unit in the last place, of a double value is the
        //positive distance between this floating-point value and the double value next larger in magnitude.
        //Output is 8.881784197001252E-16.
    }
}
