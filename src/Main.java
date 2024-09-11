/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
    int answer = add(3,4);
    int answer2= tripleadd(3,4,5,6);
    String mgreeting = morningGreeting("Mac Miller");
    String agreeting = afternoonGreeting("Mac Miller");
    String triple = tripleText("oohYah");
    double half = half(17);
    int roundPos = roundPositiveValueToNearestInteger(13.4);
    int roundNeg = roundNegativeValueToNearestInteger(-13.6);

    System.out.println(answer +"\n"
            + answer2 +"\n"
            +mgreeting+"\n"
            +agreeting+"\n"
            +triple+"\n"
            +half+"\n"
            +roundPos+"\n"
            +roundNeg);

    }

    // 1. add
    public static int add(int num1, int num2 ) {

        int answer = num1+num2;
        return answer;
    }
    // 2. add
    public static int tripleadd(int num1, int num2, int num3, int num4 ) {

        int sum1 = add(num1,num2);
        int sum2 = add(num3,num4);
        int answer = add(sum1,sum2);

        return answer;
    }
    // 3. morningGreeting
    public static String morningGreeting (String name ) {
        String morningMessage = "早上好" + name;
        return morningMessage;
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting (String name ) {
        String afternoonMessage = "下午好" + name;
        return afternoonMessage;
    }
    // 5. triple
    public static String tripleText (String text ) {
        String tripletext = text+text+text;
        return tripletext;
    }
    // 6. half
    public static double half (double num1 ) {
        double half = num1/2;
        return half;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) (a + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        return (int) (a - 0.5);
    }
}
