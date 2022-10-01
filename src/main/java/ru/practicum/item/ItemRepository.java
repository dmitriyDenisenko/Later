package ru.practicum.item;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.practicum.user.User;

interface ItemRepository extends JpaRepository<User, Long> {

}