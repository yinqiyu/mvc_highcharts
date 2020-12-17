package com.yqy.service;

import com.yqy.Dao.ExplorerDao;
import com.yqy.vo.Explorer;

import java.util.List;

/**
 * 业务层
 */
public class ExplorerService {

    private final ExplorerDao explorerDao = new ExplorerDao();
    /*
    * 查询所有的浏览器
    *@return
    */
    public List<Explorer> findAllExplorers(){
        return explorerDao.findAllExplorers();
    }
}
