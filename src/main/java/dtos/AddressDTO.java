package dtos;

import entities.Address;
import entities.Phone;

import java.util.ArrayList;
import java.util.List;

public class AddressDTO {
    private Long id;
    private String street;
    private String additionalInfo;
    private List<AddressDTO> all = new ArrayList<AddressDTO>();

    public AddressDTO(Address rm) {
        if (rm.getId() != 1)
             this.id = rm.getId();
        this.street = rm.getStreet();
        this.additionalInfo = rm.getAdditionalInfo();
    }

    public static List<AddressDTO> getDtos(List<Address> rms){
        List<AddressDTO> rmdtos = new ArrayList<>();
        rms.forEach(rm->rmdtos.add(new AddressDTO(rm)));
        return rmdtos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public List<AddressDTO> getAll() {
        return all;
    }

    public void setAll(List<AddressDTO> all) {
        this.all = all;
    }
}
