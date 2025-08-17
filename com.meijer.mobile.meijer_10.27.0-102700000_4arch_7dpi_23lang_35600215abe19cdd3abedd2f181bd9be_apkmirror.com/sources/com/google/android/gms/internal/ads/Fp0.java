package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Fp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f66865a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f66866b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f66867c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f66868d;

    public final Ck0 a(Ap0 ap0, Uk0 uk0) throws GeneralSecurityException {
        Cp0 cp0 = new Cp0(ap0.getClass(), ap0.zzd(), null);
        if (this.f66866b.containsKey(cp0)) {
            return ((AbstractC9213qo0) this.f66866b.get(cp0)).a(ap0, uk0);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cp0.toString() + " available");
    }

    public final Qk0 b(Ap0 ap0) throws GeneralSecurityException {
        Cp0 cp0 = new Cp0(ap0.getClass(), ap0.zzd(), null);
        if (this.f66868d.containsKey(cp0)) {
            return ((AbstractC7720cp0) this.f66868d.get(cp0)).a(ap0);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + cp0.toString() + " available");
    }

    public final Ap0 c(Ck0 ck0, Class cls, Uk0 uk0) throws GeneralSecurityException {
        Dp0 dp0 = new Dp0(ck0.getClass(), cls, null);
        if (this.f66865a.containsKey(dp0)) {
            return ((AbstractC9640uo0) this.f66865a.get(dp0)).a(ck0, uk0);
        }
        throw new GeneralSecurityException("No Key serializer for " + dp0.toString() + " available");
    }

    public final Ap0 d(Qk0 qk0, Class cls) throws GeneralSecurityException {
        Dp0 dp0 = new Dp0(qk0.getClass(), cls, null);
        if (this.f66867c.containsKey(dp0)) {
            return ((AbstractC8147gp0) this.f66867c.get(dp0)).a(qk0);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + dp0.toString() + " available");
    }

    public final boolean i(Ap0 ap0) {
        return this.f66866b.containsKey(new Cp0(ap0.getClass(), ap0.zzd(), null));
    }

    public final boolean j(Ap0 ap0) {
        return this.f66868d.containsKey(new Cp0(ap0.getClass(), ap0.zzd(), null));
    }

    /* synthetic */ Fp0(Bp0 bp0, Ep0 ep0) {
        this.f66865a = new HashMap(bp0.f65585a);
        this.f66866b = new HashMap(bp0.f65586b);
        this.f66867c = new HashMap(bp0.f65587c);
        this.f66868d = new HashMap(bp0.f65588d);
    }
}
