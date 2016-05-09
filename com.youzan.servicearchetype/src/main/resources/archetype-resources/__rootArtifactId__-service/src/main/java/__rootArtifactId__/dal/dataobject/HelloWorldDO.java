package ${package}.${rootArtifactId}.dal.dataobject;

import lombok.Data;


@Data
public class HelloWorldDO {

    /**
     * id
     */
    private Long id;

    /**
     * 名字
     */
    private String name;
}
