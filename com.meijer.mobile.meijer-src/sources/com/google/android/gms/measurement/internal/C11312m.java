package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.lang.reflect.InvocationTargetException;
import sd.C17067f;

/* renamed from: com.google.android.gms.measurement.internal.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11312m extends A3 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f86516b;

    /* renamed from: c, reason: collision with root package name */
    private String f86517c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC11305l f86518d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f86519e;

    final Bundle G() {
        try {
            X2 x22 = this.f85708a;
            if (x22.zzaY().getPackageManager() == null) {
                x22.a().m().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = C17067f.a(x22.zzaY()).c(x22.zzaY().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            x22.a().m().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f85708a.a().m().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final void O(String str) {
        this.f86517c = str;
    }

    public final String P() {
        return this.f86517c;
    }

    final void r(InterfaceC11305l interfaceC11305l) {
        this.f86518d = interfaceC11305l;
    }

    public static final long l() {
        return ((Long) C11245d2.f86302e.b(null)).longValue();
    }

    public static final int m() {
        return Math.max(0, ((Integer) C11245d2.f86317j.b(null)).intValue());
    }

    public static final long n() {
        return ((Integer) C11245d2.f86323l.b(null)).intValue();
    }

    public static final long o() {
        return ((Long) C11245d2.f86274S.b(null)).longValue();
    }

    public static final long p() {
        return ((Long) C11245d2.f86264N.b(null)).longValue();
    }

    private final String q(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            com.google.android.gms.common.internal.r.l(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f85708a.a().m().b("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.f85708a.a().m().b("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.f85708a.a().m().b("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.f85708a.a().m().b("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List I(java.lang.String r4) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.r.f(r4)
            android.os.Bundle r0 = r3.G()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.X2 r4 = r3.f85708a
            com.google.android.gms.measurement.internal.q2 r4 = r4.a()
            com.google.android.gms.measurement.internal.o2 r4 = r4.m()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.X2 r0 = r3.f85708a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.zzaY()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.X2 r0 = r3.f85708a
            com.google.android.gms.measurement.internal.q2 r0 = r0.a()
            com.google.android.gms.measurement.internal.o2 r0 = r0.m()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11312m.I(java.lang.String):java.util.List");
    }

    public final boolean J() {
        this.f85708a.c();
        Boolean boolH = H("firebase_analytics_collection_deactivated");
        return boolH != null && boolH.booleanValue();
    }

    public final boolean K() {
        Boolean boolH = H("google_analytics_adid_collection_enabled");
        return boolH == null || boolH.booleanValue();
    }

    public final boolean L() {
        Boolean boolH = H("google_analytics_automatic_screen_reporting_enabled");
        return boolH == null || boolH.booleanValue();
    }

    public final boolean N() {
        Boolean boolH = H("google_analytics_sgtm_upload_enabled");
        if (boolH == null) {
            return false;
        }
        return boolH.booleanValue();
    }

    public final String g() {
        return q("debug.firebase.analytics.app", "");
    }

    public final String h() {
        return q("debug.deferred.deeplink", "");
    }

    public final boolean i(String str) {
        return "1".equals(this.f86518d.d(str, "gaia_collection_enabled"));
    }

    public final boolean j(String str) {
        return "1".equals(this.f86518d.d(str, "measurement.event_sampling_enabled"));
    }

    final boolean k() {
        if (this.f86516b == null) {
            Boolean boolH = H("app_measurement_lite");
            this.f86516b = boolH;
            if (boolH == null) {
                this.f86516b = Boolean.FALSE;
            }
        }
        return this.f86516b.booleanValue() || !this.f85708a.E();
    }

    final String s() {
        this.f85708a.c();
        return "FA";
    }

    public final int t() {
        return this.f85708a.A().T(201500000, true) ? 100 : 25;
    }

    public final int u(String str) {
        return D(str, C11245d2.f86286Y, 25, 100);
    }

    final int v(String str, boolean z10) {
        return z10 ? D(str, C11245d2.f86315i0, 100, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR) : HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
    }

    final int x(String str) {
        return D(str, C11245d2.f86284X, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, 2000);
    }

    public final long y() {
        this.f85708a.c();
        return 133005L;
    }

    public final boolean z() {
        if (this.f86519e == null) {
            synchronized (this) {
                try {
                    if (this.f86519e == null) {
                        X2 x22 = this.f85708a;
                        ApplicationInfo applicationInfo = x22.zzaY().getApplicationInfo();
                        String strA = com.google.android.gms.common.util.p.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(strA)) {
                                z10 = true;
                            }
                            this.f86519e = Boolean.valueOf(z10);
                        }
                        if (this.f86519e == null) {
                            this.f86519e = Boolean.TRUE;
                            x22.a().m().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f86519e.booleanValue();
    }

    C11312m(X2 x22) {
        super(x22);
        this.f86518d = C11298k.f86490a;
    }

    public final String A(String str, C11237c2 c11237c2) {
        if (TextUtils.isEmpty(str)) {
            return (String) c11237c2.b(null);
        }
        return (String) c11237c2.b(this.f86518d.d(str, c11237c2.a()));
    }

    public final long B(String str, C11237c2 c11237c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c11237c2.b(null)).longValue();
        }
        String strD = this.f86518d.d(str, c11237c2.a());
        if (TextUtils.isEmpty(strD)) {
            return ((Long) c11237c2.b(null)).longValue();
        }
        try {
            return ((Long) c11237c2.b(Long.valueOf(Long.parseLong(strD)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c11237c2.b(null)).longValue();
        }
    }

    public final int C(String str, C11237c2 c11237c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c11237c2.b(null)).intValue();
        }
        String strD = this.f86518d.d(str, c11237c2.a());
        if (TextUtils.isEmpty(strD)) {
            return ((Integer) c11237c2.b(null)).intValue();
        }
        try {
            return ((Integer) c11237c2.b(Integer.valueOf(Integer.parseInt(strD)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c11237c2.b(null)).intValue();
        }
    }

    public final int D(String str, C11237c2 c11237c2, int i10, int i11) {
        return Math.max(Math.min(C(str, c11237c2), i11), i10);
    }

    public final double E(String str, C11237c2 c11237c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c11237c2.b(null)).doubleValue();
        }
        String strD = this.f86518d.d(str, c11237c2.a());
        if (TextUtils.isEmpty(strD)) {
            return ((Double) c11237c2.b(null)).doubleValue();
        }
        try {
            return ((Double) c11237c2.b(Double.valueOf(Double.parseDouble(strD)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c11237c2.b(null)).doubleValue();
        }
    }

    public final boolean F(String str, C11237c2 c11237c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c11237c2.b(null)).booleanValue();
        }
        String strD = this.f86518d.d(str, c11237c2.a());
        if (TextUtils.isEmpty(strD)) {
            return ((Boolean) c11237c2.b(null)).booleanValue();
        }
        return ((Boolean) c11237c2.b(Boolean.valueOf("1".equals(strD)))).booleanValue();
    }

    final Boolean H(String str) {
        com.google.android.gms.common.internal.r.f(str);
        Bundle bundleG = G();
        if (bundleG == null) {
            this.f85708a.a().m().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!bundleG.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(bundleG.getBoolean(str));
    }

    public final Qd.u M(String str, boolean z10) {
        Object obj;
        com.google.android.gms.common.internal.r.f(str);
        X2 x22 = this.f85708a;
        Bundle bundleG = G();
        if (bundleG == null) {
            x22.a().m().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleG.get(str);
        }
        if (obj == null) {
            return Qd.u.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return Qd.u.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return Qd.u.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return Qd.u.POLICY;
        }
        x22.a().p().b("Invalid manifest metadata for", str);
        return Qd.u.UNINITIALIZED;
    }

    final int w(String str, boolean z10) {
        return Math.max(v(str, z10), 256);
    }
}
