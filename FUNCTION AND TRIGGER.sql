drop function if exists nextIdDivision;
DELIMITER //
CREATE FUNCTION nextIdDivision() RETURNS varchar(20)
BEGIN
DECLARE idBegin varchar(20);
DECLARE nextId varchar(20);
DECLARE idCount INT;
SELECT count(id) INTO idCount FROM TB_M_DIVISION;
SET idCount = idCount + 1;
SELECT value INTO idBegin FROM TB_M_PARAMETER WHERE id = 'DIVISION_ID_BEGIN';
SET nextId = CONCAT(idBegin,idCount);
RETURN nextId;
END;//
DELIMITER ;

drop function if exists nextIdEmployee;
DELIMITER //
CREATE FUNCTION nextIdEmployee() RETURNS varchar(20)
BEGIN
DECLARE idBegin varchar(20);
DECLARE nextId varchar(20);
DECLARE idCount INT;
SELECT count(id) INTO idCount FROM TB_M_EMPLOYEE;
SET idCount = idCount + 1;
SELECT value INTO idBegin FROM TB_M_PARAMETER WHERE id = 'EMPLOYEE_ID_BEGIN';
SET nextId = CONCAT(idBegin,idCount);
RETURN nextId;
END;//
DELIMITER ;

drop function if exists nextIdJob;
DELIMITER //
CREATE FUNCTION nextIdJob() RETURNS varchar(20)
BEGIN
DECLARE idBegin varchar(20);
DECLARE nextId varchar(20);
DECLARE idCount INT;
SELECT count(id) INTO idCount FROM TB_M_JOB;
SET idCount = idCount + 1;
SELECT value INTO idBegin FROM TB_M_PARAMETER WHERE id = 'JOB_ID_BEGIN';
SET nextId = CONCAT(idBegin,idCount);
RETURN nextId;
END;//
DELIMITER ;

drop function if exists nextIdSite;
DELIMITER //
CREATE FUNCTION nextIdSite() RETURNS varchar(20)
BEGIN
DECLARE idBegin varchar(20);
DECLARE nextId varchar(20);
DECLARE idCount INT;
SELECT count(id) INTO idCount FROM TB_M_SITE;
SET idCount = idCount + 1;
SELECT value INTO idBegin FROM TB_M_PARAMETER WHERE id = 'SITE_ID_BEGIN';
SET nextId = CONCAT(idBegin,idCount);
RETURN nextId;
END;//
DELIMITER ;

drop function if exists nextIdStatus;
DELIMITER //
CREATE FUNCTION nextIdStatus() RETURNS varchar(20)
BEGIN
DECLARE idBegin varchar(20);
DECLARE nextId varchar(20);
DECLARE idCount INT;
SELECT count(id) INTO idCount FROM TB_M_STATUS;
SET idCount = idCount + 1;
SELECT value INTO idBegin FROM TB_M_PARAMETER WHERE id = 'STATUS_ID_BEGIN';
SET nextId = CONCAT(idBegin,idCount);
RETURN nextId;
END;//
DELIMITER ;

drop function if exists nextIdOvertime;
DELIMITER //
CREATE FUNCTION nextIdOvertime() RETURNS varchar(20)
BEGIN
DECLARE idBegin varchar(20);
DECLARE nextId varchar(20);
DECLARE idCount INT;
SELECT count(id) INTO idCount FROM TB_T_OVERTIME;
SET idCount = idCount + 1;
SELECT value INTO idBegin FROM TB_M_PARAMETER WHERE id = 'OVERTIME_ID_BEGIN';
SET nextId = CONCAT(idBegin,idCount);
RETURN nextId;
END;//
DELIMITER ;

drop function if exists nextIdRole;
DELIMITER //
CREATE FUNCTION nextIdRole() RETURNS varchar(20)
BEGIN
DECLARE idBegin varchar(20);
DECLARE nextId varchar(20);
DECLARE idCount INT;
SELECT count(id) INTO idCount FROM TB_T_ROLE;
SET idCount = idCount + 1;
SELECT value INTO idBegin FROM TB_M_PARAMETER WHERE id = 'ROLE_ID_BEGIN';
SET nextId = CONCAT(idBegin,idCount);
RETURN nextId;
END;//
DELIMITER ;

