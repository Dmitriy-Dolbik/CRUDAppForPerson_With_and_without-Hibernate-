package ru.alishev.CRUDapp2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alishev.CRUDapp2.models.Person;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);
    //находим людей по имени
    List<Person> findByNameOrderByAge(String name);
    //находим людей по имени и сортируем по возрасту
    List<Person> findByEmail(String email);
    //находим людей по email
    List<Person> findByNameStartingWith(String startingWith);
    //находим людей, имена которых начинаются с stringWith
    List<Person> findByNameOrEmail(String name, String email);
    //находим людей по имени или email (совпадает или имя или email)
}

