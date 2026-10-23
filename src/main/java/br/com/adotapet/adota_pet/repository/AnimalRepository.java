
package br.com.adotapet.adota_pet.repository;

import br.com.adotapet.adota_pet.entity.Animal;
import br.com.adotapet.adota_pet.enums.Especie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    List<Animal> findByEspecie(Especie especie);
}
