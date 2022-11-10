import java.util.Scanner;

public class ComplexTest
{
    public static void main (String[] args)
    {

        double real, img;
        Scanner sc = new Scanner(System.in);
        Complex num = new Complex();
        System.out.println("Введите действительную часть числа:");
            real = sc.nextDouble();
                num.setReal(real);
        System.out.println("Введите мнимую часть числа:");
            img= sc.nextDouble();
                num.setImg(img);
        System.out.println("Результаты:");
        System.out.println("|z| = " + num.mod());
        System.out.println("ArgZ = " + num.arg());

        System.out.println("Введите действительную часть второго числа:");
            real = sc.nextDouble();
        System.out.println("Введите мнимую часть числа:");
            img= sc.nextDouble();

        num.add(real, img);
        if (num.getImg()<0)
            System.out.println("Z1 + Z2 = "+ num.getReal() + num.getImg() +"i");
        else
            System.out.println("Z1 + Z2 = "+ num.getReal() + "+" + num.getImg() +"i");

        num.sub(real, img);
        if (num.getImg()<0)
            System.out.println("Z1 - Z2 = "+ num.getReal() + num.getImg() +"i");
        else
            System.out.println("Z1 - Z2 = "+ num.getReal()+ "+" +num.getImg()+"i");
    }
}
