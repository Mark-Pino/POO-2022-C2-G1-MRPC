
package entities;

/**
 *
 * @author LAB REDES
 */
public class Worker extends Person{
    //ALTER TABLE worker ADD CONSTRAINT FK_WP FOREIGN KEY (worker_person_id) REFERENCES  person(person_id) ; 
    private String worker_id;
    private String worker_salario;
    private String worker_codigotrabajador;
    private String worker_person_id;

    public String getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }

    public String getWorker_salario() {
        return worker_salario;
    }

    public void setWorker_salario(String worker_salario) {
        this.worker_salario = worker_salario;
    }

    public String getWorker_codigotrabajador() {
        return worker_codigotrabajador;
    }

    public void setWorker_codigotrabajador(String worker_codigotrabajador) {
        this.worker_codigotrabajador = worker_codigotrabajador;
    }

    public String getWorker_person_id() {
        return worker_person_id;
    }

    public void setWorker_person_id(String worker_person_id) {
        this.worker_person_id = worker_person_id;
    }
    
    
    
}
