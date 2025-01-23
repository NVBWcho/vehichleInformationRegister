package com.nvbwcho.vehichletyperegister.repositories;

import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.wagonbodytype.GenericWagonBodyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GenericWagonBodyTypeRepo extends JpaRepository<GenericWagonBodyType,Long> {

    Optional<GenericWagonBodyType> findByBodyTypeAbbreviation(String abbreviation);
}
