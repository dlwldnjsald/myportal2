package himedia.myportal.repositories.dao;

import java.util.List;

import himedia.myportal.repositories.vo.PhonebookVo;

public interface PhonebookDao {

	public List<PhonebookVo> selectAll();
	public int insert(PhonebookVo phonebookVo);
	public int update(PhonebookVo phonebookVo);
	public int delete(Long id);
}
