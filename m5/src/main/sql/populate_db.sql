INSERT INTO worker (NAME, BIRTHDAY, LEVEL, SALARY)
VALUES 
  ('Linus Torvalds', '1990-01-01', 'Trainee', 500),
  ('Bill Gates', '1995-02-15', 'Junior', 1200),
  ('Steve Jobs', '1985-03-05', 'Middle', 3000),
  ('Mark Zuckerberg', '1980-04-20', 'Senior', 6000),
  ('Larry Page', '1992-05-10', 'Trainee', 700),
  ('Sergey Brin', '1993-06-25', 'Junior', 1500),
  ('Tim Berners-Lee', '1988-07-15', 'Middle', 3500),
  ('Ada Lovelace', '1975-08-30', 'Senior', 8000),
  ('Grace Hopper', '1982-09-05', 'Trainee', 900),
  ('Alan Turing', '1991-10-12', 'Junior', 1800);

INSERT INTO client (NAME)
VALUES 
    ('Customer 1'),
    ('Customer 2'),
    ('Customer 3'),
    ('Customer 4'),
    ('Customer 5');

INSERT INTO project (CLIENT_ID, START_DATE, FINISH_DATE)
VALUES 
    (1, '2008-09-12', '2009-03-12'),
    (1, '2010-01-22', '2013-09-22'),
    (2, '2015-07-05', '2017-02-05'),
    (2, '2019-11-01', '2021-02-01'),
    (3, '2014-12-17', '2015-06-17'),
    (3, '2016-09-28', '2023-01-28'),
    (4, '2013-03-11', '2013-12-11'),
    (4, '2009-05-07', '2012-11-07'),
    (5, '2018-02-13', '2019-11-13'),
    (5, '2011-08-19', '2012-08-19');

INSERT INTO project_worker (PROJECT_ID, WORKER_ID) VALUES
(1, 1), (1, 2), (1, 3), (1, 4), (1, 5),
(2, 1), (2, 2), (2, 3), (2, 4),
(3, 5), (3, 6), (3, 7), (3, 8),
(4, 1), (4, 2), (4, 3),
(5, 3), (5, 6), (5, 9), (5, 10),
(6, 2), (6, 4), (6, 6), (6, 8), (6, 10),
(7, 1), (7, 3), (7, 5), (7, 7), (7, 9),
(8, 2), (8, 4), (8, 6), (8, 8), (8, 10),
(9, 1), (9, 3), (9, 6), (9, 8), (9, 10),
(10, 2), (10, 4), (10, 5), (10, 7), (10, 9);