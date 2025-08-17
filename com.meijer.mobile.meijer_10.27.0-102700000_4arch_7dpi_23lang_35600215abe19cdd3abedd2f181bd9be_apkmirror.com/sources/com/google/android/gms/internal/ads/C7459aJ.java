package com.google.android.gms.internal.ads;

import Pc.C4562d;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.aJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7459aJ {

    /* renamed from: a, reason: collision with root package name */
    private final C9812wN f72398a;

    C7459aJ(C9812wN c9812wN) {
        this.f72398a = c9812wN;
    }

    public final void a(View view, Z50 z50) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76053Lc)).booleanValue() || view == null) {
            return;
        }
        String str = true != C4562d.a(view) ? "0" : "1";
        C9705vN c9705vNA = this.f72398a.a();
        c9705vNA.b("action", "hcp");
        c9705vNA.b("hcp", str);
        c9705vNA.c(z50);
        c9705vNA.g();
    }
}
