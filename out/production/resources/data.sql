DROP TABLE IF EXISTS employee_skills;
 
CREATE TABLE employee_skills (
  id int AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  contact_number VARCHAR(250) NOT NULL,
  courses_familiar_with VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO employee_skills (id, name, email, contact_number, courses_familiar_with) VALUES
  ('1','Raghu',  'test@gmail.com','234234823', 'Java'),
  ( '2', 'Raju', 'test@gmail.com', '23942384923','SalesForce'),
  ( '3', 'venkat', 'test@gmail.com', '9078697223','Mainframes'),
   ( '4', 'tes', 'test@gmail.com', '907197223','Mainframes');