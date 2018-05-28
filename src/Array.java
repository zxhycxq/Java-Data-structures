public class Array {
    private int[] data;
    private int size;

    /**
     *
     * @param capacity
     */
    public Array(int capacity){
        data=new int[capacity];
        size=0;
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }
    public boolean isEmpay(){
        return size == 0;
    }

  /*  public Array(){
        this(capacity 10);
    }*/
}
