public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private String estado; //apenas poder ser Minas Gerais

    public Endereco(String rua, String numero, String cep, String bairro, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.estado = estado;
    }

    public Endereco(){};

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado.equals("Rio de Janeiro")) {
            this.estado = estado;
        } else {
            System.out.println("O estado não pode ser diferente do Rio de Janeiro, pois a escola se localiza no RJ!");
        }
    }
}
