/*These operators perform an operation and assignment in one step.

Operator	  Example	     Equivalent To	      Description
+=	          x += y	      x = x + y	          Add and assign
-=	          x -= y	      x = x - y	          Subtract and assign
*=	          x *= y	      x = x * y	          Multiply and assign
/=	          x /= y	      x = x / y	          Divide and assign
%=	          x %= y	      x = x % y	          Modulus and assign
&=	          x &= y	      x = x & y	          Bitwise AND and assign
`=`	          x |= y	      x = x | y
^=	          x ^= y	      x = x ^ y           Bitwise XOR and assign
<<=	          x <<= y      	  x = x << y	      Left shift and assign
>>=	          x >>= y      	  x = x >> y	      Right shift and assign
>>>= x        >>>= y	      x = x >>> y	      Unsigned right shift and assign
*/
public class assignmentoperator {
    public static void main(String[] args) {
        int a = 10;  // simple assignment
        int b = 5;

        a += b; // a = a + b → 15
        System.out.println("a += b: " + a);

        a -= b; // a = a - b → 10
        System.out.println("a -= b: " + a);

        a *= b; // a = a * b → 50
        System.out.println("a *= b: " + a);

        a /= b; // a = a / b → 10
        System.out.println("a /= b: " + a);

        a %= b; // a = a % b → 0
        System.out.println("a %= b: " + a);
    }
    
}
