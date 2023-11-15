import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

    // inner class Harddisk
    public class Harddisk {
        private int kapasitas;
        private String merek;

        public Harddisk(int kapasitas, String merek) {
            this.kapasitas = kapasitas;
            this.merek = merek;
        }

        public void getHarddiskInfo() {
            System.out.println("Kapasitas Harddisk: " + this.kapasitas + " GB");
            System.out.println("Pabrik: " + this.merek);
        }
    }
    // inner class Motherboard
    public class Motherboard {
        private String model;
        private String chipset;

        public Motherboard(String model, String chipset) {
            this.model = model;
            this.chipset = chipset;
        }

        public void getMotherboardInfo() {
            System.out.println("Model Motherboard: " + this.model);
            System.out.println("Chipset: " + this.chipset);
        }
    }
    // inner class PowerSuply
    public class PowerSupply {
        private int daya;
        private String merek;

        public PowerSupply(int daya, String merek) {
            this.daya = daya;
            this.merek = merek;
        }

        public void getPowerSupplyInfo() {
            System.out.println("Daya Power Supply: " + this.daya + " Watt");
            System.out.println("Pabrik: " + this.merek);
        }
    }
    // inner class VGACard
    public class VGACard {
        private String model;
        private int vram;

        public VGACard(String model, int vram) {
            this.model = model;
            this.vram = vram;
        }

        public void getVGACardInfo() {
            System.out.println("Model VGA Card: " + this.model);
            System.out.println("VRAM: " + this.vram + " GB");
        }
    }
}