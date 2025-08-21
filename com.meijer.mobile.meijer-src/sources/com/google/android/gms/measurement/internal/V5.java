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
import com.google.android.gms.internal.measurement.C10579l0;
import com.google.android.gms.internal.measurement.C10588m0;

/* loaded from: classes6.dex */
public final class V5 extends AbstractC11233b6 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f86097d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC11388x f86098e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f86099f;

    private final AbstractC11388x m() {
        if (this.f86098e == null) {
            this.f86098e = new U5(this, this.f86107b.e0());
        }
        return this.f86098e;
    }

    @TargetApi(24)
    private final void n() {
        JobScheduler jobScheduler = (JobScheduler) this.f85708a.zzaY().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(o());
        }
    }

    private final int o() {
        if (this.f86099f == null) {
            this.f86099f = Integer.valueOf("measurement".concat(String.valueOf(this.f85708a.zzaY().getPackageName())).hashCode());
        }
        return this.f86099f.intValue();
    }

    private final PendingIntent p() {
        Context contextZzaY = this.f85708a.zzaY();
        return PendingIntent.getBroadcast(contextZzaY, 0, new Intent().setClassName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C10579l0.f83099a);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC11233b6
    protected final boolean j() {
        AlarmManager alarmManager = this.f86097d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        n();
        return false;
    }

    protected V5(q6 q6Var) {
        super(q6Var);
        this.f86097d = (AlarmManager) this.f85708a.zzaY().getSystemService("alarm");
    }

    public final void k(long j10) {
        h();
        X2 x22 = this.f85708a;
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
        if (j10 < Math.max(0L, ((Long) C11245d2.f86262M.b(null)).longValue()) && !m().c()) {
            m().b(j10);
        }
        x22.c();
        Context contextZzaY2 = x22.zzaY();
        ComponentName componentName = new ComponentName(contextZzaY2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iO = o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C10588m0.a(contextZzaY2, new JobInfo.Builder(iO, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void l() {
        h();
        this.f85708a.a().u().a("Unscheduling upload");
        AlarmManager alarmManager = this.f86097d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        m().d();
        n();
    }
}
