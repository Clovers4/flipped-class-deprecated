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
`activative` tinyint(5) NOT NULL,
PRIMARY KEY (`id`) ,
UNIQUE INDEX `unique_account` (`account` ASC) USING BTREE COMMENT 'account唯一标识' 
);
CREATE TABLE `course` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`name` varchar(50) NOT NULL,
`intro` varchar(255) NULL,
`need_team` tinyint(5) NOT NULL,
`share_team` tinyint(5) NOT NULL,
`share_seminar` tinyint(5) NOT NULL,
`present_weight` decimal(10,2) NOT NULL,
`quetion_weight` decimal(10,2) NOT NULL,
`report_weight` decimal(10,2) NOT NULL,
`team_rule_id` int(10) UNSIGNED NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `seminar` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`topic` varchar(255) NOT NULL,
`intro` varchar(255) NULL,
`visible` tinyint(5) NOT NULL,
`state` tinyint(5) NOT NULL,
`presentation_order_mode` tinyint(5) NOT NULL,
`team_num_limit` int(10) NOT NULL,
`report_ddl` datetime(6) NOT NULL ON UPDATE CURRENT_TIMESTAMP(6),
`sign_up_start_time` datetime(6) NOT NULL ON UPDATE CURRENT_TIMESTAMP(6),
`sign_up_end_time` datetime(6) NOT NULL ON UPDATE CURRENT_TIMESTAMP(6),
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
`max_member_num` int(10) NOT NULL,
`min_member_num` int(10) NOT NULL,
`end_time` datetime(6) NOT NULL ON UPDATE CURRENT_TIMESTAMP(6),
PRIMARY KEY (`id`) 
);
CREATE TABLE `share_application` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`master_course_id` int(10) NOT NULL,
`slave_course_id` int(10) NOT NULL,
`type` tinyint(5) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `klass` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`name` varchar(50) NOT NULL,
`course_id` int(10) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `student_klass` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`user_id` int(10) NOT NULL,
`klass_id` int(10) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `round` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`sigh_up_number` int(10) NULL,
`course_id` int(10) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `round_seminar` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`round_id` int(10) NOT NULL,
`seminar_id` int(10) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `presentation` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`team_id` int(10) NOT NULL,
`score` decimal(10,0) NULL,
`report_score` decimal(10,0) NULL,
`seating_order` tinyint(5) NULL,
`seminard` tinyint(5) NULL,
`time` datetime(6) NULL ON UPDATE CURRENT_TIMESTAMP(6),
`material_filename` varchar(50) NULL,
`material_url` varchar(255) NULL,
`report_filename` varchar(50) NULL,
`report_url` varchar(255) NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `team` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`name` varchar(50) NOT NULL,
`leader_id` int(10) NOT NULL,
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
`score` decimal(10,0) NULL,
`student_id` int(10) NOT NULL,
`team_id` int(10) NOT NULL,
`presentation_id` int(10) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `klass_team` (
`id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`course_id` int(10) NOT NULL,
`team_id` int(11) NOT NULL,
PRIMARY KEY (`id`) 
);
