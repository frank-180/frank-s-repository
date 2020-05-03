package compositePattern;

/**
 * 
 * �ͻ��ˡ�ͨ��Component�ӿڲ�����ϲ����Ķ���
 * 
 * @author ���ں�
 *
 */

public class CompositeClient {

	public static void main(String[] args) {

		//�Ӵ�С��������
		//ѧУ
		University university = new University("������ѧ");
		
		//ѧԺ
		College computerCollege = new College("�������ѧѧԺ");
		College cityConstructionCollege = new College("���н���ѧԺ");
		
		
		//רҵ
		computerCollege.add(new Leaf("�������"));
		computerCollege.add(new Leaf("���繤��"));
		computerCollege.add(new Leaf("�������ѧ�뼼��"));
		computerCollege.add(new Leaf("��Ϣ��ȫ"));

		cityConstructionCollege.add(new Leaf("��ľ����"));
		cityConstructionCollege.add(new Leaf("���̹���"));
		cityConstructionCollege.add(new Leaf("����ˮ��ѧ�빤��"));
		cityConstructionCollege.add(new Leaf("����ѧ"));
		cityConstructionCollege.add(new Leaf("�����滮"));
		
		//��ѧԺ���뵽ѧУ
		university.add(computerCollege);
		university.add(cityConstructionCollege);

		System.out.println("--��ӡ��ѧ��Ϣ--");
		university.print();
		System.out.println("--��ӡѧԺ��Ϣ--");
		cityConstructionCollege.print();
	}

}
