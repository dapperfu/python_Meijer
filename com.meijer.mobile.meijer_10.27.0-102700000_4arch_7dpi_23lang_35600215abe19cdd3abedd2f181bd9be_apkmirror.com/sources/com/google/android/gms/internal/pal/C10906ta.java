package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.ta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10906ta {

    /* renamed from: a, reason: collision with root package name */
    private final Map f84051a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f84052b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f84053c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f84054d;

    public C10906ta() {
        this.f84051a = new HashMap();
        this.f84052b = new HashMap();
        this.f84053c = new HashMap();
        this.f84054d = new HashMap();
    }

    public final C10906ta a(R9 r92) throws GeneralSecurityException {
        C10938va c10938va = new C10938va(r92.d(), r92.c(), null);
        if (!this.f84052b.containsKey(c10938va)) {
            this.f84052b.put(c10938va, r92);
            return this;
        }
        R9 r93 = (R9) this.f84052b.get(c10938va);
        if (r93.equals(r92) && r92.equals(r93)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c10938va.toString()));
    }

    public final C10906ta b(U9 u92) throws GeneralSecurityException {
        C10970xa c10970xa = new C10970xa(u92.a(), u92.b(), null);
        if (!this.f84051a.containsKey(c10970xa)) {
            this.f84051a.put(c10970xa, u92);
            return this;
        }
        U9 u93 = (U9) this.f84051a.get(c10970xa);
        if (u93.equals(u92) && u92.equals(u93)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c10970xa.toString()));
    }

    public final C10906ta c(C10763ka c10763ka) throws GeneralSecurityException {
        C10938va c10938va = new C10938va(c10763ka.b(), c10763ka.a(), null);
        if (!this.f84054d.containsKey(c10938va)) {
            this.f84054d.put(c10938va, c10763ka);
            return this;
        }
        C10763ka c10763ka2 = (C10763ka) this.f84054d.get(c10938va);
        if (c10763ka2.equals(c10763ka) && c10763ka.equals(c10763ka2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c10938va.toString()));
    }

    public final C10906ta d(C10811na c10811na) throws GeneralSecurityException {
        C10970xa c10970xa = new C10970xa(c10811na.a(), c10811na.b(), null);
        if (!this.f84053c.containsKey(c10970xa)) {
            this.f84053c.put(c10970xa, c10811na);
            return this;
        }
        C10811na c10811na2 = (C10811na) this.f84053c.get(c10970xa);
        if (c10811na2.equals(c10811na) && c10811na.equals(c10811na2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c10970xa.toString()));
    }

    public C10906ta(Aa aa2) {
        this.f84051a = new HashMap(aa2.f82480a);
        this.f84052b = new HashMap(aa2.f82481b);
        this.f84053c = new HashMap(aa2.f82482c);
        this.f84054d = new HashMap(aa2.f82483d);
    }
}
