package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Fp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f67705a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f67706b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f67707c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f67708d;

    public final Ck0 a(Ap0 ap0, Uk0 uk0) throws GeneralSecurityException {
        Cp0 cp0 = new Cp0(ap0.getClass(), ap0.zzd(), null);
        if (this.f67706b.containsKey(cp0)) {
            return ((AbstractC9338qo0) this.f67706b.get(cp0)).a(ap0, uk0);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cp0.toString() + " available");
    }

    public final Qk0 b(Ap0 ap0) throws GeneralSecurityException {
        Cp0 cp0 = new Cp0(ap0.getClass(), ap0.zzd(), null);
        if (this.f67708d.containsKey(cp0)) {
            return ((AbstractC7845cp0) this.f67708d.get(cp0)).a(ap0);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + cp0.toString() + " available");
    }

    public final Ap0 c(Ck0 ck0, Class cls, Uk0 uk0) throws GeneralSecurityException {
        Dp0 dp0 = new Dp0(ck0.getClass(), cls, null);
        if (this.f67705a.containsKey(dp0)) {
            return ((AbstractC9765uo0) this.f67705a.get(dp0)).a(ck0, uk0);
        }
        throw new GeneralSecurityException("No Key serializer for " + dp0.toString() + " available");
    }

    public final Ap0 d(Qk0 qk0, Class cls) throws GeneralSecurityException {
        Dp0 dp0 = new Dp0(qk0.getClass(), cls, null);
        if (this.f67707c.containsKey(dp0)) {
            return ((AbstractC8272gp0) this.f67707c.get(dp0)).a(qk0);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + dp0.toString() + " available");
    }

    public final boolean i(Ap0 ap0) {
        return this.f67706b.containsKey(new Cp0(ap0.getClass(), ap0.zzd(), null));
    }

    public final boolean j(Ap0 ap0) {
        return this.f67708d.containsKey(new Cp0(ap0.getClass(), ap0.zzd(), null));
    }

    /* synthetic */ Fp0(Bp0 bp0, Ep0 ep0) {
        this.f67705a = new HashMap(bp0.f66425a);
        this.f67706b = new HashMap(bp0.f66426b);
        this.f67707c = new HashMap(bp0.f66427c);
        this.f67708d = new HashMap(bp0.f66428d);
    }
}
