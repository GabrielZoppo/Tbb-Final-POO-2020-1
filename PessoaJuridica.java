package classesTBB;
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    public PessoaJuridica(String nome, String cnpj, String telefone,String email){
        super(nome,telefone,email);
        this.cnpj = cnpj;
    }

   @Override
    public String getDocumento() {
        if(this.cnpj.length() == 14){
            return this.cnpj;
        }else{
            return "";
        }
    }

    @Override
    public void setDocumento(String cnpj) {
        this.cnpj = cnpj;
    }
   
    }