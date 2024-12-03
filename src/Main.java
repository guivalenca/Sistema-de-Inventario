public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Item a1 = new Item(1, "Graveto");
        Item a2 = new Item(2, "Maçã");
        Arma b1 = new Arma(3, "Madeira", "espada");
        Pocao c1 = new Pocao(4, "Maça com Canela", "rara", "cura");

        inventario.guardar(a1);
        inventario.guardar(a2);
        inventario.guardar(b1);
        inventario.guardar(c1);

        inventario.detalhes();

        b1.alterarNome("Madeira Mágica");
        b1.alterarDano(20);
        b1.alterarRaridade("rara");

        inventario.detalhes();

        b1.alterarRaridade("extremamente rara");

        inventario.detalhes();

        inventario.remover(a1);

        inventario.detalhes();

        c1.alterarNome("Banana com Canela");
        c1.alterarTipo("stamina");

        inventario.detalhes();

        c1.alterarTipo("resistência ao fogo");

        inventario.detalhes();

    }
}