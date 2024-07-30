public class Test {
    public static void main(String[] args) {
        Computer GamingComputer = new Computer.Builder()
                .build();
        System.out.println("Gaming Computer: " + GamingComputer.getCPU() + ", " + GamingComputer.getRAM() + ", " + GamingComputer.getStorage());

        Computer highEndComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("64GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .build();
        System.out.println("High-end Computer: " + highEndComputer.getCPU() + ", " + highEndComputer.getRAM() + ", " + highEndComputer.getStorage() + ", " + highEndComputer.getGraphicsCard());
    }
}
