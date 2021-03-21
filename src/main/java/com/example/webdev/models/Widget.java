package com.example.webdev.models;

public class Widget {
    private Long id;
    private String type;
    private Integer size;
    private String text;

    private String name;
    private Integer widgetOrder;
    private String url;
    private Integer width;
    private Integer height;
    private String cssClass;
    private String style;
    private String value;

    public Widget(Long id, String type, Integer size, String text) {
        this.id = id;
        this.type = type;
        this.size = size;
        this.text = text;
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