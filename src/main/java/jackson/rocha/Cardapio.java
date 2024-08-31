package jackson.rocha;

public class Cardapio {
    ItemCardapio[] itens;

    public Cardapio(int tamanho) {
        this.itens = new ItemCardapio[tamanho];
    }

    void adicionarItem(ItemCardapio item) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                return;
            }
        }
        System.out.println("Cardápio cheio! Não é possível adicionar mais itens.");
    }

    void removerItem(int indice) {
        if (indice >= 0 && indice < itens.length) {
            if (itens[indice] != null) {
                itens[indice] = null;
                return;
            }
            System.out.println("Não há item no índice especificado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item != null && item.preco >= precoMinimo && item.preco <= precoMaximo) {
                System.out.println("Descrição: " + item.descricao + ", Preço: " + item.preco);
            }
        }
    }
}
