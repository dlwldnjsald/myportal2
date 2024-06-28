package himedia.myportal.exceptions;

import himedia.myportal.repositories.vo.PhonebookVo;

public class PhonebookDaoException extends RuntimeException {

	private PhonebookVo phonebookVo = null;
	
	public PhonebookDaoException() {
		
	}
	
	public PhonebookDaoException(String message) {
		super(message);	
	}
	
	public PhonebookDaoException(String message, PhonebookVo phonebookVo) {
		super(message);	
		this.phonebookVo = phonebookVo;
	}

	public PhonebookVo getPhonebookVo() {
		return phonebookVo;
	}

	public void setPhonebookVo(PhonebookVo phonebookVo) {
		this.phonebookVo = phonebookVo;
	}
	
	
	
}
