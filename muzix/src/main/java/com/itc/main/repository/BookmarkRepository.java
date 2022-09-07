package com.itc.main.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itc.main.entity.Bookmark;
@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark,Integer>{

	Optional<Bookmark> findBysongName(String songName);

	Optional<Bookmark> findBysingerName(String singerName);

	void deleteBysongName(String songName);

}
