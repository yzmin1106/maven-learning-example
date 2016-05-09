package ${package}.${rootArtifactId}.service;

import ${package}.${rootArtifactId}.param.HelloWorldParam;
import ${package}.${rootArtifactId}.model.HelloWorldModel;

import com.youzan.api.common.response.PlainResult;

public interface HelloWorldService {
    PlainResult<HelloWorldModel> sayHello(HelloWorldParam helloWorldParam);
}
