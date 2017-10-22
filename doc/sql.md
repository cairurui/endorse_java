创建类目表：

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