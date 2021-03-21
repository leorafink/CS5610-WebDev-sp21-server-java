package com.example.webdev.services;

import com.example.webdev.models.Widget;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WidgetService {
    private List<Widget> widgets = new ArrayList<Widget>();
    {
        Widget w1 = new Widget(123L, "ABC123","HEADING", 1, "Welcome to widgets");
        Widget w2 = new Widget(234L,"ABC234","PARAGRAPH", 1, "This is a paragraph");
        Widget w3 = new Widget(345L,"ABC234","HEADING", 2, "Welcome to WebDev");
        Widget w4 = new Widget(456L,"ABC234","PARAGRAPH", 1, "Lorem Ipsum");
        widgets.add(w1);
        widgets.add(w2);
        widgets.add(w3);
        widgets.add(w4);

    }

    public Widget createWidgetForTopic(Widget widget) {
        Long id = (new Date()).getTime();
        widget.setId(id);
        widgets.add(widget);
        return widget;
    }

    public List<Widget> findAllWidgets() {
        return widgets;
    }
    public List<Widget> findWidgetsForTopic(String topicId) {
        List<Widget> ws = new ArrayList<Widget>();
        for(Widget w: widgets) {
            if(w.getTopicId().equals(topicId)) {
               ws.add(w);
            }
        }
        return ws;
    }


    public Widget findWidgetById(Long id) {
        for(Widget w: widgets) {
            if(w.getId().equals(id)) {
                return w;
            }
        }
        return null;
    }

    public Integer updateWidget(Long id) {
        return -1;
    }

    public Integer deleteWidget(Long id) {
        return -1;
    }
}

