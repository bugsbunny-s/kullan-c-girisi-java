import java.util.Scanner;
public class user {
    public static void main(String[] args) throws Exception {
        String userName, password, control;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kayıt için Kullanıcı Adı giriniz : ");
        userName = inp.nextLine();

        System.out.print("Kayıt için Şifre giriniz :");
        password=inp.nextLine();

        if(userName != "" && password != "")
        {
            System.out.print("Kullanıcı Adınız : ");
            String user = inp.nextLine();

            System.out.print("Şifrenizi giriniz : ");
            String passw = inp.nextLine();

            if(userName.equals(user) && password.equals(passw)){
                System.out.print("Giriş Yapıldı.");
            }
            else {
                System.out.println("Hatalı Giriş. \n Şifrenizi değiştirmek istermisiniz. (y/n)");
                control = inp.nextLine();
                if(control.equals("y")|| control.equals("Y")){
                    System.out.print("Yeni Şifrenizi Yazınız : ");
                    String newPassword = inp.nextLine();
                    if(password.equals(newPassword)){
                        System.out.println("Şifreniz bir öncekiyle aynı olamaz.");
                    }
                    else {
                        System.out.println("Şifreniz başarıylar değiştirilmiştir. \n Yeni Şifreniz : "+ newPassword);
                    }
                }
                else {
                    System.out.println("Tekrar deneyiniz.");
                }
            }
          }  
          else{ 
            System.out.println("Hatalı veri girişi.");
        }
    }
}