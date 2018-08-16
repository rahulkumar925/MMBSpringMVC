package com.cg.mmb.controller;

import java.util.Collection;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.cg.mmb.pojo.BankAccount;
import com.cg.mmb.service.BankAccountService;



@Controller
public class MMBController {

	private BankAccountService service = new BankAccountService();
	Collection <BankAccount> accounts = service.viewBankAccount();
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/viewAccount")
	public String viewAccount(Model model) {
		model.addAttribute("account", accounts);
		
		return "viewAccount";
	}
	
	@RequestMapping("/withdraw")
	public String withdraw() {
		return "withdraw";
		
	}
	
	@RequestMapping("/withdrawSave")
	public String withdrawSave(@RequestParam("accountNumber") String accNumber,@RequestParam("withdrawAmount") String withAmount, Model model){
		int flag=0;
		double balance;
		 accounts = service.viewBankAccount();
	    //request.setAttribute("account", accounts );
		int accountNumber = Integer.parseInt(accNumber);
		double withdrawAmount=Double.parseDouble(withAmount);
		//String page="";
		for(BankAccount account1 : accounts) {
			if(accountNumber==account1.getAccountNumber()) {
				
				balance = service.withdraw(withdrawAmount,accountNumber);
				model.addAttribute("bal", balance);
				//page="SuccessWithdrawal.jsp";
				flag=1;
				return "SuccessWithdrawal";
			}
			}
			if(flag==0) {
				//page="error.jsp";
				return "error";
			}
			//RequestDispatcher dispatcher = request.getRequestDispatcher(page);
			//dispatcher.forward(request, response);
			return "";
		
	}
	
	
	
}
