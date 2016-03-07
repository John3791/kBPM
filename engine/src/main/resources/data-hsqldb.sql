SET SCHEMA engine;

INSERT INTO node_type VALUES(x'a110df72f49a4f559ce3d12c20a593c8', 'Engine');
INSERT INTO node_type VALUES(x'081ff7dc52fa49e688eb9fd93bdc476f', 'Agent');

INSERT INTO node VALUES(x'000eca18b8c140a895a9d9603ec929f1', x'a110df72f49a4f559ce3d12c20a593c8', 'localhost', 8080);
