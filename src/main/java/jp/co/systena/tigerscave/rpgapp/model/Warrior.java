package jp.co.systena.tigerscave.rpgapp.model;

// 戦士クラス(職業クラスから継承)
public class Warrior extends Job{

	public void warrior(String name) {
	    this.name = getName();
	}


	@Override //抽象クラスからオーバーライド(上書き)
	public String fight(){
		fight = this.name + "は剣で攻撃した！";
		return fight;
	}

	@Override //抽象クラスからオーバーライド(上書き)
	public String recovery() {
		recovery = this.name + "はやくそうで回復した！";
		return recovery;
	}
}