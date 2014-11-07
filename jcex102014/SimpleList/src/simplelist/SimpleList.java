package simplelist;
public class SimpleList {
    private ListNode head = null;
    public void put(int val){
        if(head==null){
            head = new ListNode(val);
        } else {
            ListNode current = head;
            while(current.next!=null) current=current.next;
            current.next = new ListNode(val);
        }
    }
    public int get(int index){
        if(index==0&&head!=null) return head.value;
        ListNode current = head;
        int counter = 1;
        while(current.next!=null) {
            current = current.next;
            if(counter++==index){
                return current.value;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
       SimpleList list = new SimpleList();
       for(int i=1;i<101;i++){
           list.put(i*10);
       } 
       System.out.println(list.get(0));
       System.out.println(list.get(49));
       System.out.println(list.get(99));
       System.out.println(list.get(100)); 
    }
}
