package prototypePattern;

import java.io.Serializable;

/**
 * 
 * ���������࣬Ϊ��ʾ��ȿ�����ǳ�ȿ�������
 * 
 * @author ���ں�
 *
 */

public class WorkExperience implements Serializable{

	 private static final long serialVersionUID = 1L;

	    private String workDate;
	    private String workCompany;

	    public String getWorkDate() {
		return workDate;
	 }

	 public WorkExperience setWorkDate(String workDate) {
		this.workDate = workDate;

		return this;
	 }

	 public String getWorkCompany() {
		return workCompany;
	 }

	 public WorkExperience setWorkCompany(String workCompany) {
		this.workCompany = workCompany;

		return this;
	 }

}
