create table if not exists simplification_control(
control_indicator Integer not null,
name varchar(255) null,
process_simplification char null,
action_simplification varchar(255) null,
action_id bigint null,
action_method varchar(255) null,
rule_simplification varchar(255) null,
rule_returns varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint simplification_control_pk primary key(control_indicator));