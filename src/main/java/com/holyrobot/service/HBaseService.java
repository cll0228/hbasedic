package com.holyrobot.service;

import com.holyrobot.pojo.NameSpace;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.NamespaceDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuill on 2018/3/30.
 */
@Service
public class HBaseService {

    // 日志
    public static Logger logger = LoggerFactory.getLogger(HBaseService.class);

    // 声明静态配置
    public static Configuration conf = null;

    HBaseAdmin admin = null;

    static {
        try {
            conf = HBaseConfiguration.create();
            conf.set("hbase.zookeeper.quorum", "cm-cm,cm-master01,cm-master02");
            conf.set("hbase.zookeeper.property.clientPort", "2181");
            logger.info("hbase初始化配置结束");
        } catch (Exception e) {
            logger.error("====hbase初始化配置失败:" + e);
        }
    }

    public List<NameSpace> getNamespace() throws IOException {
        if (null == admin) {
            admin = new HBaseAdmin(conf);
        }
        NamespaceDescriptor[] namespaceDescriptors = admin.listNamespaceDescriptors();
        List<NameSpace> list = new ArrayList<>();
        for (NamespaceDescriptor n : namespaceDescriptors) {
            NameSpace space = new NameSpace();
            space.setName(n.getName());
            list.add(space);
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        HBaseAdmin admin = new HBaseAdmin(conf);
        NamespaceDescriptor[] namespaceDescriptors = admin.listNamespaceDescriptors();
        for (NamespaceDescriptor n :
                namespaceDescriptors) {
            System.out.println(n);
        }
        TableName[] tableNames = admin.listTableNames();
        for (TableName name :
                tableNames) {
            System.out.println(name);
        }
    }
}
