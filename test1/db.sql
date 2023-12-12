SELECT COUNT(*) from crime_data;

UPDATE crime_data
SET City = UPPER(City);

DELETE FROM crime_data
WHERE YEAR(Start_Date_Time) < 2020;

UPDATE crime_data
SET Dispatch_Time = Start_Date_Time
WHERE Dispatch_Time IS NULL;

DELETE FROM crime_data
WHERE Incident_ID IS NULL OR Offence_Code IS NULL OR Dispatch_Time IS NULL OR Victims IS NULL OR Crime_Name1 IS NULL OR Crime_Name2 IS NULL OR Crime_Name3 IS NULL OR City IS NULL OR Start_Date_Time IS NULL;


DELETE t1 FROM crime_data t1
INNER JOIN (
    SELECT incident_id, MAX(start_date_time) AS MaxDate, MAX(offence_code) AS MaxOffenceCode
    FROM crime_data
    GROUP BY incident_id
    HAVING COUNT(*) > 1
) t2 ON t1.incident_id = t2.incident_id AND t1.start_date_time <= t2.MaxDate AND t1.offence_code < t2.MaxOffenceCode;

DROP TABLE crimes

CREATE TABLE crimes (
    incident_id INT PRIMARY KEY,
    offence_code int(11) NOT NULL,
    dispatch_time datetime NOT NULL,
    victims int(11) NOT NULL,
    city varchar(255) NOT NULL,
    start_date_time datetime NOT NULL
);

DROP TABLE offences


SELECT * FROM offences

CREATE TABLE offences (
		id INT PRIMARY KEY AUTO_INCREMENT,
    offence_code int(11) NOT NULL,
    crime_name1 VARCHAR(255) NOT NULL,
    crime_name2 VARCHAR(255) NOT NULL,
    crime_name3 VARCHAR(255) NOT NULL
);

INSERT INTO crimes (incident_id,offence_code,dispatch_time,victims,city,start_date_time)
SELECT incident_id,offence_code,dispatch_time,victims,city,start_date_time
FROM crime_data;

INSERT INTO offences (offence_code, crime_name1, crime_name2, crime_name3)
SELECT offence_code, crime_name1, crime_name2, crime_name3
FROM crime_data;









