package reviewapp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import reviewapp.domain.*;
import reviewapp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReviewAdded extends AbstractEvent {

    private Long id;
    private String itemId;
    private Double rating;
    private String text;
    private String userId;
    private String userImg;
    private String itemId;
    private Double rating;
    private String text;
    private String userId;
    private String userImg;

    public ReviewAdded(Review aggregate) {
        super(aggregate);
    }

    public ReviewAdded() {
        super();
    }
}
//>>> DDD / Domain Event
