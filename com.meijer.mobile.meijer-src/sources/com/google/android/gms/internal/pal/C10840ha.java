package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.pal.ha, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10840ha {

    /* renamed from: b, reason: collision with root package name */
    private static final C10840ha f83995b = new C10840ha();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f83996a = new AtomicReference(new Aa(new C11031ta(), null));

    public static C10840ha b() {
        return f83995b;
    }

    public final synchronized void c(R9 r92) throws GeneralSecurityException {
        C11031ta c11031ta = new C11031ta((Aa) this.f83996a.get());
        c11031ta.a(r92);
        this.f83996a.set(new Aa(c11031ta, null));
    }

    public final synchronized void d(U9 u92) throws GeneralSecurityException {
        C11031ta c11031ta = new C11031ta((Aa) this.f83996a.get());
        c11031ta.b(u92);
        this.f83996a.set(new Aa(c11031ta, null));
    }

    public final synchronized void e(C10888ka c10888ka) throws GeneralSecurityException {
        C11031ta c11031ta = new C11031ta((Aa) this.f83996a.get());
        c11031ta.c(c10888ka);
        this.f83996a.set(new Aa(c11031ta, null));
    }

    public final synchronized void f(C10936na c10936na) throws GeneralSecurityException {
        C11031ta c11031ta = new C11031ta((Aa) this.f83996a.get());
        c11031ta.d(c10936na);
        this.f83996a.set(new Aa(c11031ta, null));
    }

    public final AbstractC11028t7 a(C10984qa c10984qa, C10721a8 c10721a8) {
        try {
            try {
                return ((Aa) this.f83996a.get()).a(c10984qa, c10721a8);
            } catch (GeneralSecurityException e10) {
                throw new zzqc("Creating a LegacyProtoKey failed", e10);
            }
        } catch (GeneralSecurityException unused) {
            return new C10723aa(c10984qa, c10721a8);
        }
    }
}
