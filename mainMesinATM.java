package mesinATM;
import java.util.Scanner;
public class mainMesinATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        mesinATM user[] = new mesinATM[3];
        user[0] = new mesinATM("654651621651","lionelmessi", "100592");
        user[1] = new mesinATM("665465421651","delldelldell", "120697");
        user[2] = new mesinATM("321656516516","claudiofcb", "362514");
        int pilihan;
        do {
System.out.println("===============================================");
            System.out.println("*********");
            System.out.println("** ATM **");
            System.out.println("*********");
            System.out.print("Masukkan id  : ");
            String nmr = in.next();
            System.out.print("Masukkan pin : ");
            String pass = in.next();
            System.out.print("Masukkan rekening : ");
            String rek = in.next();
System.out.println("===============================================");
            mesinATM userX = new mesinATM(rek, nmr, pass);
            for (int i = 0; i < user.length; i++) {
                if (user[i].noRekening.equals(userX.noRekening)) {
                    userX = user[i];
                }
            }
            boolean check = userX.loginCheck();
            if (check == false) {
                break;
            }
            do {
System.out.println("===============================================");
                System.out.println("1. Info Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Transfer");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu : ");
                pilihan = in.nextInt();
                switch (pilihan) {
                    case 1: {
                        userX.lihatSaldo();
                        System.out.println("");
                        break;
                    }
                    case 2: {
                        userX.tarikUang();
                        System.out.println("");
                        break;
                    }
                    case 3: {
                        System.out.print("Masukkan nomor rekening yang dituju : ");
                        String nomor = in.next();
                        for (int j = 0; j < user.length; j++) {
                                userX.transferUang(user[j]);
                                System.out.println("");
                                break;
                        }
                    }
                }
            } while (pilihan != 4);
        } while (pilihan != 0);
    }
}