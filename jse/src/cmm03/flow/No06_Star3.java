package cmm03.flow;
/*
�ڡڡڡڡ�
   �ڡڡڡ�
      �ڡڡ�
         �ڡ�
            ��
*/
public class No06_Star3 {
	public static void main(String[] args) {
		int a = 0, b = 0;
		//	��
			for(a=0;a<5;a++){
				for(b=0;b<5;b++){
					if(a>b){
					System.out.print("   ");		
				}else{
					System.out.print("��");
				}
			}
				System.out.println("");
		}
	}
}
