package com.google.android.gms.internal.ads;

import Oc.C4447y;
import android.content.Context;

/* loaded from: classes6.dex */
public final class R60 {
    public static void a(Context context, boolean z10) {
        if (z10) {
            Sc.p.f("This request is sent from a test device.");
            return;
        }
        C4447y.b();
        Sc.p.f("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + Sc.g.A(context) + "\")) to get test ads on this device.");
    }

    public static void b(int i10, Throwable th2, String str) {
        Sc.p.f("Ad failed to load : " + i10);
        Rc.p0.l(str, th2);
        if (i10 == 3) {
            return;
        }
        Nc.v.s().w(th2, str);
    }
}
