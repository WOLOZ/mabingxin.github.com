package SingSong;

import java.util.*;



public class SongDrive {
	public Master master;
	public Player player;
	public static SongDrive songdrive = new SongDrive();
	public SongDrive(){
	this.master = new Master();
	this.player = new Player();
	}
	public static void main(String args[]){
		List<Song> Songmessage = new ArrayList<Song>();//歌曲信息表
		System.out.println("歌库歌曲信息表：");
		Songmessage.add(new Song(1, "mm", "nn", 3.0));
		Songmessage.add(new Song(2, "aa", "bb", 3.0));
		Songmessage.add(new Song(3, "cc", "gg", 3.0));
		Songmessage.add(new Song(4, "yy", "oo", 3.0));
		Songmessage.add(new Song(5, "ww", "pp", 3.0));
		Songmessage.add(new Song(6, "c", "g", 3.0));
		Songmessage.add(new Song(7, "b", "n", 3.0));
		Songmessage.add(new Song(8, "v", "l", 3.0));
		Songmessage.add(new Song(9, "m", "n", 3.0));
		Songmessage.add(new Song(10, "k", "p", 3.0));
		for (Song song : Songmessage) {//显示歌曲信息表
			System.out.println(song);
		}
		/*System.out.println("请选择模式（1.主持模式，2.用户模式）：");
		Scanner a = new Scanner(System.in);
		int nu = a.nextInt();
		if(nu == 1)
		{
			System.out.println("请选择功能（1.点歌，2.按顺序播放）：");
			Scanner b = new Scanner(System.in);
			int i = b.nextInt();
			songdrive.master.play(i);
		}
		else if(nu == 2)
		{
			while(true){
				System.out.println("请输入歌曲编号：");
				Scanner d = new Scanner(System.in);
				int id = d.nextInt();
			    Song song = Songmessage.get((int)id - 1);
			    songdrive.player.addSong(songdrive, song);
			    int s = 0;
			    if(s > 8)
			    {
		         break;
			    }
			    s++;
		      }
		
		
		
	    }*/
		boolean z = true;
		int s = 0;
		while(z){
			//用户点歌形成与歌曲信息表长度相同的播放表
			System.out.println("请输入歌曲编号：");
			Scanner d = new Scanner(System.in);
			int id = d.nextInt();
		    Song song = Songmessage.get((int)id - 1);
		    songdrive.player.addSong(songdrive, song);
		   if (s > 8)
		   {
			   z = false;
		   }
              s++;
	      }
		//进入主持人模式
		System.out.println("请选择功能（1.点歌，2.按顺序播放）：");
		Scanner b = new Scanner(System.in);
		int i = b.nextInt();
		songdrive.master.play(i);
		
   }
}
