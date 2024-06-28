package himedia.myportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.myportal.repositories.dao.PhonebookDao;
import himedia.myportal.repositories.vo.PhonebookVo;

@Service("phonebookService")
public class PhonebookServiceImpl implements PhonebookService{

	@Autowired
	private PhonebookDao phonebookDao;

	@Override
	public List<PhonebookVo> getList() {
		List<PhonebookVo> list = phonebookDao.selectAll();
		return list;
	}

	@Override
	public boolean write(PhonebookVo phonebookVo) {
		int insertedCount = phonebookDao.insert(phonebookVo);
		return insertedCount == 1;
	}

	@Override
	public boolean update(PhonebookVo phonebookVo) {
		int updatedCount = phonebookDao.update(phonebookVo);
		return updatedCount == 1;
	}

	@Override
	public boolean delete(Long id) {
		int deletedCount = phonebookDao.delete(id);
		return deletedCount == 1;
	}

	 
	
	
}
