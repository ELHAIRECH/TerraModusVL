package com.example.terramodusvtll.repositories.devisPersonne;
import com.example.terramodusvtll.entities.devisPersonne.DevisPersonneAmiable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisPersonneAmiableRepository extends JpaRepository<DevisPersonneAmiable,Long> {

}
