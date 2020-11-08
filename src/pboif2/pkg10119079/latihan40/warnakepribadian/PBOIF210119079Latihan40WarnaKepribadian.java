package pboif2.pkg10119079.latihan40.warnakepribadian;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan40WarnaKepribadian {
    public static void main(String[] args) {
      warnaKepribadian wk = new warnaKepribadian();
        

        
        System.out.print(wk.RED + "YUK " + wk.RESET);
        System.out.print(wk.GREEN + "CEK " + wk.RESET);
        System.out.print(wk.YELLOW + "KEPRIBADIANMU " + wk.RESET);
        System.out.print(wk.CYAN + "DARI " + wk.RESET);
        System.out.print(wk.PURPLE + "WARNA " + wk.RESET);
        System.out.println(wk.BLUE + "FAVORITMU " + wk.RESET);
        
        System.out.println("");
        
        System.out.print(wk.bgRed + wk.WHITE + "\t MERAH \t\t\n" + wk.RESET);
        System.out.print(wk.bgGreen + wk.WHITE + "\t HIJAU \t\t\n" + wk.RESET);
        System.out.print(wk.bgYellow + wk.WHITE + "\t KUNING \t\n" + wk.RESET);
        System.out.print(wk.bgBlue + wk.WHITE + "\t BIRU \t\t\n" + wk.RESET);
        System.out.print(wk.bgPurple + wk.WHITE + "\t UNGU \t\t\n" + wk.RESET);
        
        
        wk.getInfo();
        wk.hasilKepribadian();
        
        
    }
    
   
}