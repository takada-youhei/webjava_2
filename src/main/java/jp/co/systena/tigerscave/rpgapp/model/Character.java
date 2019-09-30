package jp.co.systena.tigerscave.rpgapp.model;

public class Character{

	public String name = null;
	public String jobname = null;
	public Job job = null;


    //氏名のゲッター、セッター
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	//職業名のゲッター、セッター
	public String getJobname() {
		return this.jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}


	//中身のゲッター、セッター(戦士クラスor魔法使いクラスor武闘家クラス)
	public Job getJob() {
		return this.job;
	}
	public void setJob(Job job) {
		this.job = job;
	}

}