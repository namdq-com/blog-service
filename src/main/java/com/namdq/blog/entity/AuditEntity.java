package com.namdq.blog.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@Getter
@Setter
@MappedSuperclass
public class AuditEntity {

    @CreationTimestamp
    @Column(name = "create_at")
    private Timestamp createAt;

    @UpdateTimestamp
    @Column(name = "last_modified_at")
    private Timestamp lastModifiedAt;
}
