# mysqlhibernate
```mysql hibernate example
Nov 13, 2017 10:06:25 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {5.2.1.Final}
Nov 13, 2017 10:06:25 PM org.hibernate.cfg.Environment <clinit>
INFO: HHH000206: hibernate.properties not found
Nov 13, 2017 10:06:25 PM org.hibernate.cfg.Environment buildBytecodeProvider
INFO: HHH000021: Bytecode provider name : javassist
Nov 13, 2017 10:06:25 PM org.hibernate.boot.jaxb.internal.stax.LocalXmlResourceResolver resolveEntity
WARN: HHH90000012: Recognized obsolete hibernate namespace http://hibernate.sourceforge.net/hibernate-configuration. Use namespace http://www.hibernate.org/dtd/hibernate-configuration instead.  Support for obsolete DTD/XSD namespaces may be removed at any time.
Nov 13, 2017 10:06:25 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.0.1.Final}
Nov 13, 2017 10:06:25 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
Nov 13, 2017 10:06:25 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [com.mysql.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/ymc]
Nov 13, 2017 10:06:25 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=root, password=****}
Nov 13, 2017 10:06:25 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
Nov 13, 2017 10:06:25 PM org.hibernate.engine.jdbc.connections.internal.PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 1 (min=1)
Nov 13, 2017 10:06:26 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQLDialect
Nov 13, 2017 10:06:26 PM org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl useContextualLobCreation
INFO: HHH000423: Disabling contextual LOB creation as JDBC driver reported JDBC version [3] less than 4
```
'''Hibernate: 
    alter table Employee 
        drop 
        foreign key FK14tijxqry9ml17nk86sqfp561
Hibernate: 
    drop table if exists Department
Hibernate: 
    drop table if exists Employee
Hibernate: 
    drop table if exists hibernate_sequence
Hibernate: 
    create table Department (
        id bigint not null,
        fullname varchar(255),
        name varchar(255),
        primary key (id)
    )
Hibernate: 
    create table Employee (
        id bigint not null,
        age bigint,
        name varchar(255),
        department_id bigint,
        primary key (id)
    )
Hibernate: 
    create table hibernate_sequence (
        next_val bigint
    )
Hibernate: 
    insert into hibernate_sequence values ( 1 )
Hibernate: 
    insert into hibernate_sequence values ( 1 )
Hibernate: 
    alter table Employee 
        add constraint FK14tijxqry9ml17nk86sqfp561 
        foreign key (department_id) 
        references Department (id)
Nov 13, 2017 10:06:28 PM org.hibernate.tool.schema.internal.SchemaCreatorImpl applyImportSources
INFO: HHH000476: Executing import script 'org.hibernate.tool.schema.internal.exec.ScriptSourceInputNonExistentImpl@12bd8a64'
Hibernate: 
    select
        next_val as id_val 
    from
        hibernate_sequence for update
            
Hibernate: 
    update
        hibernate_sequence 
    set
        next_val= ? 
    where
        next_val=?
Hibernate: 
    select
        next_val as id_val 
    from
        hibernate_sequence for update
            
Hibernate: 
    update
        hibernate_sequence 
    set
        next_val= ? 
    where
        next_val=?
Hibernate: 
    select
        next_val as id_val 
    from
        hibernate_sequence for update
            
Hibernate: 
    update
        hibernate_sequence 
    set
        next_val= ? 
    where
        next_val=?
Hibernate: 
    insert 
    into
        Department
        (fullname, name, id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        Employee
        (age, department_id, name, id) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        Employee
        (age, department_id, name, id) 
    values
        (?, ?, ?, ?)
Nov 13, 2017 10:06:28 PM org.hibernate.hql.internal.QueryTranslatorFactoryInitiator initiateService
INFO: HHH000397: Using ASTQueryTranslatorFactory
Hibernate: 
    select
        employee0_.id as id1_1_,
        employee0_.age as age2_1_,
        employee0_.department_id as departme4_1_,
        employee0_.name as name3_1_ 
    from
        Employee employee0_
num of employess:2
next employee: Employee [id=2, name=Yogesh chaudhari Age =34, department=java]full name :hibernate
next employee: Employee [id=3, name=Aditya chaudhari Age =3, department=java]full name :hibernate
'''
