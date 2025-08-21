package com.google.android.gms.internal.ads;

import Rc.C5183d;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.aJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7584aJ {

    /* renamed from: a, reason: collision with root package name */
    private final C9937wN f73238a;

    C7584aJ(C9937wN c9937wN) {
        this.f73238a = c9937wN;
    }

    public final void a(View view, Z50 z50) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f76893Lc)).booleanValue() || view == null) {
            return;
        }
        String str = true != C5183d.a(view) ? "0" : "1";
        C9830vN c9830vNA = this.f73238a.a();
        c9830vNA.b("action", "hcp");
        c9830vNA.b("hcp", str);
        c9830vNA.c(z50);
        c9830vNA.g();
    }
}
