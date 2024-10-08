
//math api
//we dont need to separately import this class bcz its already present in our program (Java.lang)

//math api :-

//Math.abs   :- absolute = unsigned value(it doesnt give negative signed value)
//Math.floor :- gives the lower value
//Math.ceil  :- gives the heigher value
//Math.sqrt  :- givess square root of values
//Math.cbrt :- gives cube root of values
//Math.pow :-  gives power of values
//Math.round :- rounds off to the nearest number
//Math.max  :- returns the bigger value out of the given values
//Math.min :-  returns the smaller value out of the given values


package MathClass;

public class AllYouNeedToKnow {

    public static void main(String[] args) {
        int a = 5, b = 4;
        System.out.println(Math.abs(a - b));

        System.out.println(Math.floor(5.6));

        System.out.println(Math.ceil(5.8));
        System.out.println(Math.sqrt(4.5));

        System.out.println(Math.pow(8, 2));
//        (1st , 2nd )  1st-> jiski power nikalna h ; 2nd -> power {2 ki power 3 ; 2 ^3}

        System.out.println(Math.max(4, 5));
        System.out.println(Math.min(6, 2));

        System.out.println(Math.round(4.3));
        System.out.println(Math.PI);
//      it tells the PI's value
    }
}




