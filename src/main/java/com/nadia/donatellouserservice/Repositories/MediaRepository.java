package com.nadia.donatellouserservice.Repositories;

import com.nadia.donatellouserservice.Entities.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {
}
