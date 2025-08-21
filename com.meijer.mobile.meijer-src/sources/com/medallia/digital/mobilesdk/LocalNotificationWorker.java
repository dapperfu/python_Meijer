package com.medallia.digital.mobilesdk;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import org.json.JSONException;

/* loaded from: classes8.dex */
public class LocalNotificationWorker extends Worker {
    public LocalNotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public c.a doWork() throws JSONException {
        v3.f().a();
        v3.f().b();
        return c.a.c();
    }
}
