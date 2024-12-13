create table if not exists table_reference_simplification(
reference_table_id bigint not null,
table_length varchar(255) null,
table_headers varchar(255) null,
row_count Integer null,
column_count Integer null,
header_colour varchar(255) null,
row_data_colour varchar(255) null,
is_active char null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint table_reference_simplification_pk primary key(reference_table_id));