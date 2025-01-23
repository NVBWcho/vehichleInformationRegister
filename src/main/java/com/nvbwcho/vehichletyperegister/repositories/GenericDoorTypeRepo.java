package com.nvbwcho.vehichletyperegister.repositories;

import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.doortype.GenericWagonDoorType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GenericDoorTypeRepo extends JpaRepository<GenericWagonDoorType,Long> {

    Optional<GenericWagonDoorType> findByDoorTypeAbbreviation(String doorTypeAbbreviation);
}
