package com.example.fisherman.Fisherman.Repository;

import com.example.fisherman.Fisherman.Model.Fisherman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishermanRepository extends JpaRepository<Fisherman, Long> {
}
