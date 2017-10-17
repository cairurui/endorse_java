

``` 
CREATE DATABASE sell;
USE sell;

 
CREATE TABLE product_category(
	category_id INT NOT NULL AUTO_INCREMENT,
	category_name VARCHAR(64) NOT NULL COMMENT '类目名称',
	category_type INT(11) NOT NULL COMMENT '类目编号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
	PRIMARY KEY ('category_id'),
	UNIQUE KEY 'uqe_category_time' ('category_type')
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '类目表' ;


```