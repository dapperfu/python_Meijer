package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Tk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7207Tk {

    /* renamed from: a, reason: collision with root package name */
    private final Object f70443a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f70444b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private C7818dl f70445c;

    /* renamed from: d, reason: collision with root package name */
    private C7818dl f70446d;

    public final C7818dl a(Context context, Qc.a aVar, Z80 z80) {
        C7818dl c7818dl;
        synchronized (this.f70443a) {
            try {
                if (this.f70445c == null) {
                    this.f70445c = new C7818dl(c(context), aVar, (String) Mc.A.c().a(C8659lf.f76249a), z80);
                }
                c7818dl = this.f70445c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7818dl;
    }

    public final C7818dl b(Context context, Qc.a aVar, Z80 z80) {
        C7818dl c7818dl;
        synchronized (this.f70444b) {
            try {
                if (this.f70446d == null) {
                    this.f70446d = new C7818dl(c(context), aVar, (String) C9837wg.f79516a.e(), z80);
                }
                c7818dl = this.f70446d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7818dl;
    }

    private static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }
}
