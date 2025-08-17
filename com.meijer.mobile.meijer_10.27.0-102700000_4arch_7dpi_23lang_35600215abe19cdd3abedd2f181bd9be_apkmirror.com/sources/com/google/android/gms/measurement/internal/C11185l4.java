package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.l4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11185l4 implements Application.ActivityLifecycleCallbacks, Od.B {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85672a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // Od.B
    public final void a(com.google.android.gms.internal.measurement.J0 j02) throws IllegalStateException {
        X2 x22 = this.f85672a.f84868a;
        x22.G().v(j02);
        N5 n5X = x22.x();
        X2 x23 = n5X.f84868a;
        x23.b().r(new F5(n5X, x23.zzaZ().c()));
    }

    @Override // Od.B
    public final void b(com.google.android.gms.internal.measurement.J0 j02) {
        this.f85672a.f84868a.G().x(j02);
    }

    @Override // Od.B
    public final void c(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle) {
        this.f85672a.f84868a.G().w(j02, bundle);
    }

    @Override // Od.B
    public final void d(com.google.android.gms.internal.measurement.J0 j02) throws IllegalStateException {
        X2 x22 = this.f85672a.f84868a;
        N5 n5X = x22.x();
        X2 x23 = n5X.f84868a;
        x23.b().r(new E5(n5X, x23.zzaZ().c()));
        x22.G().u(j02);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // Od.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.gms.internal.measurement.J0 r8, android.os.Bundle r9) throws java.lang.Throwable {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.x4 r0 = r7.f85672a     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.X2 r1 = r0.f84868a     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.q2 r2 = r1.a()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.o2 r2 = r2.u()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r3 = "onActivityCreated"
            r2.a(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            android.content.Intent r2 = r8.f81803c     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L4c
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 == 0) goto L2c
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r4 != 0) goto L22
            goto L2c
        L22:
            r4 = r3
            goto L44
        L24:
            r0 = move-exception
            r2 = r7
            goto Lb6
        L28:
            r0 = move-exception
            r2 = r7
            goto La0
        L2c:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r4 = 0
            if (r3 == 0) goto L44
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r5 != 0) goto L44
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            goto L22
        L44:
            if (r4 == 0) goto L4c
            boolean r3 = r4.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L4e
        L4c:
            r2 = r7
            goto L96
        L4e:
            r1.A()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L74
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L74
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r0 == 0) goto L70
            goto L74
        L70:
            java.lang.String r0 = "auto"
        L72:
            r5 = r0
            goto L77
        L74:
            java.lang.String r0 = "gs"
            goto L72
        L77:
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r9 != 0) goto L82
            r0 = 1
        L80:
            r3 = r0
            goto L84
        L82:
            r0 = 0
            goto L80
        L84:
            com.google.android.gms.measurement.internal.T2 r0 = r1.b()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.k4 r1 = new com.google.android.gms.measurement.internal.k4     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L92 java.lang.RuntimeException -> L94
            r0.r(r1)     // Catch: java.lang.Throwable -> L92 java.lang.RuntimeException -> L94
            goto Lb1
        L92:
            r0 = move-exception
            goto Lb6
        L94:
            r0 = move-exception
            goto La0
        L96:
            com.google.android.gms.measurement.internal.X2 r0 = r0.f84868a
        L98:
            com.google.android.gms.measurement.internal.M4 r0 = r0.G()
            r0.t(r8, r9)
            return
        La0:
            com.google.android.gms.measurement.internal.x4 r1 = r2.f85672a     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.measurement.internal.X2 r1 = r1.f84868a     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.measurement.internal.q2 r1 = r1.a()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.measurement.internal.o2 r1 = r1.m()     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r1.b(r3, r0)     // Catch: java.lang.Throwable -> L92
        Lb1:
            com.google.android.gms.measurement.internal.x4 r0 = r2.f85672a
            com.google.android.gms.measurement.internal.X2 r0 = r0.f84868a
            goto L98
        Lb6:
            com.google.android.gms.measurement.internal.x4 r1 = r2.f85672a
            com.google.android.gms.measurement.internal.X2 r1 = r1.f84868a
            com.google.android.gms.measurement.internal.M4 r1 = r1.G()
            r1.t(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11185l4.e(com.google.android.gms.internal.measurement.J0, android.os.Bundle):void");
    }

    C11185l4(C11268x4 c11268x4) {
        Objects.requireNonNull(c11268x4);
        this.f85672a = c11268x4;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        e(com.google.android.gms.internal.measurement.J0.B(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(com.google.android.gms.internal.measurement.J0.B(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) throws IllegalStateException {
        a(com.google.android.gms.internal.measurement.J0.B(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) throws IllegalStateException {
        d(com.google.android.gms.internal.measurement.J0.B(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(com.google.android.gms.internal.measurement.J0.B(activity), bundle);
    }
}
