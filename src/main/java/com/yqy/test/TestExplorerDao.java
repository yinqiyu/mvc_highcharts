package com.yqy.test;

import com.yqy.Dao.ExplorerDao;
import com.yqy.vo.Explorer;
import flexjson.JSONSerializer;
import org.junit.Test;

import java.util.List;

public class TestExplorerDao {
    private final ExplorerDao explorerDao = new ExplorerDao();
    @Test
    public void testFindAll(){
        List<Explorer> explorers = explorerDao.findAllExplorers();
        for (Explorer explorer:explorers){
            System.out.println(explorer);
        }
    }

    @Test
    public void testToJSON(){
        //创建JSON转换器
        List<Explorer> explorers = explorerDao.findAllExplorers();
        //去除class属性
        JSONSerializer serializer = new JSONSerializer();
        serializer.exclude("class");
        String serialize = serializer.serialize(explorers);
        System.out.println(serialize);
    }
}
