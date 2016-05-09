package ${package}.${rootArtifactId}.service.impl;

import java.util.List;
import com.youzan.api.common.response.PlainResult;

import ${package}.${rootArtifactId}.service.HelloWorldService;
import ${package}.${rootArtifactId}.service.inner.HelloWorldInnerService;
import ${package}.${rootArtifactId}.model.HelloWorldModel;
import ${package}.${rootArtifactId}.param.HelloWorldParam;
import ${package}.${rootArtifactId}.dal.dataobject.HelloWorldDO;
import ${package}.${rootArtifactId}.transfer.HelloWorldModelTransfer;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.lang3.StringUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.BeanParam;

@Path("/hello")
@Service(protocol = {"rest", "dubbo"})
public class HelloWorldServiceImpl implements HelloWorldService {
    @Autowired
    private HelloWorldInnerService helloWorldInnerService;

    @GET
    @Override
    @Path("/get")
    public PlainResult<HelloWorldModel> sayHello(@BeanParam HelloWorldParam helloWorldParam){
        if (helloWorldParam == null || StringUtils.isEmpty(helloWorldParam.getMessage())) {
            throw new RuntimeException("param is miss");
        }

        List<HelloWorldDO> helloWorldModelList = helloWorldInnerService.getAliasMapList();
        HelloWorldModel helloWorldModel = HelloWorldModelTransfer.toHelloWorldModel(helloWorldModelList.get(0));

        PlainResult<HelloWorldModel> result = new PlainResult<>();
        result.setData(helloWorldModel);
        return result;
    }
}
