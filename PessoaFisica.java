public class PessoaFisica extends Pessoa {
    private String cpf;
    public PessoaFisica(String nome, String cpf, String telefone,String email){
        super(nome,telefone,email);
        this.cpf = cpf;
    }
    @Override
    public String getDocumento() {
            return this.cpf;
        
    }

    @Override
    public void setDocumento(String cpf) {
        this.cpf = cpf;
    }
   
}
