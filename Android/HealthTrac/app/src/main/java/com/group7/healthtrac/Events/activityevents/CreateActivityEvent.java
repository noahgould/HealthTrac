package com.group7.healthtrac.events.activityevents;

import com.group7.healthtrac.events.IEvent;
import com.group7.healthtrac.models.Activity;

/**
 * Created by Mike C on 3/9/2015.
 */
public class CreateActivityEvent implements IEvent {

    private Activity mActivity;

    public CreateActivityEvent(Activity activity) { mActivity = activity; }

    public Activity getActivity() { return mActivity; }

}
