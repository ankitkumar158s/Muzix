package com.itc.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bookmark {
	@Id
	private int songId;
	private String songName;
	private String singerName;
	public Bookmark() {
		super();
	}
	public Bookmark(int songId, String songName, String singerName) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.singerName = singerName;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	@Override
	public String toString() {
		return "Bookmark [songId=" + songId + ", songName=" + songName + ", singerName=" + singerName + "]";
	}
	

}
