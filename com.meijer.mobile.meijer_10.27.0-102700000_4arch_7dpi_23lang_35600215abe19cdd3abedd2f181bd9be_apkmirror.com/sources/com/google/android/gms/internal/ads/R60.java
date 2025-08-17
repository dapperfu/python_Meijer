package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.content.Context;

/* loaded from: classes6.dex */
public final class R60 {
    public static void a(Context context, boolean z10) {
        if (z10) {
            Qc.p.f("This request is sent from a test device.");
            return;
        }
        C4169y.b();
        Qc.p.f("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + Qc.g.A(context) + "\")) to get test ads on this device.");
    }

    public static void b(int i10, Throwable th2, String str) {
        Qc.p.f("Ad failed to load : " + i10);
        Pc.p0.l(str, th2);
        if (i10 == 3) {
            return;
        }
        Lc.v.s().w(th2, str);
    }
}
