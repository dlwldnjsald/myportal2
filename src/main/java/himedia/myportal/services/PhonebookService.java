package himedia.myportal.services;

import java.util.List;

import himedia.myportal.repositories.vo.PhonebookVo;

public interface PhonebookService {

	public List<PhonebookVo> getList();
	public boolean write(PhonebookVo phonebookVo);
	public boolean update(PhonebookVo phonebookVo);
	public boolean delete(Long id);
}
