
package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
