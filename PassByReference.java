

public class PassByReference {
    public static void main(String[] args){
        MyData data = new MyData(0);


        System.out.println("Start Data: " + data.x);
        
        incrementData(data);

        System.out.println(String.format("incrementData Data: %s", data.x));

        incrementInt(data.x);

        System.out.println(String.format("incrementData + incrementInt Data: %s", data.x));

        int x = 42;
        incrementInt(x);
        System.out.println(String.format("incrementInt x: %s", x));
    }

    static void incrementData(MyData data){
        data.x += 1;
    }

    static void incrementInt(int x){
        x += 1;
    }
}


class MyData {
    int x;

    public MyData(int x){
        this.x = x;
    }
}