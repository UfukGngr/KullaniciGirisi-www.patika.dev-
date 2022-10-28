import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName,passWord,passWord2;
        int sifreSıfırlama=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz:");
        userName=scan.nextLine();
        System.out.print("Şifrenizi giriniz:");
        passWord=scan.nextLine();

        if(userName.equals("java") && passWord.equals("java123")){
            System.out.println("Giriş başarılı.");
        }else if(userName.equals("java")&& !passWord.equals("java123")){
            System.out.println("Girilen bilgiler yanlış.");
            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            System.out.println("1-Şifremi unuttum");
            sifreSıfırlama=scan.nextInt();
                switch (sifreSıfırlama){
                    case 1:
                        System.out.print("Lütfen yeni şifrenizi giriniz:");
                        scan.nextLine();
                        passWord2=scan.nextLine();
                        if (passWord2.equals("java123")){
                            System.out.println("Yeni şifreniz eskisiyle aynı olamaz.Tekrar deneyiniz");
                            passWord2=scan.nextLine();
                            if(!passWord2.equals("java123") && !passWord2.equals(passWord)) {
                                System.out.println("Şifre değiştirme başarılı.");
                            }else if(!passWord2.equals("java123")&& passWord2.equals(passWord)){
                                System.out.println("Yeni şifre, hatalı girilen şifreyle aynı olamaz.Tekrar deneyiniz:");
                                passWord2=scan.nextLine();
                                if (!passWord2.equals(passWord) && !passWord2.equals("java123")){
                                    System.out.println("Şifre değiştirme başarılı.");
                                }else if(passWord2.equals("java123")){
                                    System.out.println("Yeni şifreniz eskisiyle aynı olamaz.Tekrar deneyiniz");
                                    passWord2=scan.nextLine();
                                    if (!passWord2.equals(passWord) && !passWord2.equals("java123")){
                                        System.out.println("Şifre değiştirme başarılı.");
                                    }else
                                        System.out.println("Çok sayıda yanlış deneme yaptınız.Daha sonra tekrar deneyiniz.");
                                }
                            }else if(passWord2.equals("java123")){
                                System.out.println("Çok sayıda yanlış deneme yaptınız.Daha sonra tekrar deneyiniz.");
                            }
                        }else if(passWord2.equals(passWord)){
                            System.out.println("Yeni şifre hatalı girilen şifreyle aynı olamaz.Tekrar deneyiniz");
                            passWord2=scan.nextLine();
                            if (!passWord2.equals(passWord) && !passWord2.equals("java123")){
                                System.out.println("Şifre değiştirme başarılı.");
                            }else if (passWord2.equals("java123")) {
                                System.out.println("Yeni girilen şifre eskisiyle aynı olamaz.");
                                passWord2=scan.nextLine();
                                if (!passWord2.equals(passWord) && !passWord2.equals("java123")) {
                                    System.out.println("Şifre değiştirme başarılı.");
                                }else
                                    System.out.println("Çok sayıda yanlış deneme yaptınız.Daha sonra tekrar deneyiniz.");
                            }else if(passWord2.equals(passWord)){
                                System.out.println("Yeni şifre hatalı girilen şifreyle aynı olamaz.");
                                System.out.println("Çok sayıda yanlış deneme yaptınız.Daha sonra tekrar deneyiniz.");
                            }
                        }else {
                            System.out.println("Şifre değiştirme başarılı.");
                        }
                        break;
                    default:
                        System.out.println("Yanlış tuşlama yaptınız.");
                }
            }
        }
    }
