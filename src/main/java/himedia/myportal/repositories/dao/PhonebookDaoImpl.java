package himedia.myportal.repositories.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.exceptions.BoardDaoException;
import himedia.myportal.exceptions.PhonebookDaoException;
import himedia.myportal.repositories.vo.PhonebookVo;

@Repository("phonebookDao")
public class PhonebookDaoImpl implements PhonebookDao{
	
	private static final Logger logger = LoggerFactory.getLogger(PhonebookDaoImpl.class);
	
	@Autowired	
	private SqlSession sqlSession;

	@Override
	public List<PhonebookVo> selectAll() {
		List<PhonebookVo> list = sqlSession.selectList("phonebook.selectAll");
		logger.debug(list.toString());
		return list;
	}

	@Override
	public int insert(PhonebookVo phonebookVo) {
		
		logger.debug("게시물 작성 액션");
		logger.debug("phonebookVo:" + phonebookVo);
		
		
		try {
			int insertedCount = sqlSession.insert("phonebook.insert", phonebookVo);
			logger.debug("삽입된 레코드 수:" + insertedCount);
			return insertedCount;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("게사물 입력 중 예외 발생!");
			throw new PhonebookDaoException("게시물 입력 중 예외 발생!", phonebookVo);
		}
	}


	@Override
	public int update(PhonebookVo phonebookVo) {
		try {
			int updatedCount = sqlSession.update("phonebook.update", phonebookVo);
			return updatedCount;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PhonebookDaoException("게시물 업데이트 도중 예외 발생!", phonebookVo);
		}
	}


	@Override
	public int delete(Long id) {
		
	
		 logger.debug("Deleting a phonebook entry with id: " + id);

	        try {
	            int deletedCount = sqlSession.delete("phonebookDao.delete", id);
	            logger.debug("deletedCount: " + deletedCount);
	            return deletedCount;
	        } catch (Exception e) {
	            logger.error("Exception : " + id, e);
	            throw new PhonebookDaoException("Exception: " + id);
	        }
	
	
	}
}
