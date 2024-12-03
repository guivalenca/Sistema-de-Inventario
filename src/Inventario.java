import java.util.ArrayList;

public class Inventario {
    ArrayList<Item> itens = new ArrayList<>();

    public void guardar(Item item) {
        itens.add(item);
    }

    public void remover(Item item) {
        itens.remove(item);
    }

    public void detalhes() {
        for (Item i : itens) {
            i.detalhes();
        }
        System.out.println();
    }
}
