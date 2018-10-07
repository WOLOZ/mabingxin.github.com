package SingSong;

import java.util.*;


public class Master {
	 public List<Song> ListSong = new ArrayList<Song>();//歌曲列表
	
	public void play(int i){
		//播放歌曲
		if(i ==1){
			System.out.println("请输入点播歌曲位置：");
			Scanner c = new Scanner(System.in);
			int nu = c.nextInt();
			Song song1 = ListSong.get((int) nu - 1);//主持人点歌
			System.out.println("主持人点歌播放歌曲："+song1.getSongName());
			ListSong.remove((int)nu);//移除主持人点过的歌
			//按顺序播放
			if(ListSong.size()==0)
			{
				System.out.println("播放列表为空，请及时点歌");
			}
			else
			{
				for (int w = 0;w<ListSong.size();w++) 
				{
					Song song2 = ListSong.get(w);
					System.out.println("播放歌曲："+song2.getSongName());
				}
			}
		}
		else if(i == 2){
			//直接按顺序播放
			if(ListSong.size()==0)
			{
				System.out.println("播放列表为空，请及时点歌");
			}
			else
			{
				for (int w = 0;w<ListSong.size();w++) 
				{
					Song song2 = ListSong.get(w);
					System.out.println("播放歌曲："+song2.getSongName());
				}
			}
			
		}
		else{
			System.out.println("选择错误");
		}
		
		
	}
	

}
