package com.fastaccess.provider.tasks;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;
import com.fastaccess.provider.tasks.notification.NotificationSchedulerJobTask;

/**
 * Created by thermatk on 07.04.17.
 */

public class JobTaskCreator implements JobCreator {

    @Override
    public Job create(String tag) {
        switch (tag) {
            case NotificationSchedulerJobTask.TAG:
                return new NotificationSchedulerJobTask();
            default:
                return null;
        }
    }
}
