package com.example.springkadaiform.controller;

import org.springframework.core.Conventions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.springkadaiform.form.ContactForm;

@Controller
public class ContactFormController {

	//お問い合わせフォーム
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("contactForm", new ContactForm());
		return "contactFormView";
	}
	

	//入力確認画面
		@PostMapping("/confirm")
		public String confirm(RedirectAttributes redirectAttributes, 
				@Validated ContactForm form,BindingResult result,Model model) {
			model.addAttribute("form", form);
			//バリデーションエラーがあった場合は終了
			if (result.hasErrors()) {
				//フォームクラスをビューを受け渡す
				redirectAttributes.addFlashAttribute("ContactForm", form);
				//バリデーション結果をビューに受け渡す
				redirectAttributes.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX
						+ Conventions.getVariableName(form), result);

				return "contactFormView";

			}

			return "confirmView";
		}

	}
