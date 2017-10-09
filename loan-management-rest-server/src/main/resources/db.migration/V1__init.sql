CREATE TABLE `customer` (
  `id` binary(16) NOT NULL,
  `name` varchar(255) NOT NULL,
  `lim` decimal(19,2) NOT NULL,
  `risk_type` varchar(255) NOT NULL,
  `interest_rate` decimal(19,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
