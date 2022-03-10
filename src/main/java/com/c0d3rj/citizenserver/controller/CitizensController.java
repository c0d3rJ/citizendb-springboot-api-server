package com.c0d3rj.citizenserver.controller;

import com.c0d3rj.citizenserver.model.Citizens;
import com.c0d3rj.citizenserver.repository.CitizensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import javax.persistence.*;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/")
public class CitizensController {
    @Autowired
    private CitizensRepository citizensRepository;

    @GetMapping(path ="getById/{id}")
    public Optional<Citizens> getCitizenById(@PathVariable("id") Integer id){
        return this.citizensRepository.findById(id);
    }

    @GetMapping("filterByNamesAndDoB")
    public Page<Citizens> filterCitizensByNameDoB(
            @RequestParam Optional<String> surname,
            @RequestParam Optional<String> name,
            @RequestParam Optional<String> dob,
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<Integer> size,
            @RequestParam Optional<String> sortBy
    ){
        return this.citizensRepository.findCitizensBySurnameContainsAndNameContainsAndDobContains(
                surname.orElse(""), //passes blank if var is null
                name.orElse(""),
                dob.orElse(""),
                PageRequest.of(
                        page.orElse(0),
                        size.orElse(5),
                        Sort.Direction.ASC, sortBy.orElse("id")
                )
        );
    }

}
