package com.google.android.gms.internal.atv_ads_framework;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.IOException;
import pc.AbstractC16280d;
import pc.C16279c;
import pc.InterfaceC16284h;
import pc.InterfaceC16286j;

/* loaded from: classes6.dex */
public final class B1 {

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static B1 f80736c;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC16286j f80737a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f80738b;

    public static synchronized B1 a(Context context) {
        try {
            if (f80736c == null) {
                rc.u.f(context.getApplicationContext());
                f80736c = new B1(context.getApplicationContext(), rc.u.c().h(com.google.android.datatransport.cct.a.f64416g));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f80736c;
    }

    private final void d(C10209d c10209d) {
        this.f80737a.a("TV_ADS_LIB", C10209d.class, C16279c.b("proto"), new InterfaceC16284h() { // from class: com.google.android.gms.internal.atv_ads_framework.a1
            @Override // pc.InterfaceC16284h
            public final Object apply(Object obj) {
                C10209d c10209d2 = (C10209d) obj;
                try {
                    int iZzn = c10209d2.zzn();
                    byte[] bArr = new byte[iZzn];
                    AbstractC10269x0 abstractC10269x0A = AbstractC10269x0.A(bArr, 0, iZzn);
                    c10209d2.a(abstractC10269x0A);
                    abstractC10269x0A.a();
                    return bArr;
                } catch (IOException e10) {
                    throw new RuntimeException("Serializing " + c10209d2.getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
                }
            }
        }).a(AbstractC16280d.f(c10209d));
    }

    public final void b(p2 p2Var) {
        C10206c c10206cB = C10212e.b(this.f80738b);
        c10206cB.i(p2Var);
        d((C10209d) c10206cB.c());
    }

    public final void c(C10202b c10202b) {
        C10206c c10206cB = C10212e.b(this.f80738b);
        c10206cB.m(c10202b);
        d((C10209d) c10206cB.c());
    }

    private B1(Context context, InterfaceC16286j interfaceC16286j) {
        context.getClass();
        this.f80738b = context;
        interfaceC16286j.getClass();
        this.f80737a = interfaceC16286j;
    }
}
