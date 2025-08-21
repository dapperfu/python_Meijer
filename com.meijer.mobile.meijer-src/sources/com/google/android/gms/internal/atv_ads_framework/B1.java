package com.google.android.gms.internal.atv_ads_framework;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.IOException;
import rc.AbstractC16884d;
import rc.C16883c;
import rc.InterfaceC16888h;
import rc.InterfaceC16890j;

/* loaded from: classes6.dex */
public final class B1 {

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static B1 f81576c;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC16890j f81577a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f81578b;

    public static synchronized B1 a(Context context) {
        try {
            if (f81576c == null) {
                tc.u.f(context.getApplicationContext());
                f81576c = new B1(context.getApplicationContext(), tc.u.c().h(com.google.android.datatransport.cct.a.f65256g));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f81576c;
    }

    private final void d(C10334d c10334d) {
        this.f81577a.a("TV_ADS_LIB", C10334d.class, C16883c.b("proto"), new InterfaceC16888h() { // from class: com.google.android.gms.internal.atv_ads_framework.a1
            @Override // rc.InterfaceC16888h
            public final Object apply(Object obj) {
                C10334d c10334d2 = (C10334d) obj;
                try {
                    int iZzn = c10334d2.zzn();
                    byte[] bArr = new byte[iZzn];
                    AbstractC10394x0 abstractC10394x0A = AbstractC10394x0.A(bArr, 0, iZzn);
                    c10334d2.a(abstractC10394x0A);
                    abstractC10394x0A.a();
                    return bArr;
                } catch (IOException e10) {
                    throw new RuntimeException("Serializing " + c10334d2.getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
                }
            }
        }).b(AbstractC16884d.f(c10334d));
    }

    public final void b(p2 p2Var) {
        C10331c c10331cB = C10337e.b(this.f81578b);
        c10331cB.i(p2Var);
        d((C10334d) c10331cB.c());
    }

    public final void c(C10327b c10327b) {
        C10331c c10331cB = C10337e.b(this.f81578b);
        c10331cB.m(c10327b);
        d((C10334d) c10331cB.c());
    }

    private B1(Context context, InterfaceC16890j interfaceC16890j) {
        context.getClass();
        this.f81578b = context;
        interfaceC16890j.getClass();
        this.f81577a = interfaceC16890j;
    }
}
