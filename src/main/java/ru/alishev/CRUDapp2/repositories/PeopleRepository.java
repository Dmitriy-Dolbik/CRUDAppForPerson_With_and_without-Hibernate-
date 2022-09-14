package ru.alishev.CRUDapp2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alishev.CRUDapp2.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
