create table if not exists req_response_simplification(
request_response_tag_id Integer not null,
req_xml varchar(255) null,
response_xml varchar(255) null,
xml_provider char null,
xml_formatter varchar(255) null,
comparison_module varchar(255) null,
header varchar(255) null,
xml_tag_count Integer null,
common_tag_name varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint req_response_simplification_pk primary key(request_response_tag_id));