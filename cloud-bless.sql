/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : cloud-bless

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 13/12/2019 00:05:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_music
-- ----------------------------
DROP TABLE IF EXISTS `tb_music`;
CREATE TABLE `tb_music` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `msg` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_music
-- ----------------------------
BEGIN;
INSERT INTO `tb_music` VALUES (1, '海伦-桥边姑娘', '桥边姑娘', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg');
INSERT INTO `tb_music` VALUES (2, '阿冗-你的答案', '你的答案', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg');
INSERT INTO `tb_music` VALUES (3, '白羊', '白羊', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg');
COMMIT;

-- ----------------------------
-- Table structure for tb_person
-- ----------------------------
DROP TABLE IF EXISTS `tb_person`;
CREATE TABLE `tb_person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mail` varchar(255) DEFAULT NULL,
  `msg` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_person
-- ----------------------------
BEGIN;
INSERT INTO `tb_person` VALUES (1, '429829320@qq.com', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', 'spring', '123');
INSERT INTO `tb_person` VALUES (10, '347685543@qq.com', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', 'xiaoxiang', '123456');
INSERT INTO `tb_person` VALUES (11, '347685543@qq.com', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', 'xiaoxiang', '123456');
INSERT INTO `tb_person` VALUES (12, '347685543@qq.com', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', 'xi', '123456');
INSERT INTO `tb_person` VALUES (13, '347685543@qq.com', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', '小明', '123456');
INSERT INTO `tb_person` VALUES (14, '347685543@qq.com', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', '彭于晏', '123456');
COMMIT;

-- ----------------------------
-- Table structure for tb_video
-- ----------------------------
DROP TABLE IF EXISTS `tb_video`;
CREATE TABLE `tb_video` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `msg` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_video
-- ----------------------------
BEGIN;
INSERT INTO `tb_video` VALUES (1, '咏春-叶问1，甄子丹', '咏春叶问1', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg');
INSERT INTO `tb_video` VALUES (2, '咏春-叶问4', '咏春-叶问4', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg');
INSERT INTO `tb_video` VALUES (3, '天线宝宝动画片', '天线宝宝', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg', 'http://47.103.144.95:89/storage/2019-11-09/0l6wrjl9pezgfwrtvz8h.jpg');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
