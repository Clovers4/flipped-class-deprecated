/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : flipped_class

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 02/12/2018 17:17:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `account` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `unique_account`(`account`) USING BTREE COMMENT 'account唯一标识'
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `teacher_id` int(11) NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `intro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `share_team_master_course_id` int(11) NOT NULL,
  `share_seminar_master_course_id` int(11) NOT NULL,
  `presentation_weight` decimal(3, 2) NOT NULL,
  `report_weight` decimal(3, 2) NOT NULL,
  `quetion_weight` decimal(3, 2) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, 1, '测试课程_1', NULL, 0, 0, 0.00, 0.00, 0.00);
INSERT INTO `course` VALUES (2, 1, '测试课程_2', NULL, 0, 0, 0.00, 0.00, 0.00);
INSERT INTO `course` VALUES (3, 1, '测试课程_3', NULL, 0, 0, 0.00, 0.00, 0.00);
INSERT INTO `course` VALUES (4, 1, '测试课程_5', NULL, 0, 0, 0.00, 0.00, 0.00);
INSERT INTO `course` VALUES (5, 1, '测试课程_1', NULL, 0, 0, 0.00, 0.00, 0.00);
INSERT INTO `course` VALUES (6, 1, '测试课程_3', NULL, 0, 0, 0.00, 0.00, 0.00);

-- ----------------------------
-- Table structure for course_seminar
-- ----------------------------
DROP TABLE IF EXISTS `course_seminar`;
CREATE TABLE `course_seminar`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `course_id` int(10) NOT NULL,
  `seminar_id` int(10) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for klass
-- ----------------------------
DROP TABLE IF EXISTS `klass`;
CREATE TABLE `klass`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `course_id` int(10) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `location` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of klass
-- ----------------------------
INSERT INTO `klass` VALUES (1, 1, '课程1', '周三', '海韵1');
INSERT INTO `klass` VALUES (2, 1, '课程2', '周四', '海韵2');
INSERT INTO `klass` VALUES (3, 3, '课程3', '周五', '海韵3');

-- ----------------------------
-- Table structure for klass_student
-- ----------------------------
DROP TABLE IF EXISTS `klass_student`;
CREATE TABLE `klass_student`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `klass_id` int(10) NOT NULL,
  `student_id` int(10) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of klass_student
-- ----------------------------
INSERT INTO `klass_student` VALUES (1, 1, 1);
INSERT INTO `klass_student` VALUES (2, 3, 1);

-- ----------------------------
-- Table structure for klass_team
-- ----------------------------
DROP TABLE IF EXISTS `klass_team`;
CREATE TABLE `klass_team`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `klass_id` int(10) NOT NULL,
  `team_id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for material
-- ----------------------------
DROP TABLE IF EXISTS `material`;
CREATE TABLE `material`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `presentation_id` int(11) NOT NULL,
  `filename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for presentation
-- ----------------------------
DROP TABLE IF EXISTS `presentation`;
CREATE TABLE `presentation`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `course_id` int(11) NULL DEFAULT NULL,
  `seminar_id` int(11) NULL DEFAULT NULL,
  `team_id` int(10) NOT NULL,
  `order` int(5) NULL DEFAULT NULL,
  `score` decimal(3, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `presentation_id` int(10) NOT NULL,
  `team_id` int(10) NOT NULL,
  `student_id` int(10) NOT NULL,
  `score` decimal(3, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `presentation_id` int(11) NOT NULL,
  `filename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `score` decimal(10, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for round
-- ----------------------------
DROP TABLE IF EXISTS `round`;
CREATE TABLE `round`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `course_id` int(10) NOT NULL,
  `max_sigh_up_num` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for round_seminar
-- ----------------------------
DROP TABLE IF EXISTS `round_seminar`;
CREATE TABLE `round_seminar`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `round_id` int(10) NOT NULL,
  `seminar_id` int(10) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for seminar
-- ----------------------------
DROP TABLE IF EXISTS `seminar`;
CREATE TABLE `seminar`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `topic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `intro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `state` int(5) NOT NULL COMMENT '状态：不可见、已开放未进行、正在进行、已结束',
  `sign_up_start_time` datetime(6) NOT NULL,
  `sign_up_end_time` datetime(6) NOT NULL,
  `presentation_order_mode` int(5) NOT NULL,
  `team_num_limit` int(10) NOT NULL,
  `report_end_time` datetime(6) NOT NULL ON UPDATE CURRENT_TIMESTAMP(6),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for share_application
-- ----------------------------
DROP TABLE IF EXISTS `share_application`;
CREATE TABLE `share_application`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `master_course_id` int(10) NOT NULL,
  `slave_course_id` int(10) NOT NULL,
  `function` int(3) NOT NULL COMMENT '表明是共享课程还是共享分组',
  `state` int(3) NOT NULL COMMENT '表明是否已经处理该请求',
  `create_time` datetime(6) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `account` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `activative` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `unique_account`(`account`) USING BTREE COMMENT 'account唯一标识'
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 'student_1', '123456', '测试学生', 'sad@qq.com', 0);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `account` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `activative` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `unique_account`(`account`) USING BTREE COMMENT 'account唯一标识'
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, 'teacher_1', '123456', '测试老师', NULL, 0);

-- ----------------------------
-- Table structure for team
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `leader_id` int(10) NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `valid` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for team_rule
-- ----------------------------
DROP TABLE IF EXISTS `team_rule`;
CREATE TABLE `team_rule`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `course_id` int(10) NOT NULL,
  `strategy` int(5) NOT NULL,
  `max_member_num` int(10) NOT NULL,
  `min_member_num` int(10) NOT NULL,
  `end_time` datetime(6) NOT NULL ON UPDATE CURRENT_TIMESTAMP(6),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for team_student
-- ----------------------------
DROP TABLE IF EXISTS `team_student`;
CREATE TABLE `team_student`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `team_id` int(10) NOT NULL,
  `student_id` int(10) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
