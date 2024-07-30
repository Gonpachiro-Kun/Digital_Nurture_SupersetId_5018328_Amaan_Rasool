public class Computer {
        
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }
       
    public String getCPU() {
        return CPU;
    }
    
    public String getRAM() {
        return RAM;
    }
    
    public String getStorage() {
        return storage;
    }
    
    public String getGraphicsCard() {
        return graphicsCard;
    }

    public static class Builder {
       
        private String CPU = "AMD Ryzen 5800X";
        private String RAM = "32GB";
        private String storage = "500GB";
        private String graphicsCard = "Integrated";
           
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
    
        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}