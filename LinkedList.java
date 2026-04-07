import java.util.ArrayList;

class LinkedList {
    private LLN head;
    private LLN tail;
    
   

    public LinkedList() {
        this.head = new LLN(-1);
        this.tail=this.head;
    }

     public class LLN{
        private int val;
        private LLN next;
            public LLN(int val){
        this.val=val;

            }
    }

    public int get(int index) {
        LLN current = head.next;
        int i=0;
        while(current!=null){
            if(i==index){
                return current.val;
            }
            i++;
            current=current.next;
        }
        return -1;
        
    }

    public void insertHead(int val) {
        LLN oldHead=head.next;
        head.next= new LLN(val);
        head.next.next=oldHead;        
        
    }

    public void insertTail(int val) {
        tail.next= new LLN(val);
        tail=tail.next;

    }

    public boolean remove(int index) {
        LLN current = head.next;
        int i =0;
        while(current!=null){
            if(i-1==index&&current.next!=null){
                current.next=current.next.next;
                return true;
            }
            else if(i-1==index&&current.next!=null){
                current.next=null;
                return true;
            }
            i++;
        }

        return false;
    }

    public ArrayList<Integer> getValues() {
        LLN current= head.next;
        ArrayList<Integer> vals = new ArrayList<>();
        while(current!=null){
            vals.add(current.val);
            current=current.next;
        }
        return vals;
    }
}
