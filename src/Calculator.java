public class Calculator {
    /**
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil penjumlahan a + b
     */
    public int tambah(int a, int b) {
        return a + b;
    }

    /**
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil pengurangan a - b
     */
    public int kurang(int a, int b) {
        return a - b;
    }

    // program untuk menghitung penjumlahan dan pengurangan
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Hasil penjumlahan: " + calc.tambah(5, 3));
        System.out.println("Hasil pengurangan: " + calc.kurang(10, 4));
    }
}
