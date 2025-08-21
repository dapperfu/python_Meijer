package com.google.android.gms.internal.ads;

import Rc.C5185e;
import android.content.Context;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7106Mw implements InterfaceC9994ww {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69602a;

    /* renamed from: b, reason: collision with root package name */
    private final Rc.r0 f69603b = Nc.v.s().j();

    public C7106Mw(Context context) {
        this.f69602a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9994ww
    public final void a(Map map) throws IOException {
        String str;
        if (!map.isEmpty() && (str = (String) map.get("gad_idless")) != null) {
            Rc.r0 r0Var = this.f69603b;
            boolean z10 = Boolean.parseBoolean(str);
            r0Var.x(z10);
            if (z10) {
                C5185e.c(this.f69602a);
            }
        }
    }
}
