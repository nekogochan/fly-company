package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Place {
    private int id;
    private int total;
    private int free;
    private ScheduleItem scheduleItem;
}
