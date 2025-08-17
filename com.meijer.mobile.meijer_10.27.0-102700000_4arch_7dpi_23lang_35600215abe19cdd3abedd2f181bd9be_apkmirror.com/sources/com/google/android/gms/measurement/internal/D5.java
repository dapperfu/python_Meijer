package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.fullstory.FS;
import com.google.android.gms.internal.measurement.C10544v1;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class D5 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f84966a;

    public static final boolean j(Intent intent) {
        if (intent == null) {
            FS.log_e("FA", "onUnbind called with null intent");
            return true;
        }
        FS.log_v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    public final int c(final Intent intent, int i10, final int i11) throws IllegalStateException {
        if (intent == null) {
            FS.log_w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f84966a;
        X2 x2M = X2.M(context, null, null);
        final C11218q2 c11218q2A = x2M.a();
        String action = intent.getAction();
        x2M.c();
        c11218q2A.u().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(q6.D(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.C5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f84949a.f(i11, c11218q2A, intent);
                }
            });
        }
        return 2;
    }

    public static final void i(Intent intent) {
        if (intent == null) {
            FS.log_e("FA", "onRebind called with null intent");
        } else {
            FS.log_v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public final void a() {
        FS.log_v("FA", this.f84966a.getClass().getSimpleName().concat(" is starting up."));
    }

    public final void b() {
        FS.log_v("FA", this.f84966a.getClass().getSimpleName().concat(" is shutting down."));
    }

    public final IBinder d(Intent intent) {
        if (intent == null) {
            FS.log_e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC11281z3(q6.D(this.f84966a), null);
        }
        FS.log_w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void f(int i10, C11218q2 c11218q2, Intent intent) {
        Context context = this.f84966a;
        Od.I i11 = (Od.I) context;
        if (i11.zza(i10)) {
            c11218q2.u().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            X2.M(context, null, null).a().u().a("Completed wakeful intent.");
            i11.a(intent);
        }
    }

    final /* synthetic */ void h(JobParameters jobParameters) {
        FS.log_v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((Od.I) this.f84966a).b(jobParameters, false);
    }

    public D5(Context context) {
        com.google.android.gms.common.internal.r.l(context);
        this.f84966a = context;
    }

    private final void k(q6 q6Var, Runnable runnable) throws IllegalStateException {
        q6Var.b().r(new RunnableC11283z5(this, q6Var, runnable));
    }

    @TargetApi(24)
    public final boolean e(final JobParameters jobParameters) throws IllegalStateException {
        String string = jobParameters.getExtras().getString("action");
        FS.log_v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) com.google.android.gms.common.internal.r.l(string);
            q6 q6VarD = q6.D(this.f84966a);
            final C11218q2 c11218q2A = q6VarD.a();
            q6VarD.c();
            c11218q2A.u().b("Local AppMeasurementJobService called. action", str);
            k(q6VarD, new Runnable() { // from class: com.google.android.gms.measurement.internal.A5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f84875a.g(c11218q2A, jobParameters);
                }
            });
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            C10544v1.r(this.f84966a, null).F(new Runnable() { // from class: com.google.android.gms.measurement.internal.B5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f84896a.h(jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    final /* synthetic */ void g(C11218q2 c11218q2, JobParameters jobParameters) {
        c11218q2.u().a("AppMeasurementJobService processed last upload request.");
        ((Od.I) this.f84966a).b(jobParameters, false);
    }
}
