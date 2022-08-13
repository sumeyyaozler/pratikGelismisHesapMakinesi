import java.util.Scanner;

public class Main {


static int sum(int a,int b){
    int result =a+b;
    System.out.println("toplama işlemi  : " + result);
    return result;
}
static int minues(int a, int b){
    int result = a -b;
    System.out.println("çıkarma işlemi  : " + result);
    return result ;

}
static int times(int a, int b){
    int result = a*b;
    System.out.println("çarpma işlemi  : "+ result);
    return result;

}
static int divided(int a, int b){
    if(b ==0){
        System.out.println();
        return 0;
    }
    int result =a/b;
    System.out.println("bölme işlemi  : " + result);
    return  result ;
}
static int power(int a, int b){
    int result =1;
    for(int i =1;i<b;i++){
        result *=a;

    }
    System.out.println(" üst alma :   " + result);
    return result;
}
static int mod(int a, int b){
    int result =a%b;
    System.out.println("mod alma   :  " + result);
    return result;
}
static void calc(int a, int b){
    System.out.println("alan  : " +(a*b));
    System.out.println("çevre  : " + 2*(a+b));

}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu ="1-Toplama İşlemi\n"
                +"2-Çıkarma İşlemi\n"
                +"3- Çarpma İşlemi\n"
                +"4- Bölme İşlmei"
                +"5-Üslü sayı Hesaplama\n"
                +"6-Mod Alma\n"
                +"7-Dikdöertgen Alan ve Çevre Hesabı\n"
                +"0-Çıkış yap";
        while(true){

            System.out.println(menu);
            System.out.println("Bir işlem seçiniz :");
            select =scan.nextInt();
            if(select ==0){
                break;
            }
            System.out.println("a sayısını giriniz :");
            int a = scan.nextInt();
            System.out.println("b sayısını giriniz :");
            int b = scan.nextInt();


            switch (select){
                case 1:
                    sum(a,b);
                  break;
                case 2:
                    minues(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    calc(a,b);
                    break;

            }

        }


        }

    }

