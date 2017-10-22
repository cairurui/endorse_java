### 创建类目表：

```mysql
 SHOW DATABASES;

CREATE DATABASE sell DEFAULT CHARACTER SET utf8mb4; 

USE sell;

CREATE TABLE product_category(
	category_id INT PRIMARY KEY AUTO_INCREMENT,
	category_name VARCHAR(64) NOT NULL COMMENT '类目名称',
	category_type INT(11) UNIQUE NOT NULL COMMENT '类目编号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	update_time  TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  COMMENT '修改时间'
);

SHOW TABLES;

# 另一种写法
CREATE TABLE product_category1(
	category_id INT(11) NOT NULL AUTO_INCREMENT,
	category_name VARCHAR(64) NOT NULL COMMENT '类目名称',
	category_type INT(11) NOT NULL COMMENT '类目编号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	update_time  TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  COMMENT '修改时间',
	PRIMARY KEY (category_id),
	UNIQUE KEY  (category_type)
);


SELECT * FROM product_category;

INSERT INTO product_category(category_id,category_name,category_type) VALUES(1,'热销榜',10);

```


### 2. 商品表


```mysql
-- 商品
create table `product_info` (
    `product_id` varchar(32) not null,
    `product_name` varchar(64) not null comment '商品名称',
    `product_price` decimal(8,2) not null comment '单价',
    `product_stock` int not null comment '库存',
    `product_description` varchar(64) comment '描述',
    `product_icon` varchar(512) comment '小图',
    `product_status` tinyint(3) DEFAULT '0' COMMENT '商品状态,0正常1下架',
    `category_type` int not null comment '类目编号',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`product_id`)
);
```


