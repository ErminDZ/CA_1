package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number", nullable = false)
    private int number;
    @Column(name = "description")
    private String description;

    //Constructor
    public Phone() {
    }

    public Phone(int number, String description) {
        this.number = number;
        this.description = description;
    }

    //Relationer
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    //Getter og setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        if (!person.getPhones().contains(this)){
            person.getPhones().add(this);
        }
    }
}
