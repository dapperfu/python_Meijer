package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Bp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f66425a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f66426b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f66427c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f66428d;

    public Bp0() {
        this.f66425a = new HashMap();
        this.f66426b = new HashMap();
        this.f66427c = new HashMap();
        this.f66428d = new HashMap();
    }

    public final Bp0 a(AbstractC9338qo0 abstractC9338qo0) throws GeneralSecurityException {
        Cp0 cp0 = new Cp0(abstractC9338qo0.d(), abstractC9338qo0.c(), null);
        if (!this.f66426b.containsKey(cp0)) {
            this.f66426b.put(cp0, abstractC9338qo0);
            return this;
        }
        AbstractC9338qo0 abstractC9338qo02 = (AbstractC9338qo0) this.f66426b.get(cp0);
        if (abstractC9338qo02.equals(abstractC9338qo0) && abstractC9338qo0.equals(abstractC9338qo02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(cp0.toString()));
    }

    public final Bp0 b(AbstractC9765uo0 abstractC9765uo0) throws GeneralSecurityException {
        Dp0 dp0 = new Dp0(abstractC9765uo0.c(), abstractC9765uo0.d(), null);
        if (!this.f66425a.containsKey(dp0)) {
            this.f66425a.put(dp0, abstractC9765uo0);
            return this;
        }
        AbstractC9765uo0 abstractC9765uo02 = (AbstractC9765uo0) this.f66425a.get(dp0);
        if (abstractC9765uo02.equals(abstractC9765uo0) && abstractC9765uo0.equals(abstractC9765uo02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(dp0.toString()));
    }

    public final Bp0 c(AbstractC7845cp0 abstractC7845cp0) throws GeneralSecurityException {
        Cp0 cp0 = new Cp0(abstractC7845cp0.d(), abstractC7845cp0.c(), null);
        if (!this.f66428d.containsKey(cp0)) {
            this.f66428d.put(cp0, abstractC7845cp0);
            return this;
        }
        AbstractC7845cp0 abstractC7845cp02 = (AbstractC7845cp0) this.f66428d.get(cp0);
        if (abstractC7845cp02.equals(abstractC7845cp0) && abstractC7845cp0.equals(abstractC7845cp02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(cp0.toString()));
    }

    public final Bp0 d(AbstractC8272gp0 abstractC8272gp0) throws GeneralSecurityException {
        Dp0 dp0 = new Dp0(abstractC8272gp0.c(), abstractC8272gp0.d(), null);
        if (!this.f66427c.containsKey(dp0)) {
            this.f66427c.put(dp0, abstractC8272gp0);
            return this;
        }
        AbstractC8272gp0 abstractC8272gp02 = (AbstractC8272gp0) this.f66427c.get(dp0);
        if (abstractC8272gp02.equals(abstractC8272gp0) && abstractC8272gp0.equals(abstractC8272gp02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(dp0.toString()));
    }

    public Bp0(Fp0 fp0) {
        this.f66425a = new HashMap(fp0.f67705a);
        this.f66426b = new HashMap(fp0.f67706b);
        this.f66427c = new HashMap(fp0.f67707c);
        this.f66428d = new HashMap(fp0.f67708d);
    }
}
