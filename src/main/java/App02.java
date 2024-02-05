public class App02 {

    public static void main(String[] args) {

       char ch1 = 'a';
       char text = 'a';

        System.out.println(" a " + text + " unicode : " + (int)text);

        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        int sum = (int)(korean + math + english);
        int avg = (int)(korean + math + english) / 3;

        System.out.println("korean + math + english" + sum);
        System.out.println("korean + math + english " + avg);

    }

}
