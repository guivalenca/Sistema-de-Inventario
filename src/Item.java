public class Item {
    private int id;
    private String nome;
    private String raridade;

    final String[] raridades = {"comum", "rara", "epica", "lendaria"};

    public Item(int id, String nome, String raridade) {
        this.id = id;
        this.nome = nome;

        boolean raridadeExistente = false;

        for (String s : raridades) {
            if (raridade.equalsIgnoreCase(s)) {
                raridadeExistente = true;
                break;
            }
        }

        if (raridadeExistente) {
            this.raridade = raridade;
        } else {
            System.out.println("Erro: a raridade proposta não existe. Raridade foi configurada como" + raridades[0]);
            this.raridade = raridades[0];
        }
    }

    public Item(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.raridade = "comum";
    }

    public void detalhes() {
        System.out.println(toString());
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarID(int id) {
        this.id = id;
    }

    public void alterarRaridade(String raridade) {
        boolean existente = false;
        for (String nome : raridades) {
            if (nome.equalsIgnoreCase(raridade)) {
                existente = true;
                break;
            }
        }

        if (existente) {
            this.raridade = raridade;
        } else {
            System.out.println("Raridade inexistente. As raridades de um objeto são:");
            for (String nome : raridades) {
                System.out.print(nome + "| ");
            }
            System.out.println();
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "|| ID: " + id + "|| Raridade:" + raridade;
    }
}
