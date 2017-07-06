-- 코드 9-6 src/main/resources/data.sql

-- USERS IN JOURNAL
INSERT INTO ACCOUNT(account_name , password) VALUES('springboot', 'isawesome');
INSERT INTO ACCOUNT(account_name , password) VALUES('springsecurity', 'isawesometoo');

-- JOURNAL DATA
INSERT INTO ENTRY(title,summary,created) VALUES('스프링 부트 입문','오늘부터 스프링 부트를 배웠다','2016-01-02 00:00:00.00');
INSERT INTO ENTRY(title,summary,created) VALUES('간단한 스프링 부트 프로젝트','스프링 부트 프로젝트를 처음 만들어보았다','2016-01-03 00:00:00.00');
INSERT INTO ENTRY(title,summary,created) VALUES('스프링 부트 해부','스프링 부트를 자세히 살펴보았다','2016-02-02 00:00:00.00');
INSERT INTO ENTRY(title,summary,created) VALUES('스프링 부트 클라우드','클라우드 파운드리를 응용한 스프링 부트를 공부했다','2016-02-05 00:00:00.00');
