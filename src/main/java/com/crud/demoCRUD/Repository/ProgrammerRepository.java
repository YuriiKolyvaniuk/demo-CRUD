package com.crud.demoCRUD.Repository;

import com.crud.demoCRUD.Model.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammerRepository extends JpaRepository<Programmer,Long> {
}