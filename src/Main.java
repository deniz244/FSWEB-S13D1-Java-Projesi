import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------HAVLAYAN KÖPEĞİMİZ----------");
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
        System.out.println("------YAŞ TESPİTİ------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("---------OYUNCU KEDİ-------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("-----------ALAN HESAPLAMA-------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height of rectangle: ");
        double height = scanner.nextDouble();
        System.out.println("Area of rectangle: " + area(width,height));
        System.out.println("-----RADIUS----");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = scanner2.nextDouble();
        System.out.println("Area of the circle:" + area(radius));
    }

    public static boolean shouldWakeUp(boolean hav, int hour) {

        if(!hav || (hour < 0 || hour > 23)) return false;
        else if(hav && (hour<8 || hour>=20)){
            return true;
        }else {
            return false;
        }

    }

    public static boolean hasTeen(int... nums) {
        for(int num: nums){
            if (num >= 13 && num <= 19){
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean summer, int temp){
        if(!summer && (temp >= 25 && temp <= 35)){
            return true;
        } else if (summer && (temp >= 25 && temp <= 45)) {
            return true;
        }else{
            return false;
        }
    }

    public static double area(double num1, double num2) {
        if(num1 > 0 && num2 > 0){
            return num1*num2;
        }else{
            return -1;
        }
    }

    public static double area(double radius) {
        if(radius > 0){
            return radius*radius*Math.PI;
        }else{
            return -1;
        }
    }

}