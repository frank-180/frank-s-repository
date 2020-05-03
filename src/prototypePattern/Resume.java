package prototypePattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * ������
 * 
 * @author ���ں�
 *
 */

public class Resume implements Cloneable, Serializable {

	private String name;
    private String gender;
    private int age;

    // ���á���������������Ϊ��ʾ��ȿ�����ǳ�ȿ�������
    private WorkExperience workExperience;

    public Resume() {
    	// �ڡ���������ʵ����ʱ��ͬʱʵ������������������
    	workExperience = new WorkExperience();
    }

    public void display() {
    	System.out.println(this.getName() + " " + this.getGender() + " "
		+ this.getAge() + "\n���������� "
		+ this.getWorkExperience().getWorkDate() + " "
		+ this.getWorkExperience().getWorkCompany());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }

    // ͨ���������л���ʵ����ȿ���
    public Object deepClone() throws IOException, ClassNotFoundException {
    	// ������д������
    	ByteArrayOutputStream bos = new ByteArrayOutputStream();
    	ObjectOutputStream oos = new ObjectOutputStream(bos);
    	oos.writeObject(this);

    	// �����ڶ�������
    	ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(
		bos.toByteArray()));
    	return ois.readObject();

    }

    public String getName() {
    	return name;
    }

    public Resume setName(String name) {
    	this.name = name;

    	return this;
    }

    public String getGender() {
    	return gender;
    }

    public Resume setGender(String gender) {
    	this.gender = gender;

    	return this;
    }

    public int getAge() {
    	return age;
    }

    public Resume setAge(int age) {
    	this.age = age;

    	return this;
    }

    public WorkExperience getWorkExperience() {
    	return workExperience;
    }

    public void setWorkExperience(String workDate, String workCompany) {
    	workExperience.setWorkDate(workDate);
    	workExperience.setWorkCompany(workCompany);
    }	
}
