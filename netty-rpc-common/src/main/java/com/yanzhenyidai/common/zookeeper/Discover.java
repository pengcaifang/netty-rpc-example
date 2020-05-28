package com.yanzhenyidai.common.zookeeper;

import org.I0Itec.zkclient.ZkClient;

/**
 * @author frank
 * @version 1.0
 * @date 2020-05-13 17:07
 */
public class Discover {

    private String zkAddress = "localhost:2181";

    public String discover(String serviceName) {
        ZkClient zkClient = new ZkClient(zkAddress);

        try {
            return zkClient.readData(serviceName);
        } finally {
            zkClient.close();
        }
    }
}
