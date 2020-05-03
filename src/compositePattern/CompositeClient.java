package compositePattern;

/**
 * 
 * 客户端。通过Component接口操作组合部件的对象
 * 
 * @author 程期浩
 *
 */

public class CompositeClient {

	public static void main(String[] args) {

		//从大到小创建对象
		//学校
		University university = new University("长江大学");
		
		//学院
		College computerCollege = new College("计算机科学学院");
		College cityConstructionCollege = new College("城市建设学院");
		
		
		//专业
		computerCollege.add(new Leaf("软件工程"));
		computerCollege.add(new Leaf("网络工程"));
		computerCollege.add(new Leaf("计算机科学与技术"));
		computerCollege.add(new Leaf("信息安全"));

		cityConstructionCollege.add(new Leaf("土木工程"));
		cityConstructionCollege.add(new Leaf("工程管理"));
		cityConstructionCollege.add(new Leaf("给排水科学与工程"));
		cityConstructionCollege.add(new Leaf("建筑学"));
		cityConstructionCollege.add(new Leaf("建筑规划"));
		
		//将学院加入到学校
		university.add(computerCollege);
		university.add(cityConstructionCollege);

		System.out.println("--打印大学信息--");
		university.print();
		System.out.println("--打印学院信息--");
		cityConstructionCollege.print();
	}

}
