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
		List<Song> Songmessage = new ArrayList<Song>();//������Ϣ��
		System.out.println("��������Ϣ��");
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
		for (Song song : Songmessage) {//��ʾ������Ϣ��
			System.out.println(song);
		}
		/*System.out.println("��ѡ��ģʽ��1.����ģʽ��2.�û�ģʽ����");
		Scanner a = new Scanner(System.in);
		int nu = a.nextInt();
		if(nu == 1)
		{
			System.out.println("��ѡ���ܣ�1.��裬2.��˳�򲥷ţ���");
			Scanner b = new Scanner(System.in);
			int i = b.nextInt();
			songdrive.master.play(i);
		}
		else if(nu == 2)
		{
			while(true){
				System.out.println("�����������ţ�");
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
			//�û�����γ��������Ϣ������ͬ�Ĳ��ű�
			System.out.println("�����������ţ�");
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
		//����������ģʽ
		System.out.println("��ѡ���ܣ�1.��裬2.��˳�򲥷ţ���");
		Scanner b = new Scanner(System.in);
		int i = b.nextInt();
		songdrive.master.play(i);
		
   }
}
