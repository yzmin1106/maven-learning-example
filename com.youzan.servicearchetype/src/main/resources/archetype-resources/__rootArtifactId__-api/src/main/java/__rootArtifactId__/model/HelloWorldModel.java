package ${package}.${rootArtifactId}.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class HelloWorldModel implements Serializable {

	private static final long serialVersionUID = 693112447374870160L;

	/**
   	 * 自增主键
     */
  	private Long id;

  	/**
   	 * 内容
     */
    private String content;
}
