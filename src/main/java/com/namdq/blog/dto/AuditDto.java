package com.namdq.blog.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@Getter
@Setter
@MappedSuperclass
public class AuditDto {

    private Timestamp createAt;

    private Timestamp lastModifiedAt;
}
