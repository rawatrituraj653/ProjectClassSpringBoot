Hibernate: 
    
    drop table if exists city_master
Hibernate: 
    
    drop table if exists country_master
Hibernate: 
    
    drop table if exists state_master
Hibernate: 
    
    create table city_master (
       city_id integer not null,
        city_name varchar(30),
        state_id integer,
        primary key (city_id)
    ) engine=MyISAM
Hibernate: 
    
    create table country_master (
       country_id integer not null,
        country_code varchar(4),
        country_name varchar(30),
        primary key (country_id)
    ) engine=MyISAM
Hibernate: 
    
    create table state_master (
       state_id integer not null,
        country_id integer,
        state_name varchar(30),
        primary key (state_id)
    ) engine=MyISAM




Hibernate: 
    select
        country0_.country_id as country_1_1_0_,
        country0_.country_code as country_2_1_0_,
        country0_.country_name as country_3_1_0_ 
    from
        country_master country0_ 
    where
        country0_.country_id=?
Hibernate: 


    insert 
    into
        country_master
        (country_code, country_name, country_id) 
    values
        (?, ?, ?);

    insert 
    into
        country_master
        (country_code, country_name, country_id) 
    values
        (?, ?, ?)
******All Country Object  Saved******
    select
        state0_.state_id as state_id1_2_0_,
        state0_.country_id as country_2_2_0_,
        state0_.state_name as state_na3_2_0_ 
    from
        state_master state0_ 
    where
        state0_.state_id=?
Hibernate:

    insert 
    into
        state_master
        (country_id, state_name, state_id) 
    values
        (?, ?, ?);

    insert 
    into
        state_master
        (country_id, state_name, state_id) 
    values
        (?, ?, ?);

    insert 
    into
        state_master
        (country_id, state_name, state_id) 
    values
        (?, ?, ?);

    insert 
    into
        state_master
        (country_id, state_name, state_id) 
    values
        (?, ?, ?)
******All State Object  Saved******
Hibernate: 
    select
        city0_.city_id as city_id1_0_0_,
        city0_.city_name as city_nam2_0_0_,
        city0_.state_id as state_id3_0_0_ 
    from
        city_master city0_ 
    where
        city0_.city_id=?
Hibernate: 

    insert 
    into
        city_master
        (city_name, state_id, city_id) 
    values
        (?, ?, ?);

    insert 
    into
        city_master
        (city_name, state_id, city_id) 
    values
        (?, ?, ?);

    insert 
    into
        city_master
        (city_name, state_id, city_id) 
    values
        (?, ?, ?);

    insert 
    into
        city_master
        (city_name, state_id, city_id) 
    values
        (?, ?, ?);


    insert 
    into
        city_master
        (city_name, state_id, city_id) 
    values
        (?, ?, ?);
 
    insert 
    into
        city_master
        (city_name, state_id, city_id) 
    values
        (?, ?, ?);

    insert 
    into
        city_master
        (city_name, state_id, city_id) 
    values
        (?, ?, ?);

    insert 
    into
        city_master
        (city_name, state_id, city_id) 
    values
        (?, ?, ?);