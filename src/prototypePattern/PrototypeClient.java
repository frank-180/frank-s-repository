package prototypePattern;

import java.io.IOException;

/**
 * 
 * ԭ��ģʽ�ͻ��� ��ʾ��ȿ�����ǳ�ȿ���
 * 
 * @author ���ں�
 *
 */

public class PrototypeClient {

	public static void shallowCopy() throws CloneNotSupportedException {
		Resume aResume = new Resume();
		aResume.setName("���� ").setGender("�� ").setAge(25);
		aResume.setWorkExperience("1999-2002, ", "XX��˾");

		Resume bResume = (Resume) aResume.clone();
		bResume.setWorkExperience("1999-2002, ", "YY��˾");

		Resume cResume = (Resume) aResume.clone();
		cResume.setWorkExperience("1999-2002, ", "ZZ��˾");

		System.out.println(">>>>>>ǳ�ȿ���:");
		aResume.display();
		bResume.display();
		cResume.display();
	}

	public static void deepCopy() throws CloneNotSupportedException,
		ClassNotFoundException, IOException {
	    Resume aResume = new Resume();
	    aResume.setName("���� ").setGender("�� ").setAge(25);
	    aResume.setWorkExperience("1999-2002, ", "XX��˾");

	    Resume bResume = (Resume) aResume.deepClone();
	    bResume.setWorkExperience("1999-2002, ", "YY��˾");

	    Resume cResume = (Resume) aResume.deepClone();
	    cResume.setWorkExperience("1999-2002, ", "ZZ��˾");

	    System.out.println(">>>>>>��ȿ���:");
	    aResume.display();
	    bResume.display();
	    cResume.display();

	}

	public static void main(String[] args) throws CloneNotSupportedException,
		ClassNotFoundException, IOException {

			// ǳ�ȿ���
			shallowCopy();

			System.out.println("==================================");

			// ��ȿ���
			deepCopy();

	}
}
