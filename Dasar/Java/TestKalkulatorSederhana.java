import javax.swing.*;

/**
 * @author deckyazmi.blogspot.com
 */
public class TestKalkulatorSederhana {

    public static void main(String[] args) {
        String kata;
        int a1, a2, hasil, su;
        double aa1, aa2, hhasil;
        int menu[] = new int[10];
        do {
            menu[0] = Integer.parseInt(JOptionPane.showInputDialog("       بسم الله الرحمن الرحيم                  \nsilahkan masukan nomer menu \n           yang anda butuhkan:\n\n1.Kalkulator Standard\n2.Kalkulator Scientific\n3.Konversi Suhu\n0.exit"));
            switch (menu[0]) {
                case 0:
                    break;
                case 1:
                    do {
                        menu[1] = Integer.parseInt(JOptionPane.showInputDialog("  anda memilih kalkulator standart \nmasukan nomer menu pilihan anda:\n1.Perkalian\n2.Pembagian\n3.Penjumlahan\n4.Pengurangan\n0.kembali kemenu sebelumnya"));
                        switch (menu[1]) {
                            case 0:
                                break;
                            case 1:
                                a1 = Integer.parseInt(JOptionPane.showInputDialog("masukang angka pertama \n (????) dikali (????)"));
                                a2 = Integer.parseInt(JOptionPane.showInputDialog("masukang angka kedua \n" + a1 + " dikali (????)"));
                                hasil = a1 * a2;
                                JOptionPane.showMessageDialog(null, "hasil perkalian " + a1 + " dikali " + a2 + " adalaah " + hasil, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 2:
                                a1 = Integer.parseInt(JOptionPane.showInputDialog("masukang angka pertama \n (????) dibagi (????)"));
                                a2 = Integer.parseInt(JOptionPane.showInputDialog("masukang angka kedua \n" + a1 + " dibagi (????)"));
                                hasil = a1 / a2;
                                JOptionPane.showMessageDialog(null, "hasil perkalian " + a1 + " dibagi " + a2 + " adalaah " + hasil, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 3:
                                a1 = Integer.parseInt(JOptionPane.showInputDialog("masukang angka pertama \n (????) ditambah (????)"));
                                a2 = Integer.parseInt(JOptionPane.showInputDialog("masukang angka kedua \n" + a1 + " ditambah (????)"));
                                hasil = a1 + a2;
                                JOptionPane.showMessageDialog(null, "hasil perkalian " + a1 + " ditambah " + a2 + " adalaah " + hasil, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 4:
                                a1 = Integer.parseInt(JOptionPane.showInputDialog("masukang angka pertama \n (????) dikurangi (????)"));
                                a2 = Integer.parseInt(JOptionPane.showInputDialog("masukang angka kedua \n" + a1 + " dikurangi (????)"));
                                hasil = a1 - a2;
                                JOptionPane.showMessageDialog(null, "hasil perkalian " + a1 + " dikurangi " + a2 + " adalaah " + hasil, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            default:
                                String msg = "Anda salah menginputkan menu\nsilahkan coba lagi ^,^";
                                JOptionPane.showMessageDialog(null, "Anda Salah menginputkan menu", "error", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (menu[1] != 0);
                    break;
                case 2:
                    do {
                        menu[2] = Integer.parseInt(JOptionPane.showInputDialog("\tmasukan nomer menu pilihan anda:\n1.sin,cos,tan\n2.faktorial\n3.akar,pangkat\n0.kembali kemenu sebelumnya"));
                        switch (menu[2]) {
                            case 0:
                                break;
                            case 1:
                                do {
                                    menu[3] = Integer.parseInt(JOptionPane.showInputDialog("masukan nomer menu yang anda butuhkan\n1.Sin\n2.Cos\n3.Tan\n0.kembali ke menu sebelumnya"));
                                    switch (menu[3]) {
                                        case 0:
                                            break;
                                        case 1:
                                            aa1 = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih menu penghitung sinus\nsilahkan masukan angka anda"));
                                            hhasil = ((double) Math.sin(Math.toRadians(aa1)));
                                            JOptionPane.showMessageDialog(null, "hasil perhitungan sinus dari " + aa1 + " adalaah " + hhasil, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        case 2:
                                            aa1 = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih menu penghitung cosinus\nsilahkan masukan angka anda"));
                                            hhasil = ((double) Math.cos(Math.toRadians(aa1)));
                                            JOptionPane.showMessageDialog(null, "hasil perhitungan cosinus dari " + aa1 + " adalaah " + hhasil, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        case 3:
                                            aa1 = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih menu penghitung tangen\nsilahkan masukan angka anda"));
                                            hhasil = ((double) Math.tan(Math.toRadians(aa1)));
                                            JOptionPane.showMessageDialog(null, "hasil perhitungan tangen dari " + aa1 + " adalaah " + hhasil, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        default:
                                            String msg = "Anda salah menginputkan menu\nsilahkan coba lagi ^,^";
                                            JOptionPane.showMessageDialog(null, "Anda Salah menginputkan menu", "error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } while (menu[3] != 0);
                                break;
                            case 2:
                                a1 = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih menu penghitung faktorial\nsilahkan masukan angka anda"));
                                hasil = (int) a1;
                                for (int i = (int) a1; i >= 2; i--) {
                                    hasil *= i - 1;
                                }
                                JOptionPane.showMessageDialog(null, "hasil Faktorial " + (int) a1 + " adalaah " + (int) hasil, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 3:
                                do {
                                    menu[4] = Integer.parseInt(JOptionPane.showInputDialog("masukan nomer menu yang anda butuhkan\n1.Akar\n2.Pangkat\n0.kembali kemenu sebelumnya"));
                                    switch (menu[4]) {
                                        case 0:
                                            break;
                                        case 1:
                                            aa1 = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih menu penghitung angka akar\nsilahkan masukan angka anda"));
                                            hhasil = ((double) Math.sqrt(aa1));
                                            JOptionPane.showMessageDialog(null, "hasil perhitungan angka akar dari " + (int) aa1 + " adalaah" + (int) hhasil, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        case 2:
                                            a1 = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih menu penghitung angka berpangkat\nsilahkan masukan angka anda"));
                                            a2 = Integer.parseInt(JOptionPane.showInputDialog("masukan angka pangkatnya"));
                                            hasil = (int) Math.pow(a1, a2);
                                            JOptionPane.showMessageDialog(null, "hasil perhitungan perpangkatan dari " + (int) a1 + "^" + (int) a2 + " adalaah " + (int) hasil, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        default:
                                            String msg = "Anda salah menginputkan menu\nsilahkan coba lagi ^,^";
                                            JOptionPane.showMessageDialog(null, "Anda Salah menginputkan menu", "error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } while (menu[4] != 0);
                                break;
                            default:
                                String msg = "Anda salah menginputkan menu\nsilahkan coba lagi ^,^";
                                JOptionPane.showMessageDialog(null, "Anda Salah menginputkan menu", "error", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (menu[2] != 0);
                    break;
                case 3:
                    do {
                        menu[5] = Integer.parseInt(JOptionPane.showInputDialog("\tmasukan nomer menu pilihan anda:\n1.Koversi dari Celcius\n2.Koversi dari Reamur\n3.Koversi dari Fahrenhait\n0.kembali kemenu sebelumnya"));
                        switch (menu[5]) {
                            case 0:
                                break;
                            case 1:
                                do {
                                    menu[6] = Integer.parseInt(JOptionPane.showInputDialog("\tmasukan nomer menu pilihan anda:\n1.Koversi ke reamure\n2.Koversi ke Fahrenhait\n0.kembali kemenu sebelumnya"));
                                    switch (menu[6]) {
                                        case 0:
                                            break;
                                        case 1:
                                            kata = "derajat reamur";
                                            su = Integer.parseInt(JOptionPane.showInputDialog("inputkan Suhu celcius"));
                                            hhasil = ((double) 4 / 5 * su);
                                            JOptionPane.showMessageDialog(null, "hasil convert Suhu dari " + su + " derajat Celcius \n aadalah " + hhasil + " " + kata, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        case 2:
                                            kata = "derajat fahrenhait";
                                            su = Integer.parseInt(JOptionPane.showInputDialog("inputkan Suhu celcius"));
                                            hhasil = ((double) (9 / 5 * su) + 32);
                                            JOptionPane.showMessageDialog(null, "hasil convert Suhu dari " + su + " derajat Celcius \n aadalah " + hhasil + " " + kata, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        default:
                                            String msg = "Anda salah menginputkan menu\nsilahkan coba lagi ^,^";
                                            JOptionPane.showMessageDialog(null, "Anda Salah menginputkan menu", "error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } while (menu[6] != 0);
                                break;
                            case 2:
                                do {
                                    menu[7] = Integer.parseInt(JOptionPane.showInputDialog("\tmasukan nomer menu pilihan anda:\n1.Koversi ke celcius\n2.Koversi ke Fahrenhait\n0.kembali kemenu sebelumnya"));
                                    switch (menu[7]) {
                                        case 0:
                                            break;
                                        case 1:
                                            kata = "derajat Celcius";
                                            su = Integer.parseInt(JOptionPane.showInputDialog("inputkan Suhu reamur"));
                                            hhasil = ((double) 5 / 4 * su);
                                            JOptionPane.showMessageDialog(null, "hasil convert Suhu dari " + su + " derajat reamur \n aadalah " + hhasil + " " + kata, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        case 2:
                                            kata = "derajat fahrenhait";
                                            su = Integer.parseInt(JOptionPane.showInputDialog("inputkan Suhu celcius"));
                                            hhasil = ((double) (9 / 4 * su) + 32);
                                            JOptionPane.showMessageDialog(null, "hasil convert Suhu dari " + su + " derajat reamur \n aadalah " + hhasil + " " + kata, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        default:
                                            String msg = "Anda salah menginputkan menu\nsilahkan coba lagi ^,^";
                                            JOptionPane.showMessageDialog(null, "Anda Salah menginputkan menu", "error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } while (menu[7] != 0);
                                break;
                            case 3:
                                do {
                                    menu[8] = Integer.parseInt(JOptionPane.showInputDialog("\tmasukan nomer menu pilihan anda:\n1.Koversi ke celcius\n2.Koversi ke reamure\n0.kembali kemenu sebelumnya"));
                                    switch (menu[8]) {
                                        case 0:
                                            break;
                                        case 1:
                                            kata = "derajat Celcius";
                                            su = Integer.parseInt(JOptionPane.showInputDialog("inputkan Suhu Fahrenhait"));
                                            hhasil = ((double) 5 / 9 * (su - 32));
                                            JOptionPane.showMessageDialog(null, "hasil convert Suhu dari " + su + " derajat Fahrenhait \n aadalah " + hhasil + " " + kata, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        case 2:
                                            kata = "derajat reamur";
                                            su = Integer.parseInt(JOptionPane.showInputDialog("inputkan Suhu Fahrenhait"));
                                            hhasil = ((double) 4 / 9 * (su - 32));
                                            JOptionPane.showMessageDialog(null, "hasil convert Suhu dari " + su + " derajat Fahrenhait \n aadalah " + hhasil + " " + kata, "ini dia hasilnya ^^", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        default:
                                            String msg = "Anda salah menginputkan menu\nsilahkan coba lagi ^,^";
                                            JOptionPane.showMessageDialog(null, "Anda Salah menginputkan menu", "error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } while (menu[8] != 0);
                                break;
                            default:
                                String msg = "Anda salah menginputkan menu\nsilahkan coba lagi ^,^";
                                JOptionPane.showMessageDialog(null, "Anda Salah menginputkan menu", "error", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (menu[5] != 0);
                    break;
                default:
                    String msg = "Anda salah menginputkan menu\nsilahkan coba lagi ^,^";
                    JOptionPane.showMessageDialog(null, "Anda Salah menginputkan menu", "error", JOptionPane.ERROR_MESSAGE);
            }
        } while (menu[0] != 0);
    }
}
