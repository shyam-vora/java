import java.util.Scanner;

class p15{
    public static void main(String[] args) {
        float calls;
        float bills;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nummber of calls : ");
        calls = sc.nextInt();
        if (calls <= 100)
    {
        bills = 200;
    }
    else if (calls > 100 && calls <= 150)
    {
        calls = calls - 100;
        bills = (float) (200+(0.60 * calls));
    }
    else if (calls > 150 && calls <= 200)
    {
        calls = calls - 150;
        bills = (float) (200 + (0.60 * 50) + (0.50 * calls));
    }
    else
    {
        calls = calls - 200;
        bills = (float) (200 + (0.60 * 50) + (0.50 * 50) + (0.40 * calls));
    }

        System.out.println("Pay : " + bills);

    }
}