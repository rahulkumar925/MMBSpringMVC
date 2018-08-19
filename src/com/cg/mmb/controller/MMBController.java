package com.cg.mmb.controller;

import java.util.Collection;

import javax.servlet.RequestDispatcher;

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
	
	@RequestMapping("/deposit")
	public String deposit() {
		return "deposit";
	}
	
	@RequestMapping("/depositSave")
	public String depositSave(@RequestParam("accountNumber") int accNumber, @RequestParam("depositAmount") double depAmount, Model model) {
		int flag1=0;
		double balance;
		//String page2="";
		  accounts=service.viewBankAccount();
		  int accountNumber = accNumber;
		  double depositAmount= depAmount;
		  
		  for(BankAccount account2 : accounts) {
			  if(accountNumber==account2.getAccountNumber()) {
				  balance = service.deposit(depositAmount,accountNumber);
				  model.addAttribute("bal", balance);
				  //page2="SuccessDeposit.jsp";
				  flag1=1;
				  return "SuccessDeposit";
			  }
		  }
			  if(flag1==0) {
				  //page2="errordeposit.jsp";
				  return "error";
			  }
			 // dispatcher = request.getRequestDispatcher(page2);
			  //dispatcher.forward(request, response);
			  return "";
	}
	
	@RequestMapping("fundTransfer")
	public String fundTransfer() {
		return "fundTransfer";
	}
	
	@RequestMapping("fundTransferSave")
	public String fundTransferSave(@RequestParam("senderAccountNumber") int senderAccNum, @RequestParam("receiverAccountNumber") int recAccNum, @RequestParam("transferAmount") double transAmount, Model model) {
		accounts=service.viewBankAccount();
		int flag2=0;
		double debitedBalance;
		double creditedBalance;
		//String page1="";
		int senderAccountNumber = senderAccNum;
		int receiverAccountNumber = recAccNum;
		double transferAmount= transAmount;
		
		for(BankAccount account3 : accounts) {
			if(senderAccountNumber==account3.getAccountNumber()) {
				flag2=1;
				for(BankAccount account4 : accounts) {
					if(receiverAccountNumber==account4.getAccountNumber()) {
						debitedBalance=service.withdraw(transferAmount, senderAccountNumber);
						creditedBalance=service.deposit(transferAmount, receiverAccountNumber);
						model.addAttribute("debit", debitedBalance);
						model.addAttribute("credit", creditedBalance);
						//page1="SuccessTransfer.jsp";
						flag2=2;
						return "SuccessTransfer";
					}
				}
			}
		}
		    if(flag2==0) {
		    	//page1="sendererror.jsp";
		    	return "sendererror";
		    }
		    if(flag2==1) {
		    	//page1="receivererror.jsp";
		    	return "receivererror";
		    }
			 // RequestDispatcher dispatcher1 = request.getRequestDispatcher(page1);
			  //dispatcher1.forward(request, response);	
		    return "";
	}
	
	
}
