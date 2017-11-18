package com.techworld.kunal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techworld.kunal.model.expense.ExpenseCategory;
import com.techworld.kunal.model.expense.ExpenseCategoryType;
import com.techworld.kunal.model.expense.ExpenseTransaction;
import com.techworld.kunal.services.ExpenseService;

@RestController
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping(method=RequestMethod.POST,value="/addExpenseCategory")
	public String addExpenseCategory(@RequestBody ExpenseCategory expenseCategory) {
		return expenseService.addExpenseCategory(expenseCategory);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addExpenseCategoryType")
	public String addExpenseCategoryType(@RequestBody ExpenseCategoryType expenseCategoryType) {
		return expenseService.addExpenseCategoryType(expenseCategoryType);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addExpenseTransaction")
	public String addExpenseTransaction(@RequestBody ExpenseTransaction expenseTransaction) {
		return expenseService.addExpenseTransaction(expenseTransaction);
	}
}