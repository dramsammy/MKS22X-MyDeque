public class Calculator extends MyDeque{
    private static double answer;
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] str = s.split();
      MyDeque<Double> a = new MyDeque<Double>();
      EvalH(a, str);
      return a.getLast();
    }
    public static double EvalH()
}
