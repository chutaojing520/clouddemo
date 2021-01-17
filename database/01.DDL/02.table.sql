/*add wujiafeng 2020/01/11 创建支付表 start*/
CREATE TABLE IF NOT EXISTS `payment`(
   `payment_id` BIGINT UNSIGNED AUTO_INCREMENT comment '主键',
   `payment_serial` VARCHAR(400) comment '序列号',
   PRIMARY KEY ( `payment_id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*add wujiafeng 2020/01/11 创建支付表 end*/