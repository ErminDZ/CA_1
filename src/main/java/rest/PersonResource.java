package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.PersonDTO;
import dtos.PersonsDTO;
import entities.Person;
import facades.PersonFacade;
import utils.EMF_Creator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

//Todo Remove or change relevant parts before ACTUAL use

public class PersonResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();

    private static final PersonFacade FACADE = PersonFacade.getFacadeExample(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @Path("all")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        PersonsDTO persons = FACADE.getAllPersons();
        return GSON.toJson(persons);
    }

//    @Path("id")
//    @GET
//    @Produces({MediaType.APPLICATION_JSON})
//    public String getById(){
//        List<Person> getById = (List<Person>) FACADE.getPerson(1);
//        return GSON.toJson(getById);
//    }
}

