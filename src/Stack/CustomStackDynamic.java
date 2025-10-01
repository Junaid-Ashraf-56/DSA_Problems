package Stack;

public class CustomStackDynamic extends CustomStackStatic{
    public CustomStackDynamic() {
        super();
    }

    public CustomStackDynamic(int size) {
        super(size);
    }

    @Override
    public boolean push(int value){
        if (isFull()){
            int[] temp = new int[data.length*2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        return super.push(value);
    }
}
