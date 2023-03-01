public class Product {
    public class Product {
        private String name;
        private String description;
        private String picture;
        private double price;
        private String specialTreatment;
        private int quantity;

        public Product(String name, String description, String picture, double price, String specialTreatment, int quantity) {
            this.name = name;
            this.description = description;
            this.picture = picture;
            this.price = price;
            this.specialTreatment = specialTreatment;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getSpecialTreatment() {
            return specialTreatment;
        }

        public void setSpecialTreatment(String specialTreatment) {
            this.specialTreatment = specialTreatment;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
