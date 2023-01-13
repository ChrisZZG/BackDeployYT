
package com.personasdeploy.youtube.Repository;

import com.personasdeploy.youtube.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryPersona extends JpaRepository<Persona, Integer>{
    
 public Optional<Persona> findByNombre(String nombre);
    
    public boolean existsByNombre(String nombre);
}
