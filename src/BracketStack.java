public class BracketStack{
    private class node{
        char data;
        node next;
        node(char data){
            this.data = data;
            this.next = null;
        }
    }
    private node top;
    public BracketStack() {
        top = null;
    }
    public void push(char value) {
        node newnode = new node(value);
        newnode.next = top;
        top = newnode;
    }
    public char pop(){
        if(isempty()){
            throw new IllegalStateException("stack is empty");
        }
        char value = top.data;
        top = top.next;
        return value;
    }
    public char peek(){
        if (isempty()){
            return '\0';
        }
        return top.data;
    }
    public boolean isempty(){
        return top == null;
    }
}
