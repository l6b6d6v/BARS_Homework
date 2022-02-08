
package ru.lebedevbars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lebedevbars.entity.Dogovor;

import java.util.UUID;


public interface DogovorRepo extends JpaRepository<Dogovor, UUID> {
}

