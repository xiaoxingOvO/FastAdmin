/*
 Navicat Premium Data Transfer

 Source Server         : mysql8.0
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:3306
 Source Schema         : fastadmin

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 20/04/2023 16:32:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户账号',
  `nick_name` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户昵称',
  `user_type` varchar(2) COLLATE utf8mb4_unicode_ci DEFAULT '00' COMMENT '用户类型（00系统用户）',
  `email` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '用户邮箱',
  `phonenumber` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '手机号码',
  `sex` char(1) COLLATE utf8mb4_unicode_ci DEFAULT '0' COMMENT '用户性别（0男 1女 2未知）',
  `password` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '密码',
  `status` char(1) COLLATE utf8mb4_unicode_ci DEFAULT '0' COMMENT '帐号状态（0正常 1停用）',
  `del_flag` char(1) COLLATE utf8mb4_unicode_ci DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `login_date` datetime DEFAULT NULL COMMENT '最后登录时间',
  `create_by` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户信息表';

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (1, '小白', '白白', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 01:35:35', '', NULL, NULL);
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (2, '小黑', '黑黑', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 02:35:35', '', NULL, NULL);
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (3, '小红', '红红', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 03:35:35', '', NULL, NULL);
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (4, '小橙', '橙橙', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 04:35:35', '', NULL, NULL);
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (5, '小绿', '绿绿', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 05:35:35', '', NULL, NULL);
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (6, '小蓝', '蓝蓝', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 06:35:35', '', NULL, NULL);
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (7, '小靛', '靛靛', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 07:35:35', '', NULL, NULL);
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (8, '小紫', '紫紫', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 08:35:35', '', NULL, NULL);
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (9, '小黄', '黄黄', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 09:35:35', '', NULL, NULL);
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (10, '小灰', '灰灰', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 10:35:35', '', NULL, NULL);
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (11, '小粉', '粉粉', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 11:35:35', '', NULL, NULL);
INSERT INTO `user` (`user_id`, `user_name`, `nick_name`, `user_type`, `email`, `phonenumber`, `sex`, `password`, `status`, `del_flag`, `login_date`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (12, '小明', '明明', '00', '', '11111111111', '0', '123456', '0', '0', '2023-03-24 15:35:25', '', '2023-03-23 12:35:35', '', NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
