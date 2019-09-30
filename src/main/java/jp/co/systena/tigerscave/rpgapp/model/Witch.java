package jp.co.systena.tigerscave.rpgapp.model;

//魔法使いクラス(職業クラスから継承)
public class Witch extends Job{



	@Override //抽象クラスからオーバーライド(上書き)
	public string fight(){
		fight = this.name + "はまほうで攻撃した！";
		return fight;
	}

	@Override //抽象クラスからオーバーライド(上書き)
	public string recovery() {
		recovery = this.name + "はまほうで回復した！";
		return recovery;
	}
}