package string;

import java.util.Random;

public class �ַ�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] array1 = new String[] {"1234", "200320", "7014", "421125","2018",
        		 "03311", "19", "0", "182", "108", "412", "584770"};
        String[] array2 = new String[] {"kebi", "qiaodan", "zhanmusi", "maidi", 
        		"baoluo", "weide", "ouwen", "dulante", "weisibuluke", "hadeng",
                "kuli", "tangpusen"};
        String[] array3 = new String[] {"koby", "jordan", "james", "tracymcgady",
        		"paul", "wade", "living", "durant", "westbrook", "harden",
                "curry", "thompson"};
        
        Random a = new Random();                      //���������
        int b = a.nextInt(12);                        //ȷ���������Χ
        String c = array1[b] + array2[b] + array3[b]; //����һ���ַ�
        
        System.out.println(c);                        //����ַ�
        System.out.println(c.length());               //����ַ�����
        
	}

}
