package com.oitct.Tkshop.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.oitct.Tkshop.DAO.LibraryDAO;
import com.oitct.Tkshop.Util.ManConstant;
import com.oitct.Tkshop.VO.BookInsertVO;
import com.oitct.Tkshop.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	@Autowired
	LibraryDAO librarydao;
	
	@Autowired
	DataSourceTransactionManager transactionManager;
	
	@Override
	public int bookinsert(BookInsertVO srch_cnd) {
		
		boolean koinsert = false;
		
		TransactionStatus txStatus = transactionManager.getTransaction(new DefaultTransactionDefinition());
		
		try {
			
			librarydao.BookWD(srch_cnd);
			transactionManager.commit(txStatus);
			koinsert = true;
			return 1;
		} catch (Exception e) {
			
			transactionManager.rollback(txStatus);	
			ManConstant.logger.info("DB저장 실패");
			e.printStackTrace();
		}
		
		return 0;
	}
	
}
