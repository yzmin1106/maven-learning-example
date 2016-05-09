package ${package}.${rootArtifactId}.dal.dao;


import ${package}.${rootArtifactId}.dal.dataobject.HelloWorldDO;

import java.util.List;

public interface HelloWorldDAO {
    List<HelloWorldDO> findList();
}