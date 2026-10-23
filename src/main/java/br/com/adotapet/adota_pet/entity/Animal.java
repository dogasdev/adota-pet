package br.com.adotapet.adota_pet.entity;

import br.com.adotapet.adota_pet.enums.Especie;
import br.com.adotapet.adota_pet.enums.Porte;
import br.com.adotapet.adota_pet.enums.Sexo;
import jakarta.persistence.*;

@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_animal")
    private Integer id;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "idade", nullable = false)
    private Integer idade;

    @Enumerated(EnumType.STRING)
    @Column(name = "especie", nullable = false)
    private Especie especie;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", nullable = false)
    private Sexo sexo;

    @Enumerated(EnumType.STRING)
    @Column(name = "porte", nullable = false)
    private Porte porte;

}