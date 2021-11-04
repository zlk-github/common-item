### 1 mysql数据库SQL 脚本


库名称：test

测试表：

    CREATE TABLE `ts_user` (
    `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `name` varchar(150) NOT NULL DEFAULT '' COMMENT '名字',
    `status` tinyint(1) DEFAULT '1' COMMENT '有效状态（0禁用，1启用）',
    `create_by` varchar(64) DEFAULT '' COMMENT '创建者id',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by` varchar(64) DEFAULT '' COMMENT '更新者id',
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `time` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COMMENT='用户表'
