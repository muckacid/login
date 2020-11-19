package modelo;

public class Usuario {
    
    private int id;
    private String userId;
    private String userPass;
    private int tipo;

    public Usuario() {
    }
    
    public Usuario(int id, String userId, String userPass, int tipo) {
        this.id = id;
        this.userId = userId;
        this.userPass = userPass;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "[ID:"+Integer.toString(this.id)+" | Nombre:"+userId+" | Tipo: "+tipo+"]"; 
    }
}
