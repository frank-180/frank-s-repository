package Ů��ȥ��Ұ;

public class Ů��ȥ��Ұ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double HP = 0, attack;
        double LastHP = 0;
        for(attack = 5; attack > 0; attack--) {
        	LastHP += 1;
        	HP = LastHP / 2;
        	LastHP = HP;
        }
        System.out.println("Ů����ʼѪ��HP=" + HP);
	}

}
