package jp.co.systena.tigerscave.rpgapp.model;


//武闘家クラス(職業クラスから継承)
public class Fighter extends Job{


	@Override //抽象クラスからオーバーライド(上書き)
	public string fight(){
		fight = this.name + "は拳で攻撃した！";
		return fight;
	}


	@Override //抽象クラスからオーバーライド(上書き)
	public string recovery() {
		recovery = this.name + "はやくそうで回復した！";
		return recovery;
	}
}