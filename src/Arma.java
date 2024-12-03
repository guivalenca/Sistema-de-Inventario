public class Arma extends Item {
    private int dano;
    private String tipo;

    public Arma(int id, String nome, String raridade, int dano, String tipo) {
        super(id, nome, raridade);
        this.dano = dano;
        this.tipo = tipo;
    }

    public Arma(int id, String nome, String tipo) {
        super(id, nome);
        this.tipo = tipo;
        this.dano = 10;
    }

    public void alterarDano(int dano) {
        this.dano = dano;
    }

    public void alterarTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("----> Dano: " + dano + "|| Tipo: " + tipo);
    }

}
