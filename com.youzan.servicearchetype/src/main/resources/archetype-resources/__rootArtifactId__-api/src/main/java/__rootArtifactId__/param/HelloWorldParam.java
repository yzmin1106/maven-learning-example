package ${package}.${rootArtifactId}.param;

import lombok.Data;
import javax.ws.rs.QueryParam;


@Data
public class HelloWorldParam extends BaseParam {

  private static final long serialVersionUID = 843875475385388601L;

  /**
   * 消息
   */
  @QueryParam("message")
  private String message;

}
