package com.google.android.gms.internal.ads;

import Pc.C4564e;
import android.content.Context;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6981Mw implements InterfaceC9869ww {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68762a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.r0 f68763b = Lc.v.s().j();

    public C6981Mw(Context context) {
        this.f68762a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9869ww
    public final void a(Map map) throws IOException {
        String str;
        if (!map.isEmpty() && (str = (String) map.get("gad_idless")) != null) {
            Pc.r0 r0Var = this.f68763b;
            boolean z10 = Boolean.parseBoolean(str);
            r0Var.x(z10);
            if (z10) {
                C4564e.c(this.f68762a);
            }
        }
    }
}
