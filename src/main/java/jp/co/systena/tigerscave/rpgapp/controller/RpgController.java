package jp.co.systena.tigerscave.rpgapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.systena.tigerscave.rpgapp.model.Character;
import jp.co.systena.tigerscave.rpgapp.model.Fighter;
import jp.co.systena.tigerscave.rpgapp.model.Warrior;
import jp.co.systena.tigerscave.rpgapp.model.Witch;


//コントローラークラスとspring bootが認識
@Controller

public class RpgController {

	@Autowired
	HttpSession session;
	// セッション管理


	@RequestMapping(value = "/slect",method = RequestMethod.GET)
	// URLとのマッピング(http://localhost:8080/rpg/select)←にアクセスされると以下の処理実行
	// 「選択画面」へ遷移
	public ModelAndView select(ModelAndView mav) {

		mav.setViewName("Select");
		return mav;
	}


	@RequestMapping(value = "/check",method = RequestMethod.GET)
	// URLとのマッピング(http://localhost:8080/rpg/check)←にアクセスされると以下の処理実行
	// 「選択画面」での入力情報を「確認画面」へリターンする(⇒GET)
	public ModelAndView check(ModelAndView mav, HttpServletRequest request) {


		Character character = new Character();
		switch (character.jobname) {
			case "warrior":
				Warrior warrior = new Warrior();
				character.setJob(warrior);


				break;

			case "witch":
				Witch witch = new Witch();
				character.setJob(witch);

				break;

			case "fighter":
				Fighter fighter = new Fighter();
				character.setJob(fighter);

				break;
		}


		mav.addObject("character", "character");                // ← ここでviewで使用する変数の定義
		mav.setViewName("Check");                               // ← ここで遷移先のviewの指定

	    session.setAttribute("character", character);           // ← ここでデータをセッションへ保存

		return mav;
	}



	@RequestMapping(value = "/action",method = RequestMethod.POST)
	// URLとのマッピング(http://localhost:8080/action)←にアクセスされると以下の処理実行
	// 「確認画面」の入力情報を「結果画面」へリターンする(⇒GET)
	public ModelAndView action(ModelAndView mav) {


		mav.addObject("character", "character");               // ← ここでviewで使用する変数の定義
		mav.setViewName("Action");                             // ← ここで遷移先のviewの指定
		return mav;
	}
}