package ${package}.${rootArtifactId}.param;

import lombok.Data;
import java.io.Serializable;

@Data
public class BaseParam implements Serializable {

  private static final long serialVersionUID = 843875475385388601L;

  /**
   * UUID
   */
  private String requestId;

}
