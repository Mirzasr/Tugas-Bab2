
public class ATM {

    int pass, passInput;
    double saldo, out;
    long rekLain;
    String confirm, again;

    public ATM() {
        pass = 12345;
        saldo = 1000000;
    }

    public boolean cekPass() {
        return (passInput == pass);
    }

    public void showMenu() {
        System.out.println("1 Cek saldo");
        System.out.println("2 Tarik uang");
        System.out.println("3 Transfer ke rekening lain");
    }

    public boolean cekKelipatan() {
        return (out % 50000 == 0);
    }

    public void uangKeluar() {
        saldo = saldo - out;
    }

    public void konfirmasi() {
        switch (confirm) {
            case "y":
                uangKeluar();
                if (saldo < 0) {
                    saldo += out;
                    System.out.println("Saldo tidak mencukupi. Transaksi dibatalkan..");
                    break;
                } else {
                    System.out.println("Transaksi sukses..");
                    break;
                }
            case "n":
                System.out.println("Transaksi dibatalkan..");
                break;
            default:
                System.out.println("Wrong Input! Transaksi dibatalkan..");
                break;
        }
    }

    public void dataTransfer() {
        System.out.println("Anda akan mentransfer ke no. rek: " + rekLain);
        System.out.println("Dengan jumlah transfer: Rp " + out);
    }
}
