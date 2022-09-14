package ru.alishev.CRUDapp2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.alishev.CRUDapp2.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PersonDAO {
    /*private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/

    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Person> index() {
        /*return jdbcTemplate.query("SELECT * FROM Person", new BeanPropertyRowMapper<>(Person.class));*/
        Session session = sessionFactory.getCurrentSession();
        List<Person> people = session.createQuery("select p from Person p", Person.class)
                .getResultList();

        return people;
    }

    public Optional<Person> show(String email) {
        /*return jdbcTemplate.query("SELECT * FROM Person WHERE email=?",
                        new Object[]{email}, new BeanPropertyRowMapper<>(Person.class)).stream().findAny();*/
        return null;
    }

    public Person show(int id) {
        /*return jdbcTemplate.query("SELECT * FROM Person WHERE id=?",
                        new Object[]{id}, new BeanPropertyRowMapper<>(Person.class))
                .stream().findAny().orElse(null);*/
        return null;
    }

    public void save(Person person) {
        /*jdbcTemplate.update("INSERT INTO Person(name, age, email, address) VALUES(?,?,?,?)",
                person.getName(), person.getAge(), person.getEmail(), person.getAddress());*/

    }

    public void update(int id, Person updatedPerson) {
        /*jdbcTemplate.update("UPDATE Person SET name=?, age=?, email=?, address=? WHERE id=?",
                updatedPerson.getName(), updatedPerson.getAge(), updatedPerson.getEmail(),updatedPerson.getAddress(), id);*/
    }

    public void delete(int id) {
       /* jdbcTemplate.update("DELETE FROM Person WHERE id=?", id);*/
    }
}

