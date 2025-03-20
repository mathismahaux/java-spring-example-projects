package com.codecademy.plants.controllers;

import com.codecademy.plants.entities.Adventure;
import com.codecademy.plants.repositories.AdventureRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import java.util.Optional;

@RestController
@RequestMapping("/traveladventures")
public class TravelAdventuresController {

  private final AdventureRepository adventureRepository;

  public TravelAdventuresController(AdventureRepository adventureRepo) {
    this.adventureRepository = adventureRepo;
  }

  // Add controller methods below:
  @GetMapping()
  public Iterable<Adventure> getAllAdventures() {
    return this.adventureRepository.findAll();
  }

  @GetMapping("bycountry/{country}")
  public Iterable<Adventure> getAdventuresByCountry(@PathVariable String country) {
    return this.adventureRepository.findByCountry(country);
  }

  @GetMapping("/bystate")
  public Iterable<Adventure> getAdventuresByState(@RequestParam String state) {
    return this.adventureRepository.findByState(state);
  }

  @PostMapping
  public Adventure addAdventure(@RequestBody Adventure adventure) {
      return this.adventureRepository.save(adventure);
  }

  @PutMapping("/{id}")
  public Adventure updateAdventure(@PathVariable Integer id, @RequestBody Adventure adventure) {
      Optional<Adventure> adventureOptional = this.adventureRepository.findById(id);
      if (!adventureOptional.isPresent()) {
          throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Adventure not found");
      }

      Adventure existingAdventure = adventureOptional.get();
      existingAdventure.setBlogCompleted(adventure.getBlogCompleted());
      return this.adventureRepository.save(existingAdventure);
  }

  @DeleteMapping("/{id}")
  public void deleteAdventure(@PathVariable Integer id) {
      Optional<Adventure> adventureOptional = this.adventureRepository.findById(id);
      if (!adventureOptional.isPresent()) {
          throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Adventure not found");
      }

      this.adventureRepository.delete(adventureOptional.get());
  }  
}