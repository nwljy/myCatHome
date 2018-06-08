/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50560
Source Host           : localhost:3306
Source Database       : spring_boot

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2018-06-08 01:18:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for e_cat
-- ----------------------------
DROP TABLE IF EXISTS `e_cat`;
CREATE TABLE `e_cat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '名字',
  `text` longtext COMMENT '特征',
  `create_date` varchar(14) DEFAULT NULL COMMENT '生成日期',
  `isLive` int(2) DEFAULT NULL COMMENT '是否关注',
  `indexID` int(11) DEFAULT NULL COMMENT '显示位置',
  `Point` varchar(255) DEFAULT NULL COMMENT '地点 经纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_cat
-- ----------------------------

-- ----------------------------
-- Table structure for e_category
-- ----------------------------
DROP TABLE IF EXISTS `e_category`;
CREATE TABLE `e_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `create_date` varchar(14) DEFAULT NULL,
  `text` longtext,
  PRIMARY KEY (`id`),
  CONSTRAINT `e_category_ibfk_1` FOREIGN KEY (`id`) REFERENCES `e_vblog` (`Category_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_category
-- ----------------------------

-- ----------------------------
-- Table structure for e_comment
-- ----------------------------
DROP TABLE IF EXISTS `e_comment`;
CREATE TABLE `e_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `text` varchar(50) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  `befrom` longtext,
  `user_Id` int(11) DEFAULT NULL,
  `vBlogId` int(11) DEFAULT NULL,
  `create_date` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK44356085A4393412` (`user_Id`),
  KEY `FK4435608579142502` (`vBlogId`) USING BTREE,
  CONSTRAINT `e_comment_ibfk_2` FOREIGN KEY (`vBlogId`) REFERENCES `e_vblog` (`id`),
  CONSTRAINT `e_comment_ibfk_1` FOREIGN KEY (`user_Id`) REFERENCES `e_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=192 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_comment
-- ----------------------------

-- ----------------------------
-- Table structure for e_information
-- ----------------------------
DROP TABLE IF EXISTS `e_information`;
CREATE TABLE `e_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `text` longtext,
  `create_date` varchar(14) DEFAULT NULL,
  `user_Id` int(11) DEFAULT NULL,
  `image` longtext,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK69F46452A4393412` (`user_Id`),
  CONSTRAINT `e_information_ibfk_1` FOREIGN KEY (`user_Id`) REFERENCES `e_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_information
-- ----------------------------

-- ----------------------------
-- Table structure for e_log
-- ----------------------------
DROP TABLE IF EXISTS `e_log`;
CREATE TABLE `e_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `uid` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `text` longtext,
  `create_date` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=405 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_log
-- ----------------------------

-- ----------------------------
-- Table structure for e_system_user
-- ----------------------------
DROP TABLE IF EXISTS `e_system_user`;
CREATE TABLE `e_system_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `last_login` varchar(14) DEFAULT NULL,
  `group_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_system_user
-- ----------------------------

-- ----------------------------
-- Table structure for e_upvote
-- ----------------------------
DROP TABLE IF EXISTS `e_upvote`;
CREATE TABLE `e_upvote` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `text` longtext,
  `ip` varchar(100) DEFAULT NULL,
  `befrom` varchar(100) DEFAULT NULL,
  `user_Id` int(11) DEFAULT NULL,
  `vBlog_Id` int(11) DEFAULT NULL,
  `createDate` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK44356085A4393412` (`user_Id`),
  KEY `FK4435608579142502` (`vBlog_Id`),
  CONSTRAINT `e_upvote_ibfk_1` FOREIGN KEY (`vBlog_Id`) REFERENCES `e_vblog` (`id`),
  CONSTRAINT `e_upvote_ibfk_2` FOREIGN KEY (`user_Id`) REFERENCES `e_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=192 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_upvote
-- ----------------------------

-- ----------------------------
-- Table structure for e_user
-- ----------------------------
DROP TABLE IF EXISTS `e_user`;
CREATE TABLE `e_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `text` varchar(50) DEFAULT NULL,
  `create_date` varchar(14) DEFAULT NULL,
  `modify_date` varchar(14) DEFAULT NULL,
  `last_login_date` varchar(14) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `login_count` int(11) DEFAULT NULL,
  `is_focus` int(2) DEFAULT NULL COMMENT '是否被关注',
  `befrom` varchar(255) DEFAULT NULL,
  `wechat_id` varchar(50) DEFAULT NULL,
  `group_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKB1CB1B65A4393412` (`is_focus`),
  KEY `group_id` (`group_id`),
  CONSTRAINT `e_user_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `user_group` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_user
-- ----------------------------
INSERT INTO `e_user` VALUES ('13', 'root', '123456', 'root', null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for e_user_cat_ref
-- ----------------------------
DROP TABLE IF EXISTS `e_user_cat_ref`;
CREATE TABLE `e_user_cat_ref` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `cat_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `cat_id` (`cat_id`),
  CONSTRAINT `e_user_cat_ref_ibfk_2` FOREIGN KEY (`cat_id`) REFERENCES `e_cat` (`id`),
  CONSTRAINT `e_user_cat_ref_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `e_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_user_cat_ref
-- ----------------------------

-- ----------------------------
-- Table structure for e_vblog
-- ----------------------------
DROP TABLE IF EXISTS `e_vblog`;
CREATE TABLE `e_vblog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `text` longtext,
  `create_date` varchar(14) DEFAULT NULL,
  `Category_Id` int(11) DEFAULT NULL,
  `user_Id` int(11) DEFAULT NULL,
  `hits` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `blog_type` varchar(2) DEFAULT NULL COMMENT '文章的模式:0为私有，1为公开，2为仅好友查看'',',
  PRIMARY KEY (`id`),
  KEY `user_Id` (`user_Id`),
  KEY `Category_Id` (`Category_Id`),
  CONSTRAINT `e_vblog_ibfk_1` FOREIGN KEY (`user_Id`) REFERENCES `e_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_vblog
-- ----------------------------

-- ----------------------------
-- Table structure for imageupload
-- ----------------------------
DROP TABLE IF EXISTS `imageupload`;
CREATE TABLE `imageupload` (
  `id` int(11) NOT NULL,
  `ImageUrl` varchar(500) DEFAULT NULL,
  `Ref_Id` int(11) DEFAULT NULL,
  `ImageIndex` int(11) DEFAULT NULL COMMENT '位置',
  `ImageDesc` varchar(255) DEFAULT NULL COMMENT '图片备注',
  `ImageSize` double(50,0) DEFAULT NULL COMMENT '图片大小',
  `CreateDate` varchar(8) DEFAULT NULL COMMENT '创建时间',
  `CreateTime` varchar(6) DEFAULT NULL,
  `typ` varchar(2) DEFAULT NULL COMMENT '01 猫 02 博客',
  PRIMARY KEY (`id`),
  KEY `Cat_Id` (`Ref_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of imageupload
-- ----------------------------

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `C_ID` varchar(32) NOT NULL COMMENT 'primary key',
  `C_MENUURL` varchar(400) DEFAULT NULL COMMENT 'menu URL',
  `C_PARENTID` varchar(64) DEFAULT NULL COMMENT 'parent ID',
  `I_ORDER` decimal(22,0) DEFAULT NULL COMMENT 'sequence number',
  `C_ICONURL` varchar(400) DEFAULT NULL COMMENT 'icon URL',
  `C_LEVEL` varchar(200) DEFAULT NULL COMMENT 'level mark',
  `C_ROOTURL` varchar(200) DEFAULT NULL COMMENT 'root URL',
  `C_NOTE` varchar(255) DEFAULT NULL COMMENT 'menu remark',
  `C_VISIBLE` char(1) DEFAULT 'Y' COMMENT 'menu display control,Y/N',
  `Group_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`C_ID`),
  KEY `IDX_MENUINFO_PARENTID` (`C_PARENTID`),
  KEY `Group_id` (`Group_id`),
  CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`Group_id`) REFERENCES `user_group` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='menu message';

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for secret_message
-- ----------------------------
DROP TABLE IF EXISTS `secret_message`;
CREATE TABLE `secret_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `send_id` int(11) DEFAULT NULL,
  `receive_id` int(11) DEFAULT NULL,
  `message_topic` varchar(60) DEFAULT NULL,
  `message_content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `send_id` (`send_id`),
  KEY `receive_id` (`receive_id`),
  CONSTRAINT `secret_message_ibfk_2` FOREIGN KEY (`receive_id`) REFERENCES `e_user` (`id`),
  CONSTRAINT `secret_message_ibfk_1` FOREIGN KEY (`send_id`) REFERENCES `e_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of secret_message
-- ----------------------------

-- ----------------------------
-- Table structure for system_message
-- ----------------------------
DROP TABLE IF EXISTS `system_message`;
CREATE TABLE `system_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `send_id` int(11) DEFAULT NULL,
  `group_id` int(11) DEFAULT NULL,
  `system_topic` varchar(60) DEFAULT NULL,
  `system_content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `group_id` (`group_id`),
  KEY `send_id` (`send_id`),
  CONSTRAINT `system_message_ibfk_2` FOREIGN KEY (`send_id`) REFERENCES `e_system_user` (`id`),
  CONSTRAINT `system_message_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `user_group` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of system_message
-- ----------------------------

-- ----------------------------
-- Table structure for user_attention
-- ----------------------------
DROP TABLE IF EXISTS `user_attention`;
CREATE TABLE `user_attention` (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `attention_id` int(11) NOT NULL COMMENT '关注ID',
  `attention_date` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `attention_id` (`attention_id`),
  CONSTRAINT `user_attention_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `e_user` (`id`),
  CONSTRAINT `user_attention_ibfk_2` FOREIGN KEY (`attention_id`) REFERENCES `e_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_attention
-- ----------------------------

-- ----------------------------
-- Table structure for user_group
-- ----------------------------
DROP TABLE IF EXISTS `user_group`;
CREATE TABLE `user_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID号',
  `group_id` int(11) NOT NULL COMMENT '用户组ID',
  `group_name` varchar(20) NOT NULL COMMENT '用户组名',
  `group_level` int(11) DEFAULT NULL,
  `parent_group_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `parent_group_id` (`parent_group_id`),
  CONSTRAINT `user_group_ibfk_1` FOREIGN KEY (`parent_group_id`) REFERENCES `user_group` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_group
-- ----------------------------
