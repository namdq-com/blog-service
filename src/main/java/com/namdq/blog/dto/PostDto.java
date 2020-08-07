package com.namdq.blog.dto;

import com.namdq.blog.constant.DocumentStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostDto extends AuditDto {
    private Integer id;

    private String name;

    private String url;

    private String description;

    private String image;

    private String content;

    private DocumentStatus status;

    private Integer createdBy;
}
