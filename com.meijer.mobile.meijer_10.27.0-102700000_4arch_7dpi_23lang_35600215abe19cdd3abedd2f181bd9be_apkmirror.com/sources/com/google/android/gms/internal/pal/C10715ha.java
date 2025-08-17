package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.pal.ha, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10715ha {

    /* renamed from: b, reason: collision with root package name */
    private static final C10715ha f83155b = new C10715ha();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f83156a = new AtomicReference(new Aa(new C10906ta(), null));

    public static C10715ha b() {
        return f83155b;
    }

    public final synchronized void c(R9 r92) throws GeneralSecurityException {
        C10906ta c10906ta = new C10906ta((Aa) this.f83156a.get());
        c10906ta.a(r92);
        this.f83156a.set(new Aa(c10906ta, null));
    }

    public final synchronized void d(U9 u92) throws GeneralSecurityException {
        C10906ta c10906ta = new C10906ta((Aa) this.f83156a.get());
        c10906ta.b(u92);
        this.f83156a.set(new Aa(c10906ta, null));
    }

    public final synchronized void e(C10763ka c10763ka) throws GeneralSecurityException {
        C10906ta c10906ta = new C10906ta((Aa) this.f83156a.get());
        c10906ta.c(c10763ka);
        this.f83156a.set(new Aa(c10906ta, null));
    }

    public final synchronized void f(C10811na c10811na) throws GeneralSecurityException {
        C10906ta c10906ta = new C10906ta((Aa) this.f83156a.get());
        c10906ta.d(c10811na);
        this.f83156a.set(new Aa(c10906ta, null));
    }

    public final AbstractC10903t7 a(C10859qa c10859qa, C10596a8 c10596a8) {
        try {
            try {
                return ((Aa) this.f83156a.get()).a(c10859qa, c10596a8);
            } catch (GeneralSecurityException e10) {
                throw new zzqc("Creating a LegacyProtoKey failed", e10);
            }
        } catch (GeneralSecurityException unused) {
            return new C10598aa(c10859qa, c10596a8);
        }
    }
}
