package ru.alishev.CRUDapp2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alishev.CRUDapp2.models.Item;
import ru.alishev.CRUDapp2.models.Person;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item,Integer> {
    List<Item> findByItemName(String itemName);
    List<Item> findByOwner(Person owner);
}
