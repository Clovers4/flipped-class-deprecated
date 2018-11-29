CREATE TABLE `admin` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`account` varchar(25) NOT NULL,
`password` varchar(50) NOT NULL,
PRIMARY KEY (`id`) ,
UNIQUE INDEX `unique_account` (`account` ASC) USING BTREE COMMENT 'account唯一标识' 
);
CREATE TABLE `user` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`account` varchar(25) NOT NULL,
`password` varchar(50) NOT NULL,
`role` tinyint(5) NOT NULL,
`email` varchar(50) NULL,
`activative` tinyint(1) NOT NULL,
PRIMARY KEY (`id`) ,
UNIQUE INDEX `unique_account` (`account` ASC) USING BTREE COMMENT 'account唯一标识' 
);
CREATE TABLE `course` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`teacher_id` int(11) NOT NULL,
`name` varchar(50) NOT NULL,
`intro` varchar(255) NULL,
`share_team_master_course_id` tinyint(5) NOT NULL,
`share_seminar_master_course_id` tinyint(5) NOT NULL,
`presentation_weight` decimal(3,2) NOT NULL,
`report_weight` decimal(3,2) NOT NULL,
`quetion_weight` decimal(3,2) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `seminar` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`topic` varchar(255) NOT NULL,
`intro` varchar(255) NULL,
`state` tinyint(5) NOT NULL COMMENT '状态：不可见、已开放未进行、正在进行、已结束',
`sign_up_start_time` datetime(6) NOT NULL,
`sign_up_end_time` datetime(6) NOT NULL,
`presentation_order_mode` tinyint(5) NOT NULL,
`team_num_limit` int(10) NOT NULL,
`report_end_time` datetime(6) NOT NULL ON UPDATE CURRENT_TIMESTAMP(6),
PRIMARY KEY (`id`) 
);
CREATE TABLE `course_seminar` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`course_id` int(10) NOT NULL,
`seminar_id` int(10) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `team_rule` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`course_id` int(10) NOT NULL,
`strategy` tinyint(5) NOT NULL,
`max_member_num` int(10) NOT NULL,
`min_member_num` int(10) NOT NULL,
`end_time` datetime(6) NOT NULL ON UPDATE CURRENT_TIMESTAMP(6),
PRIMARY KEY (`id`) 
);
CREATE TABLE `share_application` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`master_course_id` int(10) NOT NULL,
`slave_course_id` int(10) NOT NULL,
`function` tinyint(3) NOT NULL COMMENT '表明是共享课程还是共享分组',
`state` tinyint(3) NOT NULL COMMENT '表明是否已经处理该请求',
`create_time` datetime(6) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `klass` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`course_id` int(10) NOT NULL,
`name` varchar(50) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `klass_student` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`klass_id` int(10) NOT NULL,
`student_id` int(10) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `round` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`course_id` int(10) NOT NULL,
`max_sigh_up_num` int(10) NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `round_seminar` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`round_id` int(10) NOT NULL,
`seminar_id` int(10) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `presentation` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`course_id` int(11) NULL,
`seminar_id` int(11) NULL,
`team_id` int(10) NOT NULL,
`order` int(5) NULL,
`score` decimal(3,2) NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `team` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`leader_id` int(10) NOT NULL,
`name` varchar(50) NOT NULL,
`valid` tinyint(5) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `team_student` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`team_id` int(10) NOT NULL,
`student_id` int(10) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `question` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`presentation_id` int(10) NOT NULL,
`team_id` int(10) NOT NULL,
`student_id` int(10) NOT NULL,
`score` decimal(3,2) NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `klass_team` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`klass_id` int(10) NOT NULL,
`team_id` int(11) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `course_share` (
);
CREATE TABLE `report` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`presentation_id` int(11) NOT NULL,
`filename` varchar(50) NULL,
`url` varchar(255) NULL,
`score` decimal(10,0) NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `material` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`presentation_id` int(11) NOT NULL,
`filename` varchar(50) NULL,
`url` varchar(255) NULL,
PRIMARY KEY (`id`) 
);
