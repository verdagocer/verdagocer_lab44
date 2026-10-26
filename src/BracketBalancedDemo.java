public class BracketBalancedDemo{
    public static void main(String[] args){
        String[] expressions={
                "[{()}]",
                "[()()]{}",
                "([]",
                "([{]})",
                "abc{defg(ijk)l[mn]op}qr",
                "a(bc)def]"
        };
        System.out.println("==========BALANCED BRACKET TEST==========");
        for (String expression:expressions) {
            boolean result=BalancedBrackets.isbalanced(expression);
            System.out.println("Input: " + expression + " -> Output: " + result);
        }
    }
}
