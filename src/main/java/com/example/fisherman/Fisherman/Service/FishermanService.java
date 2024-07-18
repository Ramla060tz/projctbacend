package com.example.fisherman.Fisherman.Service;

import com.example.fisherman.Fisherman.Model.Fisherman;
import com.example.fisherman.Fisherman.Repository.FishermanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FishermanService {
    @Autowired
    private FishermanRepository fishermanRepository;

    public Fisherman post(Fisherman fisherman) {
        return fishermanRepository.save(fisherman);
    }

    public List<Fisherman> getFishermen() {
        return fishermanRepository.findAll();
    }

    public Optional<Fisherman> getById(Long id) {
        return fishermanRepository.findById(id);
    }

    public void deleteById(Long id) {
        fishermanRepository.deleteById(id);
    }

    public Fisherman updateFisherman(Long id, Fisherman fisherman) {
        Optional<Fisherman> existingFisherman = fishermanRepository.findById(id);
        if (existingFisherman.isPresent()) {
            Fisherman updatedFisherman = existingFisherman.get();
            updatedFisherman.setName(fisherman.getName());
            updatedFisherman.setAge(fisherman.getAge());
            updatedFisherman.setGender(fisherman.getGender());
            updatedFisherman.setAddress(fisherman.getAddress());
            return fishermanRepository.save(updatedFisherman);
        } else {
            return null;
        }
    }
}
