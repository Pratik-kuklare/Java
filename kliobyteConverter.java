public class kliobyteConverter {
    public static int printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Input");
            return -1;
        }
        int megaBytes = Math.round(kiloBytes / 1024);
        int remainingKiloBytes = kiloBytes % 1024;
        System.out.println(kiloBytes + "KB = " + megaBytes + "MB and " + remainingKiloBytes + "KB");
        return megaBytes;
        }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}
