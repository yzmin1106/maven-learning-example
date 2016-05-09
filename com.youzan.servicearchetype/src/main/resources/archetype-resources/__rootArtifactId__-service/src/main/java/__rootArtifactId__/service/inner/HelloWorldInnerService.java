package ${package}.${rootArtifactId}.service.inner;

import ${package}.${rootArtifactId}.dal.dao.HelloWorldDAO;
import ${package}.${rootArtifactId}.dal.dataobject.HelloWorldDO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class HelloWorldInnerService {

    @Autowired
    private HelloWorldDAO helloWorldDAO;

    public List<HelloWorldDO> getAliasMapList() {
        List<HelloWorldDO> helloWorldDOList = helloWorldDAO.findList();
        return helloWorldDOList;
    }
}