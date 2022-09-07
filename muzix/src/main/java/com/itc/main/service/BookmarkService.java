package com.itc.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itc.main.entity.Bookmark;
import com.itc.main.repository.BookmarkRepository;

@Service
public class BookmarkService {
	@Autowired
	private BookmarkRepository bookmarkRepository;
	public void saveBookmark(Bookmark bookmark) {
		this.bookmarkRepository.save(bookmark);
	}
	public List<Bookmark> getAllBookmark(){
		List<Bookmark> list=this.bookmarkRepository.findAll();
		return list;
		
	}
	public Bookmark getBookmarkBysongName(String songName) {
		Optional<Bookmark> op=this.bookmarkRepository.findBysongName(songName);
		if(op.isPresent()) {
			return op.get();
		}else
			return null;
	}
	public Bookmark getBookmarkBysingerName(String singerName) {
		Optional<Bookmark> op=this.bookmarkRepository.findBysingerName(singerName);
		if(op.isPresent()) {
			return op.get();
		}else
			return null;
	}
	
	public boolean deleteBookmarkBysongName(String songName) {
		this.bookmarkRepository.deleteBysongName(songName);
		return true;
	}
	
	
	

}
