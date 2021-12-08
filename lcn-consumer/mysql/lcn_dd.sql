/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : z-dingdan-server

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 08/12/2021 19:44:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for lcn_dd
-- ----------------------------
DROP TABLE IF EXISTS `lcn_dd`;
CREATE TABLE `lcn_dd`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kucun_id` int(11) NULL DEFAULT NULL,
  `count` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
