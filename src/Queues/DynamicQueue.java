package Queues;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int value) {
        if (isFull()){
            int[] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i)% data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        return super.insert(value);
    }
}
