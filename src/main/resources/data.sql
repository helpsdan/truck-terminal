DROP TABLE IF EXISTS LOCALE;
DROP TABLE IF EXISTS DRIVER;

CREATE TABLE DRIVER (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(100) NOT NULL,
    AGE INT NOT NULL,
    GENDER INT NOT NULL,
    HAS_OWN_TRUCK BOOLEAN NOT NULL,
    LICENSE_TYPE INT NOT NULL,
    IS_LOADED BOOLEAN NOT NULL,
    CREATION_DATE TIMESTAMP NOT NULL,
    LAST_UPDATE_DATE TIMESTAMP NOT NULL,
    TRUCK_TYPE INT NOT NULL
);

CREATE TABLE LOCALE (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    DRIVER_ID INT NOT NULL,
    LOCALE_TYPE INT NOT NULL,
    LATITUDE INT NOT NULL,
    LONGITUDE INT NOT NULL
);

ALTER TABLE LOCALE
ADD FOREIGN KEY (DRIVER_ID) REFERENCES DRIVER(ID);

INSERT INTO DRIVER (NAME, AGE, GENDER, HAS_OWN_TRUCK, LICENSE_TYPE, IS_LOADED, CREATION_DATE, LAST_UPDATE_DATE, TRUCK_TYPE) VALUES
('João Pedro', 35, 0, true, 0, false, parsedatetime('03-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('03-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Batista', 34, 0, true, 1, true, parsedatetime('03-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('03-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Giovana', 67, 1, true, 2, true, parsedatetime('03-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('03-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Beatriz', 56, 1, false, 3, true, parsedatetime('03-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('03-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Leonardo', 62, 0, false, 4, false, parsedatetime('03-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('03-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Juliano', 52, 0, true, 0, false, parsedatetime('10-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('10-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Thiago', 62, 0, true, 1, false, parsedatetime('10-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('10-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Bernardo', 62, 0, false, 2, false, parsedatetime('10-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('10-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Andressa', 72, 1, true, 3, true, parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Mariano', 67, 0, false, 4, true, parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Pedro', 45, 0, true, 0, true, parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Carlos', 56, 0, true, 1, false, parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Regina', 45, 1, true, 2, false, parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Regiane', 34, 1, false, 3, true, parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('20-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Reginaldo', 53, 0, false, 4, false, parsedatetime('22-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('22-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Marcos', 53, 0, true, 0, false, parsedatetime('22-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('22-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Bruno', 53, 0, false, 1, true, parsedatetime('22-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('22-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Armando', 32, 0, true, 2, true, parsedatetime('22-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('22-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Camila', 52, 1, true, 3, true, parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Cecília', 52, 1, false, 4, false, parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Juliana', 35, 1, false, 0, false, parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Mariana', 45, 1, false, 1, true, parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Letícia', 72, 1, false, 2, true, parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Larissa', 27, 1, true, 3, true, parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Rogério', 47, 0, false, 4, false, parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Jackson', 37, 0, true, 0, false, parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Albérico', 22, 0, false, 1, true, parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('24-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Matheus', 31, 0, true, 2, true, parsedatetime('21-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('21-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Lucas', 34, 0, false, 3, true, parsedatetime('25-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('25-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Leonardo', 84, 0, true, 4, false, parsedatetime('25-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('25-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Barnis', 43, 0, true, 0, true, parsedatetime('25-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('25-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Julio', 34, 0, false, 1, true, parsedatetime('25-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('25-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Victor', 43, 0, true, 2, true, parsedatetime('26-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('26-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Matilda', 54, 1, true, 3, false, parsedatetime('26-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('26-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Bruna', 54, 1, false, 4, false, parsedatetime('26-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('26-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Helena', 67, 1, false, 0, true, parsedatetime('27-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('27-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Marcos', 34, 0, true, 1, false, parsedatetime('27-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('27-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Mariana', 54, 1, false, 2, true, parsedatetime('27-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('27-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Eduardo', 45, 0, false, 3, true, parsedatetime('28-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('28-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2),
('Pedro', 44, 0, false, 4, false, parsedatetime('28-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('28-03-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 2);

INSERT INTO LOCALE (DRIVER_ID,LOCALE_TYPE, LATITUDE, LONGITUDE) VALUES
(1, 0, 12234323, 12343241), (1, 1, 12234323, 12343241), (2, 0, 12234323, 12343241), (2, 1, 12234323, 12343241),
(3, 0, 12234323, 12343241), (3, 1, 12234323, 12343241), (4, 0, 12234323, 12343241), (4, 1, 12234323, 12343241),
(5, 0, 12234323, 12343241), (5, 1, 12234323, 12343241), (6, 0, 12234323, 12343241), (6, 1, 12234323, 12343241),
(7, 0, 12234323, 12343241), (7, 1, 12234323, 12343241), (8, 0, 12234323, 12343241), (8, 1, 12234323, 12343241),
(9, 0, 12234323, 12343241), (9, 1, 12234323, 12343241), (10, 0, 12234323, 12343241), (10, 1, 12234323, 12343241),
(11, 0, 12234323, 12343241), (11, 1, 12234323, 12343241), (12, 0, 12234323, 12343241), (12, 1, 12234323, 12343241),
(13, 0, 12234323, 12343241), (13, 1, 12234323, 12343241), (14, 0, 12234323, 12343241), (14, 1, 12234323, 12343241),
(15, 0, 12234323, 12343241), (15, 1, 12234323, 12343241), (16, 0, 12234323, 12343241), (16, 1, 12234323, 12343241),
(17, 0, 12234323, 12343241), (17, 1, 12234323, 12343241), (18, 0, 12234323, 12343241), (18, 1, 12234323, 12343241),
(19, 0, 12234323, 12343241), (19, 1, 12234323, 12343241), (20, 0, 12234323, 12343241), (20, 1, 12234323, 12343241),
(21, 0, 12234323, 12343241), (21, 1, 12234323, 12343241), (22, 0, 12234323, 12343241), (22, 1, 12234323, 12343241),
(23, 0, 12234323, 12343241), (23, 1, 12234323, 12343241), (24, 0, 12234323, 12343241), (24, 1, 12234323, 12343241),
(25, 0, 12234323, 12343241), (25, 1, 12234323, 12343241), (26, 0, 12234323, 12343241), (26, 1, 12234323, 12343241),
(27, 0, 12234323, 12343241), (27, 1, 12234323, 12343241), (28, 0, 12234323, 12343241), (28, 1, 12234323, 12343241),
(29, 0, 12234323, 12343241), (29, 1, 12234323, 12343241), (30, 0, 12234323, 12343241), (30, 1, 12234323, 12343241),
(31, 0, 12234323, 12343241), (31, 1, 12234323, 12343241), (32, 0, 12234323, 12343241), (32, 1, 12234323, 12343241),
(33, 0, 12234323, 12343241), (33, 1, 12234323, 12343241), (34, 0, 12234323, 12343241), (34, 1, 12234323, 12343241),
(35, 0, 12234323, 12343241), (35, 1, 12234323, 12343241), (36, 0, 12234323, 12343241), (36, 1, 12234323, 12343241),
(37, 0, 12234323, 12343241), (37, 1, 12234323, 12343241), (38, 0, 12234323, 12343241), (38, 1, 12234323, 12343241),
(39, 0, 12234323, 12343241), (39, 1, 12234323, 12343241), (40, 0, 12234323, 12343241), (40, 1, 12234323, 12343241);
