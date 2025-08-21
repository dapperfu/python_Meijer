package com.google.android.gms.measurement.internal;

import sd.C17066e;
import sd.C17067f;

/* loaded from: classes6.dex */
public final class H2 {

    /* renamed from: a, reason: collision with root package name */
    final X2 f85885a;

    H2(q6 q6Var) {
        this.f85885a = q6Var.e0();
    }

    final boolean a() {
        try {
            X2 x22 = this.f85885a;
            C17066e c17066eA = C17067f.a(x22.zzaY());
            if (c17066eA != null) {
                return c17066eA.f("com.android.vending", 128).versionCode >= 80837300;
            }
            x22.a().u().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f85885a.a().u().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
