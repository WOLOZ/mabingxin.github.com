package SingSong;

import java.util.*;


public class Master {
	 public List<Song> ListSong = new ArrayList<Song>();//�����б�
	
	public void play(int i){
		//���Ÿ���
		if(i ==1){
			System.out.println("������㲥����λ�ã�");
			Scanner c = new Scanner(System.in);
			int nu = c.nextInt();
			Song song1 = ListSong.get((int) nu - 1);//�����˵��
			System.out.println("�����˵�貥�Ÿ�����"+song1.getSongName());
			ListSong.remove((int)nu);//�Ƴ������˵���ĸ�
			//��˳�򲥷�
			if(ListSong.size()==0)
			{
				System.out.println("�����б�Ϊ�գ��뼰ʱ���");
			}
			else
			{
				for (int w = 0;w<ListSong.size();w++) 
				{
					Song song2 = ListSong.get(w);
					System.out.println("���Ÿ�����"+song2.getSongName());
				}
			}
		}
		else if(i == 2){
			//ֱ�Ӱ�˳�򲥷�
			if(ListSong.size()==0)
			{
				System.out.println("�����б�Ϊ�գ��뼰ʱ���");
			}
			else
			{
				for (int w = 0;w<ListSong.size();w++) 
				{
					Song song2 = ListSong.get(w);
					System.out.println("���Ÿ�����"+song2.getSongName());
				}
			}
			
		}
		else{
			System.out.println("ѡ�����");
		}
		
		
	}
	

}
