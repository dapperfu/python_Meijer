package com.google.android.gms.measurement.internal;

import qd.C16518e;
import qd.C16519f;

/* loaded from: classes6.dex */
public final class H2 {

    /* renamed from: a, reason: collision with root package name */
    final X2 f85045a;

    H2(q6 q6Var) {
        this.f85045a = q6Var.e0();
    }

    final boolean a() {
        try {
            X2 x22 = this.f85045a;
            C16518e c16518eA = C16519f.a(x22.zzaY());
            if (c16518eA != null) {
                return c16518eA.f("com.android.vending", 128).versionCode >= 80837300;
            }
            x22.a().u().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f85045a.a().u().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
