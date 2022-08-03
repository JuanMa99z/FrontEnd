package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista depersona
    public List<Persona> getPersona();
    
    //guardar un obj de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un obj pero l obuscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una personas por ID
    public Persona findPersona(Long id);
}
