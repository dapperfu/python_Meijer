package com.google.android.gms.measurement;

import Od.I;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.D5;

@TargetApi(24)
/* loaded from: classes6.dex */
public final class AppMeasurementJobService extends JobService implements I {

    /* renamed from: a, reason: collision with root package name */
    private D5 f84854a;

    @Override // Od.I
    public final void a(Intent intent) {
    }

    @Override // Od.I
    @TargetApi(24)
    public final void b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    private final D5 c() {
        if (this.f84854a == null) {
            this.f84854a = new D5(this);
        }
        return this.f84854a;
    }

    @Override // Od.I
    public final boolean zza(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c().a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        c().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        c();
        D5.i(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) throws IllegalStateException {
        c().e(jobParameters);
        return true;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c();
        D5.j(intent);
        return true;
    }
}
