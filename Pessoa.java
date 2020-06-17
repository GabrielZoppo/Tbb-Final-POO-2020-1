public abstract class Pessoa implements Comunicavel{
    private String nome;
    private String telefone;
    private String email;
    private String DDD;
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
    public String getDDD(){
        return this.DDD;
    }
    public void setDDD(String DDD){
        this.DDD = DDD;
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
           return this.telefone; 
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

