CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(20) default NULL,
  `password` varchar(50) default NULL,
  `email` varchar(50) default NULL,
  `sex` int(1) default NULL,
  `create_time` datetime default NULL,
  `update_time` datetime default NULL,
  `create_user` varchar(20) default NULL,
  `update_user` varchar(20) default NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `UNIQUE_USER_USERNAME` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;