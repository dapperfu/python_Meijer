package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.gV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8111gV {

    /* renamed from: a, reason: collision with root package name */
    private final M60 f74320a;

    /* renamed from: b, reason: collision with root package name */
    private final C8209hM f74321b;

    /* renamed from: c, reason: collision with root package name */
    private final C9812wN f74322c;

    public C8111gV(M60 m60, C8209hM c8209hM, C9812wN c9812wN) {
        this.f74320a = m60;
        this.f74321b = c8209hM;
        this.f74322c = c9812wN;
    }

    public final void a(C7648c60 c7648c60, Z50 z50, int i10, zzeda zzedaVar, long j10) {
        C8102gM c8102gMA;
        C9705vN c9705vNA = this.f74322c.a();
        c9705vNA.d(c7648c60);
        c9705vNA.c(z50);
        c9705vNA.b("action", "adapter_status");
        c9705vNA.b("adapter_l", String.valueOf(j10));
        c9705vNA.b("sc", Integer.toString(i10));
        if (zzedaVar != null) {
            c9705vNA.b("arec", Integer.toString(zzedaVar.b().f19159a));
            String strA = this.f74320a.a(zzedaVar.getMessage());
            if (strA != null) {
                c9705vNA.b("areec", strA);
            }
        }
        C8209hM c8209hM = this.f74321b;
        Iterator it = z50.f72059t.iterator();
        while (true) {
            if (!it.hasNext()) {
                c8102gMA = null;
                break;
            } else {
                c8102gMA = c8209hM.a((String) it.next());
                if (c8102gMA != null) {
                    break;
                }
            }
        }
        if (c8102gMA != null) {
            c9705vNA.b("ancn", c8102gMA.f74301a);
            C7005Nm c7005Nm = c8102gMA.f74302b;
            if (c7005Nm != null) {
                c9705vNA.b("adapter_v", c7005Nm.toString());
            }
            C7005Nm c7005Nm2 = c8102gMA.f74303c;
            if (c7005Nm2 != null) {
                c9705vNA.b("adapter_sv", c7005Nm2.toString());
            }
        }
        c9705vNA.g();
    }
}
