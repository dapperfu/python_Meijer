package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.C10454l0;
import com.google.android.gms.internal.measurement.C10463m0;

/* loaded from: classes6.dex */
public final class V5 extends AbstractC11108b6 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f85257d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC11263x f85258e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f85259f;

    private final AbstractC11263x m() {
        if (this.f85258e == null) {
            this.f85258e = new U5(this, this.f85267b.e0());
        }
        return this.f85258e;
    }

    @TargetApi(24)
    private final void n() {
        JobScheduler jobScheduler = (JobScheduler) this.f84868a.zzaY().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(o());
        }
    }

    private final int o() {
        if (this.f85259f == null) {
            this.f85259f = Integer.valueOf("measurement".concat(String.valueOf(this.f84868a.zzaY().getPackageName())).hashCode());
        }
        return this.f85259f.intValue();
    }

    private final PendingIntent p() {
        Context contextZzaY = this.f84868a.zzaY();
        return PendingIntent.getBroadcast(contextZzaY, 0, new Intent().setClassName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C10454l0.f82259a);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC11108b6
    protected final boolean j() {
        AlarmManager alarmManager = this.f85257d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        n();
        return false;
    }

    protected V5(q6 q6Var) {
        super(q6Var);
        this.f85257d = (AlarmManager) this.f84868a.zzaY().getSystemService("alarm");
    }

    public final void k(long j10) {
        h();
        X2 x22 = this.f84868a;
        x22.c();
        Context contextZzaY = x22.zzaY();
        if (!z6.h0(contextZzaY)) {
            x22.a().t().a("Receiver not registered/enabled");
        }
        if (!z6.C(contextZzaY, false)) {
            x22.a().t().a("Service not registered/enabled");
        }
        l();
        x22.a().u().b("Scheduling upload, millis", Long.valueOf(j10));
        x22.zzaZ().c();
        x22.u();
        if (j10 < Math.max(0L, ((Long) C11120d2.f85422M.b(null)).longValue()) && !m().c()) {
            m().b(j10);
        }
        x22.c();
        Context contextZzaY2 = x22.zzaY();
        ComponentName componentName = new ComponentName(contextZzaY2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iO = o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C10463m0.a(contextZzaY2, new JobInfo.Builder(iO, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void l() {
        h();
        this.f84868a.a().u().a("Unscheduling upload");
        AlarmManager alarmManager = this.f85257d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        m().d();
        n();
    }
}
