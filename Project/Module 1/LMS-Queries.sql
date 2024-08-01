CREATE TABLE Role (
    RoleID INT PRIMARY KEY IDENTITY(1,1),
    RoleName VARCHAR(50) NOT NULL UNIQUE
);


INSERT INTO Role (RoleName) VALUES ('Admin'), ('User');

INSERT INTO Users (Username, PasswordHash, FullName, Email, RoleID) VALUES 
('dhanapal', 0x1234567890ABCDEF, 'Dhanapal', 'dhanapal.m@payoda.com', 1), 
('siddarth', 0x1234567890ABCDEF, 'Siddarth', 'siddarth.s@payoda.com', 2), 
('prathik', 0x1234567890ABCDEF, 'Prathik', 'prathik.b@payoda.com', 2);

CREATE TABLE Course (
    CourseID INT PRIMARY KEY IDENTITY(1,1),
    CourseName VARCHAR(100) NOT NULL UNIQUE,
    Description TEXT,
    StartDate DATE NOT NULL,
    EndDate DATE NOT NULL
);

INSERT INTO Course (CourseName, Description, StartDate, EndDate) VALUES 
('Python Basics', 'Introduction to Python programming.', '2024-09-01', '2024-12-01'),
('JavaScript Essentials', 'Learn core JavaScript concepts.', '2024-10-01', '2024-12-15'),
('Java Fundamentals', 'Basics of Java programming.', '2024-08-15', '2024-11-30'),
('Ruby on Rails', 'Introduction to web development with Ruby on Rails.', '2024-11-01', '2025-01-15'),
('C# Basics', 'Learn the basics of C# programming.', '2024-09-15', '2024-12-15');

select * from Course
CREATE TABLE Enrollment (
    EnrollmentID INT PRIMARY KEY IDENTITY(1,1),
    UserID INT NOT NULL,
    CourseID INT NOT NULL,
    EnrollmentDate DATE NOT NULL,
    Status VARCHAR(50) DEFAULT 'Enrolled',
    FOREIGN KEY (UserID) REFERENCES Users(UserID),
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID),
    UNIQUE (UserID, CourseID)
);

INSERT INTO Enrollment (UserID, CourseID, EnrollmentDate, Status) VALUES 
(2, 1, '2024-09-01', 'Enrolled'), -- UserID 2 (Siddarth) enrolls in CourseID 1 (Python Basics)
(3, 2, '2024-10-01', 'Enrolled'), -- UserID 3 (Prathik) enrolls in CourseID 2 (JavaScript Essentials)
(2, 3, '2024-08-15', 'Enrolled'), -- UserID 2 (Siddarth) enrolls in CourseID 3 (Java Fundamentals)
(3, 4, '2024-11-01', 'Enrolled'); -- UserID 3 (Prathik) enrolls in CourseID 4 (Ruby on Rails)

select * from Enrollment
CREATE TABLE Assessment (
    AssessmentID INT PRIMARY KEY IDENTITY(1,1),
    CourseID INT NOT NULL,
    AssessmentName VARCHAR(100) NOT NULL,
    AssessmentDate DATE NOT NULL,
    MaxScore INT NOT NULL,
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID)
);

INSERT INTO Assessment (CourseID, AssessmentName, AssessmentDate, MaxScore) 
 VALUES 
(1, 'Python Basics Quiz', '2024-11-15', 100), -- Assessment for CourseID 1 (Python Basics)
(2, 'JavaScript Project', '2024-12-01', 150), -- Assessment for CourseID 2 (JavaScript Essentials)
(3, 'Java Fundamentals Test', '2024-10-15', 120), -- Assessment for CourseID 3 (Java Fundamentals)
(4, 'Ruby on Rails Assignment', '2024-12-15', 200); -- Assessment for CourseID 4 (Ruby on Rails)

select * from Assessment

CREATE TABLE Result (
    ResultID INT PRIMARY KEY IDENTITY(1,1),
    AssessmentID INT NOT NULL,
    UserID INT NOT NULL,
    Score INT NOT NULL,
    FOREIGN KEY (AssessmentID) REFERENCES Assessment(AssessmentID),
    FOREIGN KEY (UserID) REFERENCES Users(UserID),
    UNIQUE (AssessmentID, UserID)
);

SELECT FullName 
FROM Users 
WHERE UserID IN (
    SELECT UserID 
    FROM Result 
    WHERE Score > 90
);

SELECT UserID, AssessmentID, Score,
    CASE 
        WHEN Score >= 90 THEN 'High'
        WHEN Score >= 70 THEN 'Medium'
        ELSE 'Low'
    END AS ScoreCategory
FROM Result;

--Sample data extraction

--Retrieve All Records from a Table
SELECT * FROM Users;

--Filter Records Based on a Condition
SELECT * FROM Enrollment WHERE EnrollmentDate > '2023-01-01';

--Join Two Tables
SELECT s.FullName, e.EnrollmentID 
FROM Student s
INNER JOIN Enrollment e ON s.StudentID = e.StudentID;

--Aggregate Data Using Group By
SELECT CourseID, COUNT(*) AS TotalEnrollments 
FROM Enrollment 
GROUP BY CourseID;


--Filter Groups Using HAVING
SELECT CourseID, COUNT(*) AS TotalEnrollments 
FROM Enrollment 
GROUP BY CourseID 
HAVING COUNT(*) >= 1;


--Order Results Using ORDER BY
SELECT * FROM Course ORDER BY StartDate DESC;

--Retrieve Data with a Subquery
SELECT FullName 
FROM Student 
WHERE StudentID IN (
    SELECT StudentID 
    FROM Result 
    WHERE Score > 90
);

--Use CASE Statements

SELECT StudentID, AssessmentID, Score,
    CASE 
        WHEN Score >= 90 THEN 'High'
        WHEN Score >= 70 THEN 'Medium'
        ELSE 'Low'
    END AS ScoreCategory
FROM Result;













