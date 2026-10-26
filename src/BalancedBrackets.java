public class BalancedBrackets {
    public static boolean isbalanced(String s) {
        BracketStack stack = new BracketStack();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current=='(' || current == '[' || current == '{'){
                stack.push(current);
            }else if(current == ')' || current == ']' || current == '}'){
                if(stack.isempty()){
                    return false;
                }
                char opening = stack.pop();
                if(!ismatchingpair(opening, current)){
                    return false;
                }
            }
        }
        return stack.isempty();
    }
    private static boolean ismatchingpair(char opening, char closing){
        if(opening == '(' && closing == ')'){
            return true;
        }
        if(opening == '[' && closing == ']'){
            return true;
        }
        if(opening == '{' && closing == '}'){
            return true;
        }
        return false;
    }
}
