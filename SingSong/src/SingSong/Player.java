package SingSong;


public class Player {
	public void addSong(SongDrive songdriver,Song song){
		//将用户点的歌加入到播放歌单中
		songdriver.master.ListSong.add(song);
		
	}

}
