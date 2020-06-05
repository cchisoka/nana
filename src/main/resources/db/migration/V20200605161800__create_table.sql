CREATE TABLE `sys_user` (
`user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
`user_name` varchar(50) NOT NULL COMMENT '用户名',
`password` varchar(255) NOT NULL COMMENT '密码',
`phone_number` varchar(20) NULL COMMENT '手机号码',
`email` varchar(50) NULL COMMENT '邮箱',
`nick_name` varchar(20) NULL COMMENT '昵称',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '最近更新时间',
`is_delete` tinyint(4) DEFAULT 0 COMMENT '软删除标记 1 是 0 没有删除',
PRIMARY KEY (`user_id`) ,
UNIQUE INDEX `uk_user_name` (`user_name` ASC) USING BTREE,
UNIQUE INDEX `uk_nick_name` (`nick_name` ASC) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8
COMMENT = '用户表';

-- 初始化数据
insert into sys_user(user_id, user_name, password, nick_name, create_time, update_time) values (1, 'admin', '111111', 'admin', now(), now());

CREATE TABLE `sys_role` (
`role_id` bigint(20) NOT NULL AUTO_INCREMENT,
`role_name` varchar(50) NOT NULL COMMENT '角色名称',
`role_code` varchar(50) NOT NULL COMMENT '角色编码',
`description` varchar(255) NULL,
`create_time` datetime NULL,
`update_time` datetime NULL,
PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8
COMMENT = '角色表';

insert into sys_role (role_id, role_name, role_code, description, create_time, update_time) values (1, '管理员', 'admin', '系统管理员', now(), now());

CREATE TABLE `sys_user_role` (
`user_id` bigint(20) NOT NULL COMMENT '用户id',
`role_id` bigint(20) NOT NULL COMMENT '角色id',
`create_time` datetime NULL,
`update_time` datetime NULL,
PRIMARY KEY (`role_id`, `user_id`)
)
COMMENT = '用户和角色关联表';


insert into sys_user_role (user_id, role_id, create_time, update_time) values (1, 1, now(), now());

CREATE TABLE `sys_menu` (
`menu_id` bigint(20) NOT NULL AUTO_INCREMENT,
`pid` bigint(20) NOT NULL DEFAULT 0 COMMENT '父id',
`menu_name` varchar(50) NOT NULL COMMENT '名称',
`code` varchar(50) NULL COMMENT 'permission值',
`menu_type` tinyint(4) NOT NULL DEFAULT 0 COMMENT '1-目录 2-菜单 3-按钮',
`url` varchar(255) NULL COMMENT '链接',
`create_time` datetime NULL,
`update_time` datetime NULL,
PRIMARY KEY (`menu_id`)
)
COMMENT = '菜单权限表';

CREATE TABLE `sys_role_menu` (
`role_id` bigint(20) NOT NULL,
`menu_id` bigint(20) NOT NULL,
`create_time` datetime NULL,
`update_time` datetime NULL,
PRIMARY KEY (`role_id`, `menu_id`)
)
COMMENT = '角色和菜单权限关联表';

