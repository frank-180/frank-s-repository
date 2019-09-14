package string;

import java.util.Random;

public class 字符串随机数 {

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
        
        Random a = new Random();                      //创建随机数
        int b = a.nextInt(12);                        //确定随机数范围
        String c = array1[b] + array2[b] + array3[b]; //产生一串字符
        
        System.out.println(c);                        //输出字符
        System.out.println(c.length());               //输出字符长度
        
	}

}
