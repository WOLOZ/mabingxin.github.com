package SingSong;

public class Song {
	public int ID;//∏Ë«˙±‡∫≈
	public String SongName;//∏Ë√˚
	public String Singer;//∏Ë ÷
	public double Time;//∏Ë«˙ ±≥§
	public Song(int id, String SN,String Si,double Ti){
		this.ID = id;
		this.SongName = SN;
		this.Singer = Si;
		this.Time = Ti;
	}
	public int getId() {
		return ID;
	}
	public void setId(int id) {
		this.ID = id;
	}
	
	public String getSongName() {
		return SongName;
	}

	public void setSongName(String songName) {
		this.SongName = songName;
	}

	public String getSinger() {
		return Singer;
	}

	public void setSinger(String singer) {
		this.Singer = singer;
	}

	public double getTime() {
		return Time;
	}

	public void setTime(double time) {
		this.Time = time;
	}
	public String  toString() {
		return "Song [id=" + ID + ", songName=" + SongName + ", singer="+ Singer + ", time=" + Time + "]";
	}

}
