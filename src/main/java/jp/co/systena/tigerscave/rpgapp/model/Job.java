package jp.co.systena.tigerscave.rpgapp.model;


//抽象クラス(職業)
public abstract class Job {

	public String name = null;
	public String fight = null;
	public String recovery = null;

    //氏名のゲッター、セッター
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public abstract void fight(); //抽象メソッド(戦うメソッド。子クラスでオーバーライドする)
	public abstract void recovery(); //抽象メソッド(回復メソッド。子クラスでオーバーライドする)


}