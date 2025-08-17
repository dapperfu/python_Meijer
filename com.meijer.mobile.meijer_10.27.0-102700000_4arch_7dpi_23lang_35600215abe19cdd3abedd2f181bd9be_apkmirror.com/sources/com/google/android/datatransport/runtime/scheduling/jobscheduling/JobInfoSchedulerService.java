package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import Cc.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import rc.p;
import rc.u;

/* loaded from: classes4.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        u.f(getApplicationContext());
        p.a aVarD = p.a().b(string).d(a.b(i10));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        u.c().e().m(aVarD.a(), i11, new Runnable() { // from class: yc.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f170395a.jobFinished(jobParameters, false);
            }
        });
        return true;
    }
}
