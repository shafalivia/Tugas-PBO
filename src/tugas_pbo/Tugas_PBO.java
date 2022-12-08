package tugas_pbo;
public class Tugas_PBO {
    public static void main(String[] args) {
        String shafa = "ini Java";
        System.out.println("Ini teks awal 1 = "+shafa);
        System.out.println("==================================================");
        
    //charAt(index)
        char metode1 = shafa.charAt(4);
        System.out.println("Mengambil index ke-4 dengan charAt() = "+metode1);
        System.out.println("==================================================");
        
    //equals & equalsignoreCase
        if (shafa.equals(metode1))
            System.out.println("Metode equals ke charAt(4) = Shafa bukan satu huruf"); //tidak ter-print karena False
        if (shafa.equalsIgnoreCase("ini JAVA"))
            System.out.println("Metode equalsIgnoreCase ke 'ini JAVA' = Ini True tanpa case sensitive");
        System.out.println("==================================================");
        
    //compareTo & compareToIgnoreCase
        int diff1 = "shafa".compareTo("nur");
        int diff2 = "alifia".compareToIgnoreCase("Alifia");
        System.out.println("Metode 'shafa' compareTo(nur) = "+diff1+" Karena shafa itu 5 huruf, dan nur itu 3");
        System.out.println("Metode 'alifia' compareToIgnoreCasse(Alifia) = "+diff2+" Karena sama dan tetap True tanpa case sensitive");
        System.out.println("==================================================");

    //replace()
        String rp = shafa.replace("i", "a");
        System.out.println("Mengganti 'i' dengan 'a' = "+rp+" Sebelumnya = "+shafa);
        System.out.println("==================================================");
        
    //substring()
        String subs1 = shafa.substring(1, 3);
        System.out.println("Ini ngambil substring index ke-1 sampai batas index ke-3 = "+subs1);
        System.out.println("==================================================");
        
    //toCharArray()
        char[] tc = shafa.toCharArray();
        for (int i = 0; i < tc.length; i++) {
            System.out.println("Yeyy ini jadi Array/list per Char = "+tc[i]);}
        System.out.println("==================================================");
        
    //valueOf()
        //Integer
        int a = 17;
        String h = "1234567";
        String ubah = String.valueOf(a); //convert angka 17 menjadi string "17"
        System.out.println("Metode valueOf() hasil convert int-to-str 17 = "+ubah + h);
        
        //String
        String huruf = String.valueOf(tc, 0, 4);
        System.out.println("Metode valueOf() hasil convert char-to-string, index 0-3 = "+huruf);
        System.out.println("==================================================");
         
    //getChar()
        char[] array2 = new char[]{'a','a','a','a','a','a','a','a'};
        shafa.getChars(1, 6, array2, 2);
        for(char temp: array2){
    	   System.out.println("Metode getChar dalam loop for = "+temp);}
        System.out.println("==================================================");

    //trim()
        String shafa2 = "   ini Java   ";
        String tm = shafa2.trim();
        System.out.println("Ini teks awal 2 = "+shafa2);
        System.out.println("Ini di Trim tanpa ada white spaces kann = "+tm);
        System.out.println("==================================================");
    
    // Exception Handling
    System.out.println("=== EXCEPTION HANDLING ===");
        try {
          int angka = 17-10/0; //Ini gak bisaa, errorr
        }
        // kalo error secara matematika pakai ArithmeticException
        catch (ArithmeticException e) {
          System.out.println("Disini Error nyaa = " + e.getMessage());
        }
        finally {
          System.out.println("Ini akan selalu adaa pakai Finnaly");
        }
        
        String dekawal = null;
        try {
            if (dekawal.equals("Shafa"))
                System.out.println("Ini kalo True");
            else
                System.out.println("Ini kalo False");
        }
        // kalo error karena value nya NULL
        catch(NullPointerException e){
            System.out.println("Ini kalo Null a.k.a error");
        }

        try{
            int angka2 = Integer.parseInt("SHAFAA");
            System.out.println(angka2);
        }
        // kalo error karena jenis data tidak sesuai
        catch (NumberFormatException e) {
            System.out.println("Ini salah format a.k.a error");
        }
    }
}
