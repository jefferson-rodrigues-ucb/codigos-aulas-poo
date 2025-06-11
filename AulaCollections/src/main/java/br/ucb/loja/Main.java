package br.ucb.loja;

import br.ucb.loja.model.Product;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Product> products = new HashSet<>();
        products.add(new Product(1, "HiPhone 16 Pro Max", "", 19_965.90));
        products.add(new Product(2, "MachBook Pro M4 Max", "", 75_000.00));
        products.add(new Product(3, "HiPad 13 Pro", "", 29000));
        products.add(new Product(4, "Hap Watch Series 10 Ultra", "", 13000));

        List<Product> productsList = products.stream().toList();

        try {
            System.out.println("Aplicando desconto");
            productsList.get(1).setDesconto(130);
        } catch (IllegalArgumentException e) {
            System.out.println("Desconto inválido: " + e.getMessage());
            productsList.get(1).setDesconto(30);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Produto não existe para desconto: " + e.getMessage());
        }


        ArrayList<Product> carrinhoDoErick = new ArrayList<>();
        try {
            carrinhoDoErick.add(productsList.get(1));
            carrinhoDoErick.add(productsList.get(0));
            carrinhoDoErick.add(productsList.get(0));
            carrinhoDoErick.add(productsList.get(2));
            carrinhoDoErick.add(productsList.get(3));
            carrinhoDoErick.add(productsList.get(4));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Esse item não existe: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro genérico: " + e.getMessage());
        }

        System.out.println("Total de compras do Érick:");
        double totalCarrinhoErick = totalCarrinho(carrinhoDoErick);

        System.out.println("Itens do carrinho do Erick:");
        for(Product p : carrinhoDoErick){
            System.out.println(p);
        }

        System.out.printf("Total com desconto porque o Érick pagou no Pix: R$ %.2f\n",
                totalCarrinhoErick * 0.9);

        System.out.println("Removeu o Apple Watch:");
        carrinhoDoErick.remove(carrinhoDoErick.lastIndexOf(productsList.get(3)));

        salvarListaCompra(carrinhoDoErick, "Comprinhas do Erick");
    }

    public static double totalCarrinho(List<Product> products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        System.out.printf("Total de carrinho: R$ %.2f\n", total);
        return total;
    }

    public static void salvarListaCompra(List<Product> carrinho, String nomeLista) {
        try {
            BufferedWriter bw = new BufferedWriter(new PrintWriter(nomeLista + ".txt")); // Sua IDE sugerirá uma forma melhor, foi feito assim para fins didáticos
            for (Product product : carrinho) {
                bw.write(product.getName() + " - R$" + product.getPrice() + "\n");
            }
            bw.newLine();
            bw.write("Total R$ " + totalCarrinho(carrinho));
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Falha ao salvar lista de Compras: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo: " + e.getMessage());
        }
    }
}