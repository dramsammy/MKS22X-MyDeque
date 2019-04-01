public class Calculator extends MyDeque{
    private static double answer;
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] str = s.split(" ");
      MyDeque<Double> a = new MyDeque<Double>();
      EvalH(a, str);
      return a.getLast();
    }
    public static void EvalH(MyDeque<Double> a, String[] b){
      for (int i = 0; i < b.length; i++){
        if (b[i].equals("+")){
          double second = a.removeLast();
          double first = a.removeLast();
          a.addLast(first + second);
        }
        else if (b[i].equals("-")){
          double second = a.removeLast();
          double first = a.removeLast();
          a.addLast(first - second);
        }
        else if (b[i].equals("*")){
          double second = a.removeLast();
          double first = a.removeLast();
          a.addLast(first * second);
        }
        else if (b[i].equals("/")){
          double second = a.removeLast();
          double first = a.removeLast();
          a.addLast(first / second);
        }
        else if (b[i].equals("%")){
          double second = a.removeLast();
          double first = a.removeLast();
          a.addLast(first % second);
        }
        else{
          a.addLast(Double.parseDouble(b[i]));
          }
      }
    }
}
