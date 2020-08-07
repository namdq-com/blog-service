package com.namdq.blog.entity;

import com.namdq.blog.constant.DocumentStatus;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "post")
public class PostEntity extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String url;

    private String description;

    private String image;

    private String content;

    @Enumerated(EnumType.STRING)
    private DocumentStatus status;

    private Integer createdBy;
}
