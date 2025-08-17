package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.EnumC10448k3;

/* loaded from: classes6.dex */
public final class D4 extends AbstractC11136f2 {

    /* renamed from: c, reason: collision with root package name */
    private JobScheduler f84965c;

    @Override // com.google.android.gms.measurement.internal.AbstractC11136f2
    protected final boolean k() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC11136f2
    @TargetApi(24)
    protected final void l() {
        this.f84965c = (JobScheduler) this.f84868a.zzaY().getSystemService("jobscheduler");
    }

    final int n() {
        return "measurement-client".concat(String.valueOf(this.f84868a.zzaY().getPackageName())).hashCode();
    }

    public D4(X2 x22) {
        super(x22);
    }

    @TargetApi(24)
    public final void m(long j10) {
        String str;
        h();
        f();
        JobScheduler jobScheduler = this.f84965c;
        if (jobScheduler != null && jobScheduler.getPendingJob(n()) != null) {
            this.f84868a.a().u().a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        EnumC10448k3 enumC10448k3O = o();
        if (enumC10448k3O == EnumC10448k3.CLIENT_UPLOAD_ELIGIBLE) {
            X2 x22 = this.f84868a;
            x22.a().u().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
            int iSchedule = ((JobScheduler) com.google.android.gms.common.internal.r.l(this.f84965c)).schedule(new JobInfo.Builder(n(), new ComponentName(x22.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build());
            C11204o2 c11204o2U = x22.a().u();
            if (iSchedule == 1) {
                str = "SUCCESS";
            } else {
                str = "FAILURE";
            }
            c11204o2U.b("[sgtm] Scion upload job scheduled with result", str);
            return;
        }
        this.f84868a.a().u().b("[sgtm] Not eligible for Scion upload", enumC10448k3O.name());
    }

    final EnumC10448k3 o() {
        h();
        f();
        if (this.f84965c != null) {
            X2 x22 = this.f84868a;
            if (x22.u().N()) {
                X2 x23 = this.f84868a;
                if (x23.J().s() >= 119000) {
                    if (!z6.D(x22.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
                        return EnumC10448k3.MEASUREMENT_SERVICE_NOT_ENABLED;
                    }
                    if (!x23.H().w()) {
                        return EnumC10448k3.NON_PLAY_MODE;
                    }
                    return EnumC10448k3.CLIENT_UPLOAD_ELIGIBLE;
                }
                return EnumC10448k3.SDK_TOO_OLD;
            }
            return EnumC10448k3.NOT_ENABLED_IN_MANIFEST;
        }
        return EnumC10448k3.MISSING_JOB_SCHEDULER;
    }
}
