package 女警去打野;

public class 女警去打野 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double HP = 0, attack;
        double LastHP = 0;
        for(attack = 5; attack > 0; attack--) {
        	LastHP += 1;
        	HP = LastHP / 2;
        	LastHP = HP;
        }
        System.out.println("女警初始血量HP=" + HP);
	}

}
