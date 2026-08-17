class MyLinkedList {

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;;
        }
    }
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
        return;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        } 
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        tail=newNode;
        size++;
        return;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode=new Node(val);
        if(index < 0 || index > size){
             return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next= temp.next;
        temp.next=newNode;
        size++;
        return;
    }
    
    public void deleteAtIndex(int index) {
        if(head==null){
            return;
        }
        int sz=0;
        Node temp=head;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        if(index<0 || index>=sz){
            return ;
        }
        if(index==0){
            head=head.next;
            size--;
            return;
        }
    
        temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(index==size-1){
            tail=temp;
        }
        size--;
        return ;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */