package entities;


public class Client extends Person {

    private String client_id;
    private String client_codigocliente;
    private String client_tipo;
    private String client_person_id;

    public String getClient_tipo() {
        return client_tipo;
    }

    public void setClient_tipo(String client_tipo) {
        this.client_tipo = client_tipo;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_codigocliente() {
        return client_codigocliente;
    }

    public void setClient_codigocliente(String client_codigocliente) {
        this.client_codigocliente = client_codigocliente;
    }

    public String getClient_person_id() {
        return client_person_id;
    }

    public void setClient_person_id(String client_person_id) {
        this.client_person_id = client_person_id;
    }
    
    
    
}
