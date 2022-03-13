package dtos;

import entities.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneDTO {
    private long id;
    private int number;
    private String description;
    private List<PhoneDTO> all = new ArrayList<PhoneDTO>();

    public static List<PhoneDTO> getDtos(List<Phone> rms){
        List<PhoneDTO> rmdtos = new ArrayList<>();
        rms.forEach(rm->rmdtos.add(new PhoneDTO(rm)));
        return rmdtos;
    }

    public PhoneDTO(Phone rm) {
        if (rm.getId() != 1)
             this.id = rm.getId();
        this.number = rm.getNumber();
        this.description = rm.getDescription();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public List<PhoneDTO> getAll() {
        return all;
    }

    public void setAll(List<PhoneDTO> all) {
        this.all = all;
    }
}
