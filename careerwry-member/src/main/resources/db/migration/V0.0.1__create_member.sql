CREATE TABLE IF NOT EXISTS members
(
    id                BIGINT AUTO_INCREMENT NOT NULL,
    created_at        datetime              NULL,
    created_by        VARCHAR(255)          NULL,
    modified_at       datetime              NULL,
    modified_by       VARCHAR(255)          NULL,
    member_token      VARCHAR(255)          NOT NULL,
    email             VARCHAR(255)          NOT NULL,
    nick_name         VARCHAR(255)          NOT NULL,
    profile_image_url VARCHAR(255)          NULL,
    gender            VARCHAR(255)          NULL,
    age               VARCHAR(255)          NULL,
    oauth_server_id   VARCHAR(255)          NOT NULL,
    oauth_server      VARCHAR(255)          NOT NULL,
    CONSTRAINT pk_members PRIMARY KEY (id)
);

ALTER TABLE members
    ADD CONSTRAINT uc_members_member_token UNIQUE (member_token);

ALTER TABLE members
    ADD CONSTRAINT oauth_id_unique UNIQUE (oauth_server_id, oauth_server);