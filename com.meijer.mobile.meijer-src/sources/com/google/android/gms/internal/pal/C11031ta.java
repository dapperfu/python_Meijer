package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.ta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11031ta {

    /* renamed from: a, reason: collision with root package name */
    private final Map f84891a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f84892b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f84893c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f84894d;

    public C11031ta() {
        this.f84891a = new HashMap();
        this.f84892b = new HashMap();
        this.f84893c = new HashMap();
        this.f84894d = new HashMap();
    }

    public final C11031ta a(R9 r92) throws GeneralSecurityException {
        C11063va c11063va = new C11063va(r92.d(), r92.c(), null);
        if (!this.f84892b.containsKey(c11063va)) {
            this.f84892b.put(c11063va, r92);
            return this;
        }
        R9 r93 = (R9) this.f84892b.get(c11063va);
        if (r93.equals(r92) && r92.equals(r93)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c11063va.toString()));
    }

    public final C11031ta b(U9 u92) throws GeneralSecurityException {
        C11095xa c11095xa = new C11095xa(u92.a(), u92.b(), null);
        if (!this.f84891a.containsKey(c11095xa)) {
            this.f84891a.put(c11095xa, u92);
            return this;
        }
        U9 u93 = (U9) this.f84891a.get(c11095xa);
        if (u93.equals(u92) && u92.equals(u93)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c11095xa.toString()));
    }

    public final C11031ta c(C10888ka c10888ka) throws GeneralSecurityException {
        C11063va c11063va = new C11063va(c10888ka.b(), c10888ka.a(), null);
        if (!this.f84894d.containsKey(c11063va)) {
            this.f84894d.put(c11063va, c10888ka);
            return this;
        }
        C10888ka c10888ka2 = (C10888ka) this.f84894d.get(c11063va);
        if (c10888ka2.equals(c10888ka) && c10888ka.equals(c10888ka2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c11063va.toString()));
    }

    public final C11031ta d(C10936na c10936na) throws GeneralSecurityException {
        C11095xa c11095xa = new C11095xa(c10936na.a(), c10936na.b(), null);
        if (!this.f84893c.containsKey(c11095xa)) {
            this.f84893c.put(c11095xa, c10936na);
            return this;
        }
        C10936na c10936na2 = (C10936na) this.f84893c.get(c11095xa);
        if (c10936na2.equals(c10936na) && c10936na.equals(c10936na2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c11095xa.toString()));
    }

    public C11031ta(Aa aa2) {
        this.f84891a = new HashMap(aa2.f83320a);
        this.f84892b = new HashMap(aa2.f83321b);
        this.f84893c = new HashMap(aa2.f83322c);
        this.f84894d = new HashMap(aa2.f83323d);
    }
}
