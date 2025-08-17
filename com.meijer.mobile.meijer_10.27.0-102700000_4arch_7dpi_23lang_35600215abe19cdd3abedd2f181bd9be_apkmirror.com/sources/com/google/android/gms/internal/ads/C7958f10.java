package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.f10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7958f10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final ApplicationInfo f74015a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f74016b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f74017c;

    C7958f10(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.f74015a = applicationInfo;
        this.f74016b = packageInfo;
        this.f74017c = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 29;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    @Override // com.google.android.gms.internal.ads.T10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.q zzb() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r9 = this;
            android.content.pm.ApplicationInfo r0 = r9.f74015a
            java.lang.String r2 = r0.packageName
            android.content.pm.PackageInfo r0 = r9.f74016b
            r1 = 0
            if (r0 != 0) goto Lb
            r3 = r1
            goto L12
        Lb:
            int r0 = r0.versionCode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = r0
        L12:
            android.content.pm.PackageInfo r0 = r9.f74016b
            if (r0 != 0) goto L18
            r4 = r1
            goto L1b
        L18:
            java.lang.String r0 = r0.versionName
            r4 = r0
        L1b:
            android.content.Context r0 = r9.f74017c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            com.google.android.gms.internal.ads.Jd0 r5 = Pc.D0.f25081l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            qd.e r0 = qd.C16519f.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            java.lang.CharSequence r0 = r0.d(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            r5 = r0
            goto L2e
        L2d:
            r5 = r1
        L2e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r0 < r6) goto L7a
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f75955Ec
            com.google.android.gms.internal.ads.jf r6 = Mc.A.c()
            java.lang.Object r0 = r6.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7a
            android.content.Context r0 = r9.f74017c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.InstallSourceInfo r0 = com.bugsnag.android.C6463d.a(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            if (r0 == 0) goto L7a
            java.lang.String r6 = com.bugsnag.android.C6465e.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            if (r7 == 0) goto L62
            java.lang.String r7 = "No installing package name found"
            Pc.p0.k(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            r6 = r1
        L62:
            java.lang.String r7 = com.google.android.gms.internal.ads.C7851e10.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r0 == 0) goto L88
            java.lang.String r0 = "No initiating package name found"
            Pc.p0.k(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
        L71:
            r7 = r1
            goto L88
        L73:
            r0 = move-exception
            r1 = r7
            goto L7e
        L76:
            r0 = move-exception
            goto L7e
        L78:
            r0 = move-exception
            goto L7d
        L7a:
            r6 = r1
            r7 = r6
            goto L88
        L7d:
            r6 = r1
        L7e:
            java.lang.String r7 = "PackageInfoSignalSource.getInstallSourceInfo"
            com.google.android.gms.internal.ads.Aq r8 = Lc.v.s()
            r8.x(r0, r7)
            goto L71
        L88:
            com.google.android.gms.internal.ads.g10 r1 = new com.google.android.gms.internal.ads.g10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.q r0 = com.google.android.gms.internal.ads.Mj0.h(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7958f10.zzb():com.google.common.util.concurrent.q");
    }
}
