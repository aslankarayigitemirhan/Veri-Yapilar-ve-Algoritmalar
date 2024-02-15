public class ArrayList<E>{
    public static final int CAPACITY = 16;
    private E[] data;
    private int size = 0;
    //Constructors:
    public ArrayList(){
        this.data = (E[]) new Object[CAPACITY];
    }
    public ArrayList(int capacity){
        this.data = (E[]) new Object[capacity];
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    protected void checkIndex(int i, int n)throws IndexOutOfBoundsException{
        if(i < 0 || i >= n)
            throw new IndexOutOfBoundsException("Illegal Index " + i);
    }
    public E get(int i)throws IndexOutOfBoundsException{
        checkIndex(i,size);
        return this.data[i];
    }
    public E set(int i, E e)throws IndexOutOfBoundsException{
        checkIndex(i,size);
        E oldElement = this.data[i];
        this.data[i] = e;
        return oldElement;
    }
    public void add(int i, E e)throws IndexOutOfBoundsException,IllegalStateException{
        checkIndex(i,size + 1);
        if(this.data.length == size)
            throw new IllegalStateException("Array is FULL");
        for(int index = size -1; index >= i; index++){
            this.data[index + 1] = this.data[index];
        }
        this.data[i] = e;
        size++;
    }
    public E remove(int i)throws IndexOutOfBoundsException{
        checkIndex(i,size);
        E removedElement = this.data[i];
        for(int index = i; index < size-1;index++){
            this.data[index] = this.data[index + 1];
        }
        this.data[size-- - 1] = null;
        return removedElement;
    }

    public void displayElements(){
        if(isEmpty()){
            System.out.println("Empty List! ");
            return;
        }
        for(E e : this.data){
            if(e == null)
                return;
            System.out.print(e.toString() + " ");
        }


    }

}
class Test{
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add(0,"Emirhan");
        al.add(1,"Ayse");
        al.displayElements();
        System.out.println();
        al.set(0,"Eda");
        al.displayElements();
    }
}
