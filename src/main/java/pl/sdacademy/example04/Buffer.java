package pl.sdacademy.example04;

class Buffer {

    private int buffer[];
    private int count;

    public Buffer(int size) {
        buffer = new int[size];
    }

    public void put(int element) {
        buffer[count] = element;
        count++;
    }

    public int get() {
        count--;
        int element = buffer[count];
        return element;
    }

}

