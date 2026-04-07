
class DynamicArray {
    private int[] array;
    private int length;
    private int capacity;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length=0;
        this.array =  new int[this.capacity];
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i]=n;
    }

    public void pushback(int n) {
        if(length==capacity){
            resize();
        }
        this.array[length] =n;
        length++;
    }

    public int popback() {
        if(length>0){
            length--;
        }
        return this.array[capacity];
        }

    private void resize() {
        this.capacity= this.capacity*2;
        int[] newArray= new int[this.capacity];
        for(int i:this.array){
            newArray[i]=i;
        }
        this.array= newArray;
        this.length= newArray.length;
    }

    public int getSize() {
        return this.array.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
