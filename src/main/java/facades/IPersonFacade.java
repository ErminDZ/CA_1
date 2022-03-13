package facades;

import dtos.PersonDTO;
import dtos.PersonsDTO;


/**
 *
 * @author jobe
 */
public interface IPersonFacade {
    public PersonsDTO getAllPersons();
//    public PersonDTO addPerson(String email,String fName, String lName, String phone, String street); //throws MissingInputException; //, String zip, String city
//    public PersonDTO deletePerson(long id) throws PersonNotFoundException;
//    public PersonDTO getPerson(long id);// throws PersonNotFoundException;

  }