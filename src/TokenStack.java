public class TokenStack{
    private class node{
        String data;
        node next;
        node(String data){
            this.data = data;
            this.next = null;
        }
    }
    private node top;
    public TokenStack(){
        top = null;
    }
    public void push(String value){
        node newnode = new node(value);
        newnode.next = top;
        top = newnode;
    }
    public String pop(){
        if(isempty()){
            throw new IllegalStateException("stack is empty");
        }
        String value = top.data;
        top = top.next;
        return value;
    }
    public boolean isempty(){
        return top == null;
    }
}
