
CREATE SCHEMA engine AUTHORIZATION DBA;
SET SCHEMA engine;
CREATE TABLE node (
	node_id binary(16) NOT NULL,
	node_type_id binary(16) NOT NULL,
	host_name varchar(128),
	port_number int
);

CREATE TABLE node_type (
	node_type_id binary(16) NOT NULL,
	description varchar(128) NOT NULL
);
