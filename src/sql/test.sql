/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50710
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50710
 File Encoding         : 65001

 Date: 16/12/2020 22:58:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for country_weather
-- ----------------------------
DROP TABLE IF EXISTS `country_weather`;
CREATE TABLE `country_weather` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `month` int(11) DEFAULT NULL,
  `data` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of country_weather
-- ----------------------------
BEGIN;
INSERT INTO `country_weather` VALUES (1, 'Tokyo', 1, 7);
INSERT INTO `country_weather` VALUES (2, 'New York', 1, -0.2);
INSERT INTO `country_weather` VALUES (3, 'Berlin', 1, -0.9);
INSERT INTO `country_weather` VALUES (4, 'London', 1, 3.9);
INSERT INTO `country_weather` VALUES (5, 'Tokyo', 2, 6.9);
INSERT INTO `country_weather` VALUES (6, 'New York', 2, 0.8);
INSERT INTO `country_weather` VALUES (7, 'Berlin', 2, 0.6);
INSERT INTO `country_weather` VALUES (8, 'London', 2, 4.2);
INSERT INTO `country_weather` VALUES (9, 'Tokyo', 3, 9.5);
INSERT INTO `country_weather` VALUES (10, 'New York', 3, 5.7);
INSERT INTO `country_weather` VALUES (11, 'Berlin', 3, 3.5);
INSERT INTO `country_weather` VALUES (12, 'London', 3, 5.7);
INSERT INTO `country_weather` VALUES (13, 'Tokyo', 4, 14.5);
INSERT INTO `country_weather` VALUES (14, 'New York', 4, 11.3);
INSERT INTO `country_weather` VALUES (15, 'Berlin', 4, 8.4);
INSERT INTO `country_weather` VALUES (16, 'London', 4, 8.5);
INSERT INTO `country_weather` VALUES (17, 'Tokyo', 5, 18.2);
INSERT INTO `country_weather` VALUES (18, 'New York', 5, 17);
INSERT INTO `country_weather` VALUES (19, 'Berlin', 5, 13.5);
INSERT INTO `country_weather` VALUES (20, 'London', 5, 11.9);
INSERT INTO `country_weather` VALUES (21, 'Tokyo', 6, 21.5);
INSERT INTO `country_weather` VALUES (22, 'New York', 6, 22);
INSERT INTO `country_weather` VALUES (23, 'Berlin', 6, 17);
INSERT INTO `country_weather` VALUES (24, 'London', 6, 15.2);
INSERT INTO `country_weather` VALUES (25, 'Tokyo', 7, 25.2);
INSERT INTO `country_weather` VALUES (26, 'New York', 7, 24.8);
INSERT INTO `country_weather` VALUES (27, 'Berlin', 7, 18.6);
INSERT INTO `country_weather` VALUES (28, 'London', 7, 17);
INSERT INTO `country_weather` VALUES (29, 'Tokyo', 8, 26.5);
INSERT INTO `country_weather` VALUES (30, 'New York', 8, 24.1);
INSERT INTO `country_weather` VALUES (31, 'Berlin', 8, 17.9);
INSERT INTO `country_weather` VALUES (32, 'London', 8, 16.6);
INSERT INTO `country_weather` VALUES (33, 'Tokyo', 9, 23.3);
INSERT INTO `country_weather` VALUES (34, 'New York', 9, 20.1);
INSERT INTO `country_weather` VALUES (35, 'Berlin', 9, 14.3);
INSERT INTO `country_weather` VALUES (36, 'London', 9, 14.2);
INSERT INTO `country_weather` VALUES (37, 'Tokyo', 10, 18.3);
INSERT INTO `country_weather` VALUES (38, 'New York', 10, 14.1);
INSERT INTO `country_weather` VALUES (39, 'Berlin', 10, 9);
INSERT INTO `country_weather` VALUES (40, 'London', 10, 10.3);
INSERT INTO `country_weather` VALUES (41, 'Tokyo', 11, 13.9);
INSERT INTO `country_weather` VALUES (42, 'New York', 11, 8.6);
INSERT INTO `country_weather` VALUES (43, 'Berlin', 11, 3.9);
INSERT INTO `country_weather` VALUES (44, 'London', 11, 6.6);
INSERT INTO `country_weather` VALUES (45, 'Tokyo', 12, 9.6);
INSERT INTO `country_weather` VALUES (46, 'New York', 12, 2.5);
INSERT INTO `country_weather` VALUES (47, 'Berlin', 12, 1);
INSERT INTO `country_weather` VALUES (48, 'London', 12, 4.8);
COMMIT;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `gender` char(1) DEFAULT '男',
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
BEGIN;
INSERT INTO `employee` VALUES (1, '孙悟空', '男', 8000);
INSERT INTO `employee` VALUES (2, '邹丽丽', '女', 12000);
INSERT INTO `employee` VALUES (3, '刘小轩', '男', 9000);
INSERT INTO `employee` VALUES (4, '猪九戒', '男', 3000);
INSERT INTO `employee` VALUES (5, '嫦娥', '女', 650);
COMMIT;

-- ----------------------------
-- Table structure for explorer
-- ----------------------------
DROP TABLE IF EXISTS `explorer`;
CREATE TABLE `explorer` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `percent` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of explorer
-- ----------------------------
BEGIN;
INSERT INTO `explorer` VALUES (1, 'Chrome', 61.41);
INSERT INTO `explorer` VALUES (2, 'Internet Explorer', 11.84);
INSERT INTO `explorer` VALUES (3, 'Firefox', 10.85);
INSERT INTO `explorer` VALUES (4, 'Edge', 4.67);
INSERT INTO `explorer` VALUES (5, 'Safari', 4.18);
INSERT INTO `explorer` VALUES (6, 'Sogou Explorer', 1.64);
INSERT INTO `explorer` VALUES (7, 'Opera', 1.6);
INSERT INTO `explorer` VALUES (8, 'QQ', 1.2);
INSERT INTO `explorer` VALUES (9, 'Other', 2.61);
COMMIT;

-- ----------------------------
-- Table structure for sale
-- ----------------------------
DROP TABLE IF EXISTS `sale`;
CREATE TABLE `sale` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sale
-- ----------------------------
BEGIN;
INSERT INTO `sale` VALUES (1, '牛栏（0~6个月）900g', 2.5);
INSERT INTO `sale` VALUES (2, '爱他美（0~6个月）900g', 1.8);
INSERT INTO `sale` VALUES (3, '爱他美（1~2岁）800g', 0.9);
INSERT INTO `sale` VALUES (4, '爱他美（1~2）岁900g', 0.85);
INSERT INTO `sale` VALUES (5, '爱他美（0~6个月）800g', 0.85);
INSERT INTO `sale` VALUES (6, '爱他美（6~12个月）800g', 0.5);
INSERT INTO `sale` VALUES (7, '爱他美（2~3岁）800g', 0.5);
INSERT INTO `sale` VALUES (8, '牛栏（2~3岁）800g', 0.3);
INSERT INTO `sale` VALUES (9, '爱他美（6~12个月）900g', 0.19);
INSERT INTO `sale` VALUES (10, '牛栏（1~2岁）900g', 0.17);
INSERT INTO `sale` VALUES (11, 'hippo喜宝600g', 0.18);
INSERT INTO `sale` VALUES (12, '牛栏（6~12个月）900g', 0.1);
INSERT INTO `sale` VALUES (13, 'nannycare二段900g', 0.08);
INSERT INTO `sale` VALUES (14, 'nannycare三段900g', 0.07);
INSERT INTO `sale` VALUES (15, '雅培3段850g', 0.06);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
