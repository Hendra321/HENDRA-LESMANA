public class MainQueueDouble {
    public static void main(String[] args) {
        queue O = new queue();
        O.cetak();

        O.insert(8.9);
        O.cetak();
        O.insert(64.47);
        O.cetak();
        O.insert(12.54);
        O.cetak();

        double P = O.get();
        O.cetak();

        double P1 = O.get();
        O.cetak();

        double P2 = O.get();
        O.cetak();

    }
}
