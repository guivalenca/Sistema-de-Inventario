public class Pocao extends Item {
    private String tipo;

    private String[] tipos = {"indefinido", "cura", "stamina", "resistência"};

    public Pocao(int id, String nome, String raridade, String tipo) {
        super(id, nome, raridade);
        alterarTipo(tipo);
    }

    public void alterarTipo(String tipo) {
        boolean tipoValido = false;

        for (String i: tipos) {
            if (tipo.equalsIgnoreCase(i)) {
                tipoValido = true;
                break;
            }
        }

        if (tipoValido) {
            this.tipo = tipo;
        } else {
            System.out.println("Erro: tipo especificado não é válido. Tipo definido temporariamente " +
                    "como indefinido. Use o método 'alterarTipo' para definir tipo correto.");
            System.out.println();
        }
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("----> Tipo: pocão de " + tipo);
    }
}
