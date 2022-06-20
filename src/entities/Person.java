
package entities;


public class Person {
    
    private String person_id;
    private String person_nombres;
    private String person_paterno;
    private String person_materno;
    private String person_nro_di;
    private String person_usuario;
    private String person_password;
    
    

    public String getPerson_nro_di() {
        return person_nro_di;
    }

    public void setPerson_nro_di(String person_nro_di) {
        this.person_nro_di = person_nro_di;
    }
  

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }
    
    public String getPerson_nombres() {
        return person_nombres;
    }

    public void setPerson_nombres(String person_nombres) {
        this.person_nombres = person_nombres;
    }

    public String getPerson_paterno() {
        return person_paterno;
    }

    public void setPerson_paterno(String person_paterno) {
        this.person_paterno = person_paterno;
    }

    public String getPerson_materno() {
        return person_materno;
    }

    public void setPerson_materno(String person_materno) {
        this.person_materno = person_materno;
    }

    public String getPerson_usuario() {
        return person_usuario;
    }

    public void setPerson_usuario(String person_usuario) {
        this.person_usuario = person_usuario;
    }

    public String getPerson_password() {
        return person_password;
    }

    public void setPerson_password(String person_password) {
        this.person_password = person_password;
    }
    
    
}
