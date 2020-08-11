package prac;

public class StarCraft {

	public static void main(String[] args) {

		Marine m = new Marine();
		Tank t = new Tank();
		Scv s = new Scv();
		Medic md = new Medic();
		DropShip ds = new DropShip();

		ds.hitPoint = 90; // ������ ������ HP------------------
		t.hitPoint = 140;
		m.hitPoint = 30;

		md.heal(m); // �޵����� ������ ġ�����ش�.
		ds.tab(m); // ��ӽ����� ������ �¿��.
		s.repair(t);
		s.repair(ds); // scv �� drop ship�� �¿��.
		s.repair(s);

		m.move_sound();
		m.ok_sound();
		t.move_sound();

		t.mode_sound();
		t.ok_sound();
	}
}
