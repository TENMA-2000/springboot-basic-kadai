package com.example.springkadaiform.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ContactForm {
	//名前
	@NotBlank(message = "名前を入力してください")
	private String name;
	
	//メールアドレス
	@NotBlank(message = "メールアドレスを入力してください")
	private String email;
	
	//お問い合わせ内容
	@NotBlank(message = "お問い合わせ内容を入力してください")
	private String message;
}
