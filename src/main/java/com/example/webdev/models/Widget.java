package com.example.webdev.models;

import javax.persistence.*;

@Entity
@Table(name="widgets")
public class Widget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private Integer size;
    private String text;
    private String topicId;

    private String name;
    private Integer widgetOrder;
    private String url;
    private Integer width;
    private Integer height;
    private String cssClass;
    private String style;
    private String value;

    public Widget(Long id, String topicId, String type, Integer size, String text) {
        this.id = id;
        this.topicId = topicId;
        this.type = type;
        this.size = size;
        this.text = text;
    }

    public Widget() {

    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


//    create table widget (
//        id bigint not null,
//        css_class varchar(255),
//    height integer,
//    name varchar(255),
//    size integer,
//    style varchar(255),
//    text varchar(255),
//    topic_id varchar(255),
//    type varchar(255),
//    url varchar(255),
//    value varchar(255),
//    widget_order integer,
//    width integer,
//    primary key (id)
//    ) engine=InnoDB

//    create table widgets (
//        id bigint not null auto_increment,
//        css_class varchar(255),
//    height integer,
//    name varchar(255),
//    size integer,
//    style varchar(255),
//    text varchar(255),
//    topic_id varchar(255),
//    type varchar(255),
//    url varchar(255),
//    value varchar(255),
//    widget_order integer,
//    width integer,
//    primary key (id)
//    ) engine=InnoDB