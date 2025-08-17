package com.medallia.digital.mobilesdk;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.medallia.digital.mobilesdk.d7;

/* loaded from: classes7.dex */
public class CheckBackgroundWorker extends Worker {
    public CheckBackgroundWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private void a() {
        v3.f().b();
    }

    private void b() {
        d7.b().b(d7.a.BG_STARTED_TIMESTAMP, System.currentTimeMillis());
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        if (!LifeCycle.b().f()) {
            return c.a.b();
        }
        if (!d7.b().a(d7.a.IS_ON_DESTROY_CALLED, false)) {
            v3.f().d();
            b();
            a();
        }
        return c.a.c();
    }
}
