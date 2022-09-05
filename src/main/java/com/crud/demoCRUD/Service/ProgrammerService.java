package com.crud.demoCRUD.Service;

import com.crud.demoCRUD.Model.Programmer;
import com.crud.demoCRUD.Repository.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammerService {
    private final ProgrammerRepository programmerRepository;

    @Autowired
    public ProgrammerService(ProgrammerRepository programmerRepository) {
        this.programmerRepository = programmerRepository;
    }

    public Programmer findById(Long id){
        return programmerRepository.getOne(id);
    }

    public List<Programmer> findAll(){
        return programmerRepository.findAll();
    }

    public Programmer saveProgrammer(Programmer programmer){
        return programmerRepository.save(programmer);
    }

    public void deleteById(Long id){
        programmerRepository.deleteById(id);
    }
}
