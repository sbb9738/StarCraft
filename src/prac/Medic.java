package prac;

class Medic extends Unit implements Boardable,Healable {

    Medic()
    {
     super(50);   //�޵��� max hp �� 50����
    }

public void move_sound() {
 System.out.println("�޵񰣴�.");

}

public void attack_sound() {
 System.out.println("�޵�����Ѵ�.");

}

   public void heal(Healable r)  //Healable �� implements�� ���ֵ� �ƹ��ų� �������ִ�.
   {
    Unit u =(Unit)r;     //Unit �� �������� �����߱⶧���� r �� unit ������ ����ȯ���ش�.
    while(u.hitPoint !=u.MAX_HP)   //max hp �� �ɶ�����
    {
     u.hitPoint++;    //hitpoint�� ������Ų��.
   System.out.println("ġ����..:>"+u.hitPoint);
    }
    System.out.println("ġ��Ϸ�");
   }
}


