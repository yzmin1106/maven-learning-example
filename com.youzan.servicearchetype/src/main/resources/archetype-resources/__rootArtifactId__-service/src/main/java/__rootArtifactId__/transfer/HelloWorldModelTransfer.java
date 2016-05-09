package com.youzan.test.transfer;

import ${package}.${rootArtifactId}.dal.dataobject.HelloWorldDO;
import ${package}.${rootArtifactId}.model.HelloWorldModel;

/**
 * Created by bysocket on 16/5/9.
 */
public class HelloWorldModelTransfer {
    public static HelloWorldModel toHelloWorldModel(final HelloWorldDO helloWorldDO) {
        if (helloWorldDO == null) {
            return null;
        }

        HelloWorldModel hello = new HelloWorldModel();
        hello.setId(helloWorldDO.getId());
        hello.setContent(helloWorldDO.getName());
        return hello;
    }
}