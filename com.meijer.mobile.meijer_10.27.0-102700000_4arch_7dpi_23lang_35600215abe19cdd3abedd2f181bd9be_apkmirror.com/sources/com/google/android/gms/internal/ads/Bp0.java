package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Bp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f65585a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f65586b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f65587c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f65588d;

    public Bp0() {
        this.f65585a = new HashMap();
        this.f65586b = new HashMap();
        this.f65587c = new HashMap();
        this.f65588d = new HashMap();
    }

    public final Bp0 a(AbstractC9213qo0 abstractC9213qo0) throws GeneralSecurityException {
        Cp0 cp0 = new Cp0(abstractC9213qo0.d(), abstractC9213qo0.c(), null);
        if (!this.f65586b.containsKey(cp0)) {
            this.f65586b.put(cp0, abstractC9213qo0);
            return this;
        }
        AbstractC9213qo0 abstractC9213qo02 = (AbstractC9213qo0) this.f65586b.get(cp0);
        if (abstractC9213qo02.equals(abstractC9213qo0) && abstractC9213qo0.equals(abstractC9213qo02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(cp0.toString()));
    }

    public final Bp0 b(AbstractC9640uo0 abstractC9640uo0) throws GeneralSecurityException {
        Dp0 dp0 = new Dp0(abstractC9640uo0.c(), abstractC9640uo0.d(), null);
        if (!this.f65585a.containsKey(dp0)) {
            this.f65585a.put(dp0, abstractC9640uo0);
            return this;
        }
        AbstractC9640uo0 abstractC9640uo02 = (AbstractC9640uo0) this.f65585a.get(dp0);
        if (abstractC9640uo02.equals(abstractC9640uo0) && abstractC9640uo0.equals(abstractC9640uo02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(dp0.toString()));
    }

    public final Bp0 c(AbstractC7720cp0 abstractC7720cp0) throws GeneralSecurityException {
        Cp0 cp0 = new Cp0(abstractC7720cp0.d(), abstractC7720cp0.c(), null);
        if (!this.f65588d.containsKey(cp0)) {
            this.f65588d.put(cp0, abstractC7720cp0);
            return this;
        }
        AbstractC7720cp0 abstractC7720cp02 = (AbstractC7720cp0) this.f65588d.get(cp0);
        if (abstractC7720cp02.equals(abstractC7720cp0) && abstractC7720cp0.equals(abstractC7720cp02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(cp0.toString()));
    }

    public final Bp0 d(AbstractC8147gp0 abstractC8147gp0) throws GeneralSecurityException {
        Dp0 dp0 = new Dp0(abstractC8147gp0.c(), abstractC8147gp0.d(), null);
        if (!this.f65587c.containsKey(dp0)) {
            this.f65587c.put(dp0, abstractC8147gp0);
            return this;
        }
        AbstractC8147gp0 abstractC8147gp02 = (AbstractC8147gp0) this.f65587c.get(dp0);
        if (abstractC8147gp02.equals(abstractC8147gp0) && abstractC8147gp0.equals(abstractC8147gp02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(dp0.toString()));
    }

    public Bp0(Fp0 fp0) {
        this.f65585a = new HashMap(fp0.f66865a);
        this.f65586b = new HashMap(fp0.f66866b);
        this.f65587c = new HashMap(fp0.f66867c);
        this.f65588d = new HashMap(fp0.f66868d);
    }
}