drop function if exists nextIdTask;
DELIMITER //
CREATE FUNCTION nextIdTask() RETURNS varchar(20)
BEGIN
DECLARE idBegin varchar(20);
DECLARE nextId varchar(20);
DECLARE idCount INT;
SELECT count(id) INTO idCount FROM TB_T_TASK;
SET idCount = idCount + 1;
SELECT value INTO idBegin FROM TB_M_PARAMETER WHERE id = 'TASK_ID_BEGIN';
SET nextId = CONCAT(idBegin,idCount);
RETURN nextId;
END;//
DELIMITER ;

drop function if exists nextIdTimeSheet;
DELIMITER //
CREATE FUNCTION nextIdTimeSheet() RETURNS varchar(20)
BEGIN
DECLARE idBegin varchar(20);
DECLARE nextId varchar(20);
DECLARE idCount INT;
SELECT count(id) INTO idCount FROM TB_T_TIME_SHEET;
SET idCount = idCount + 1;
SELECT value INTO idBegin FROM TB_M_PARAMETER WHERE id = 'TIME_SHEET_ID_BEGIN';
SET nextId = CONCAT(idBegin,idCount);
RETURN nextId;
END;//
DELIMITER ;

<====================================================================================>

DELIMITER //
DROP TRIGGER IF EXISTS setIdDivision//
CREATE TRIGGER setIdDivision BEFORE INSERT ON TB_M_DIVISION
FOR EACH ROW 
BEGIN
DECLARE getId varchar(20);
SELECT nextIdDivision() INTO getId;
SET NEW.id = getId;
END;
//
DELIMITER ;

DELIMITER //
DROP TRIGGER IF EXISTS setIdEmployee//
CREATE TRIGGER setIdEmployee BEFORE INSERT ON TB_M_EMPLOYEE
FOR EACH ROW 
BEGIN
DECLARE getId varchar(20);
SELECT nextIdEmployee() INTO getId;
SET NEW.id = getId;
END;
//
DELIMITER ;

DELIMITER //
DROP TRIGGER IF EXISTS setIdJob//
CREATE TRIGGER setIdJob BEFORE INSERT ON TB_M_JOB
FOR EACH ROW 
BEGIN
DECLARE getId varchar(20);
SELECT nextIdJob() INTO getId;
SET NEW.id = getId;
END;
//
DELIMITER ;

DELIMITER //
DROP TRIGGER IF EXISTS setIdSite//
CREATE TRIGGER setIdSite BEFORE INSERT ON TB_M_SITE
FOR EACH ROW 
BEGIN
DECLARE getId varchar(20);
SELECT nextIdSite() INTO getId;
SET NEW.id = getId;
END;
//
DELIMITER ;

DELIMITER //
DROP TRIGGER IF EXISTS setIdStatus//
CREATE TRIGGER setIdStatus BEFORE INSERT ON TB_M_STATUS
FOR EACH ROW 
BEGIN
DECLARE getId varchar(20);
SELECT nextIdStatus() INTO getId;
SET NEW.id = getId;
END;
//
DELIMITER ;

DELIMITER //
DROP TRIGGER IF EXISTS setIdOvertime//
CREATE TRIGGER setIdOvertime BEFORE INSERT ON TB_T_OVERTIME
FOR EACH ROW 
BEGIN
DECLARE getId varchar(20);
SELECT nextIdOvertime() INTO getId;
SET NEW.id = getId;
END;
//
DELIMITER ;

DELIMITER //
DROP TRIGGER IF EXISTS setIdRole//
CREATE TRIGGER setIdRole BEFORE INSERT ON TB_T_ROLE
FOR EACH ROW 
BEGIN
DECLARE getId varchar(20);
SELECT nextIdRole() INTO getId;
SET NEW.id = getId;
END;
//
DELIMITER ;

DELIMITER //
DROP TRIGGER IF EXISTS setIdTask//
CREATE TRIGGER setIdTask BEFORE INSERT ON TB_T_TASK
FOR EACH ROW 
BEGIN
DECLARE getId varchar(20);
SELECT nextIdTask() INTO getId;
SET NEW.id = getId;
END;
//
DELIMITER ;

DELIMITER //
DROP TRIGGER IF EXISTS setIdTimeSheet//
CREATE TRIGGER setIdTimeSheet BEFORE INSERT ON TB_T_TIME_SHEET
FOR EACH ROW 
BEGIN
DECLARE getId varchar(20);
SELECT nextIdTimeSheet() INTO getId;
SET NEW.id = getId;
END;
//
DELIMITER ;
