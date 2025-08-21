package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Tk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7332Tk {

    /* renamed from: a, reason: collision with root package name */
    private final Object f71283a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f71284b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private C7943dl f71285c;

    /* renamed from: d, reason: collision with root package name */
    private C7943dl f71286d;

    public final C7943dl a(Context context, Sc.a aVar, Z80 z80) {
        C7943dl c7943dl;
        synchronized (this.f71283a) {
            try {
                if (this.f71285c == null) {
                    this.f71285c = new C7943dl(c(context), aVar, (String) Oc.A.c().a(C8784lf.f77089a), z80);
                }
                c7943dl = this.f71285c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7943dl;
    }

    public final C7943dl b(Context context, Sc.a aVar, Z80 z80) {
        C7943dl c7943dl;
        synchronized (this.f71284b) {
            try {
                if (this.f71286d == null) {
                    this.f71286d = new C7943dl(c(context), aVar, (String) C9962wg.f80356a.e(), z80);
                }
                c7943dl = this.f71286d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7943dl;
    }

    private static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }
}
