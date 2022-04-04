import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select,girisTutari,cikisTutari;



        while (right > 0){
            System.out.print("Kullanici adiniz : ");
            userName = input.nextLine();
            System.out.print("Sifreniz : ");
            password = input.nextLine();
            if (userName.equals("ben123") && password.equals("asd123")){
                System.out.println("Hosgeldiniz ! Giris Basarili!!");
                do{
                    System.out.println("Lutfen yapmak istediginiz islemi seciniz.");
                    System.out.println("1 - Para yatirma\n" +
                            "2 - Para cekme\n" +
                            "3 - Bakiye Sorgula\n" +
                            "4 - Cikis Yap");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Yatirmak istediginiz tutari giriniz : ");
                            girisTutari = input.nextInt();
                            balance += girisTutari;
                            System.out.println("Guncel bakiyeniz : " + balance);
                            break;

                        case 2 :
                            System.out.println("Cekmek istediginiz tutari giriniz :");
                            cikisTutari = input.nextInt();
                            if(balance < cikisTutari){
                                System.out.println("Hesabinizda yeterli bakiye yoktur!");
                            }else{
                                balance -= cikisTutari;
                                System.out.println("Guncel bakiyeniz : " + balance);
                            }
                            break;
                        case 3 :
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }


                }while( select >=0 && select <= 3  );
                System.out.println("Yine bekleriz ");
                break;

            }else {
                right --;
                System.out.println("Hatali kullanici girisi veya sifre. Tekrar deneyiniz");
                if (right == 0){
                    System.out.println("Hesabiniz bloke olmustur lutfen banka yetkilisiyle gorusunuz!");
                }else{
                    System.out.println("Kalan hakkiniz : " + right);
                }

            }

        }

    }
}