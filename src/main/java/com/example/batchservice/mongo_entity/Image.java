package com.example.batchservice.mongo_entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "images")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    String imageId;
    Long recruitId;
    int number;
    String url;
    public Image(String url) {
        this.url=url;
    }
}
