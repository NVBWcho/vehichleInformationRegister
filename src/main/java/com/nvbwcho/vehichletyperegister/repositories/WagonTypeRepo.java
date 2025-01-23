package com.nvbwcho.vehichletyperegister.repositories;

import com.nvbwcho.vehichletyperegister.vehichletype.WagonType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.nio.file.LinkOption;
@Repository
public interface WagonTypeRepo extends JpaRepository<WagonType, Long> {
}
