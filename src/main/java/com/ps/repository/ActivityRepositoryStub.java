package com.ps.repository;

import com.ps.model.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityRepositoryStub implements ActivityRepository {

    @Override
    public List<Activity> findAllActivities() {
        List<Activity> activities = new ArrayList<Activity>();

        Activity activity1 = new Activity();

        activity1.setDescription("Swimming");
        activity1.setDuration(55);

        activities.add(activity1);

        Activity activity2 = new Activity();

        activity2.setDescription("Cycling");
        activity2.setDuration(120);

        activities.add(activity2);

        return activities;
    }

    @Override
    public Activity findActivity(String activityId) {
        Activity activity1 = new Activity();

        activity1.setId("1234");
        activity1.setDescription("Swimming");
        activity1.setDuration(55);


        return activity1;
    }


}
