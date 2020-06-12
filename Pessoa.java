package classesTBB;
public abstract class Pessoa implements Comunicavel{
    private String nome;
    private String telefone;
    private String email;
    public Pessoa(String nome,String telefone,String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email  = email;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return this.email;
    }
    
    @Override
    public boolean comunicavel (){
       if(this.telefone == ""){
           return false;
       }else{
           return true;
       }
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getTelefone(){
        if(comunicavel() == true){
            if(this.telefone.length() == 11){
                return this.telefone;
            }else{
                System.out.println("Telefone Inválido");
                return null;
            }
        }else{
            return "";
        }
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public abstract String getDocumento();
    public abstract void setDocumento(String documento);
    
    }
