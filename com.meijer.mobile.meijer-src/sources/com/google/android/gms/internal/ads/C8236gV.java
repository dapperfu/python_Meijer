package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.gV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8236gV {

    /* renamed from: a, reason: collision with root package name */
    private final M60 f75160a;

    /* renamed from: b, reason: collision with root package name */
    private final C8334hM f75161b;

    /* renamed from: c, reason: collision with root package name */
    private final C9937wN f75162c;

    public C8236gV(M60 m60, C8334hM c8334hM, C9937wN c9937wN) {
        this.f75160a = m60;
        this.f75161b = c8334hM;
        this.f75162c = c9937wN;
    }

    public final void a(C7773c60 c7773c60, Z50 z50, int i10, zzeda zzedaVar, long j10) {
        C8227gM c8227gMA;
        C9830vN c9830vNA = this.f75162c.a();
        c9830vNA.d(c7773c60);
        c9830vNA.c(z50);
        c9830vNA.b("action", "adapter_status");
        c9830vNA.b("adapter_l", String.valueOf(j10));
        c9830vNA.b("sc", Integer.toString(i10));
        if (zzedaVar != null) {
            c9830vNA.b("arec", Integer.toString(zzedaVar.b().f23346a));
            String strA = this.f75160a.a(zzedaVar.getMessage());
            if (strA != null) {
                c9830vNA.b("areec", strA);
            }
        }
        C8334hM c8334hM = this.f75161b;
        Iterator it = z50.f72899t.iterator();
        while (true) {
            if (!it.hasNext()) {
                c8227gMA = null;
                break;
            } else {
                c8227gMA = c8334hM.a((String) it.next());
                if (c8227gMA != null) {
                    break;
                }
            }
        }
        if (c8227gMA != null) {
            c9830vNA.b("ancn", c8227gMA.f75141a);
            C7130Nm c7130Nm = c8227gMA.f75142b;
            if (c7130Nm != null) {
                c9830vNA.b("adapter_v", c7130Nm.toString());
            }
            C7130Nm c7130Nm2 = c8227gMA.f75143c;
            if (c7130Nm2 != null) {
                c9830vNA.b("adapter_sv", c7130Nm2.toString());
            }
        }
        c9830vNA.g();
    }
}
