package ru.alishev.CRUDapp2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.alishev.CRUDapp2.models.Item;
import ru.alishev.CRUDapp2.models.Person;
import ru.alishev.CRUDapp2.repositories.ItemsRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ItemsService {
    private final ItemsRepository itemsRepository;
    @Autowired
    public ItemsService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }
    public List<Item> findByItemName(String itemName){
        return itemsRepository.findByItemName(itemName);
    }
    public List<Item> findByOwner(Person owner){
        return itemsRepository.findByOwner(owner);
    }

}
