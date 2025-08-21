package com.google.android.gms.measurement;

import Qd.I;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.D5;

/* loaded from: classes6.dex */
public final class AppMeasurementService extends Service implements I {

    /* renamed from: a, reason: collision with root package name */
    private D5 f85696a;

    private final D5 c() {
        if (this.f85696a == null) {
            this.f85696a = new D5(this);
        }
        return this.f85696a;
    }

    @Override // Qd.I
    public final void b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // Qd.I
    public final void a(Intent intent) {
        R2.a.b(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return c().d(intent);
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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) throws IllegalStateException {
        c().c(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c();
        D5.j(intent);
        return true;
    }

    @Override // Qd.I
    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }
}
