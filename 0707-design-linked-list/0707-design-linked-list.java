class Node{ 
            int data ;
            Node next ;

            Node(int data){
                this.data = data ;
            }

    }

class MyLinkedList {
    
     

    public Node head ;
    public int len ;
    public MyLinkedList() {
        head = null ;
        len = 0 ;
        
    }
    
    public int get(int index) {
        if(index < 0  || index >= len) return -1 ;
        Node ptr = head ;

        for(int i = 0 ; i < index ; i++){
            ptr = ptr.next ;
        }
        return ptr.data ;
    }
    
    public void addAtHead(int data) {
        Node newNode = new Node(data); 
        newNode.next = head ;
        head = newNode ;
        len++ ;
    }
    
    public void addAtTail(int data) {
        Node newNode = new Node(data) ;
        
        if(head == null) head = newNode ;
        else {
            Node ptr = head ;
            while(ptr.next != null){
                ptr = ptr.next ;
            }
            ptr.next = newNode ;
        }
        len++ ;
    }
    
    public void addAtIndex(int index, int data) {
        if(index < 0 || index > len) return ;
        if(index == 0){
            addAtHead(data) ;
            return ;
        }

        Node ptr = head ;
        for(int i = 0 ; i < index - 1 ; i++) ptr = ptr.next ;

        Node newNode = new Node(data) ;
        newNode.next = ptr.next ;
        ptr.next = newNode ;
        len++ ;
    }

    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= len ) return ;
        if(index == 0) head = head.next ;
        else{
            Node ptr = head ;
            for(int i = 0 ; i < index - 1 ; i++){
                ptr = ptr.next ;
            }
            ptr.next = ptr.next.next ;
        }
        len-- ; 
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