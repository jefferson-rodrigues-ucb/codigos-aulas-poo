package br.ucb.loja.model;

public class Product {
    private final int ID;
    private final String name;
    private String description;
    private double price;

    public Product(int ID, String name, String description, double price) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalArgumentException {
        if (price <= 0) {
            throw new IllegalArgumentException("Preço precisa ser positivo");
        }
        this.price = price;
    }

    public void setDesconto(double porc) throws IllegalArgumentException {
        if (porc < 0 || porc >= 100) {
            throw new IllegalArgumentException("Produto não pode sair de graça, nem pagar o cliente pra comprar");
        }
        this.price = this.price * (1 - porc/100);
    }

    @Override
    public String toString() {
        return "ID: " + ID +
                ", Name: " + name +
                ", Description: " + description +
                ", Price: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        if (ID != product.ID) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return ID;
    }
}
