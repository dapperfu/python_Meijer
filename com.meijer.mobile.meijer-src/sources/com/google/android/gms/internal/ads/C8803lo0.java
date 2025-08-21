package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.lo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8803lo0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f77494c = Logger.getLogger(C8803lo0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final C8803lo0 f77495d = new C8803lo0();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f77496a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f77497b = new ConcurrentHashMap();

    public static C8803lo0 c() {
        return f77495d;
    }

    private final synchronized Dk0 g(String str) throws GeneralSecurityException {
        if (!this.f77496a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (Dk0) this.f77496a.get(str);
    }

    private final synchronized void h(Dk0 dk0, boolean z10, boolean z11) throws GeneralSecurityException {
        try {
            String str = ((C9872vo0) dk0).f79969a;
            if (this.f77497b.containsKey(str) && !((Boolean) this.f77497b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            Dk0 dk02 = (Dk0) this.f77496a.get(str);
            if (dk02 != null && !dk02.getClass().equals(dk0.getClass())) {
                f77494c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, dk02.getClass().getName(), dk0.getClass().getName()));
            }
            this.f77496a.putIfAbsent(str, dk0);
            this.f77497b.put(str, Boolean.TRUE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(Dk0 dk0, boolean z10) throws GeneralSecurityException {
        f(dk0, 1, true);
    }

    public final synchronized void f(Dk0 dk0, int i10, boolean z10) throws GeneralSecurityException {
        if (!C8056eo0.a(i10)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        h(dk0, false, true);
    }

    public final boolean e(String str) {
        return ((Boolean) this.f77497b.get(str)).booleanValue();
    }

    public final Dk0 a(String str, Class cls) throws GeneralSecurityException {
        Dk0 dk0G = g(str);
        if (dk0G.zzb().equals(cls)) {
            return dk0G;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(dk0G.getClass()) + ", which only supports: " + dk0G.zzb().toString());
    }

    public final Dk0 b(String str) throws GeneralSecurityException {
        return g(str);
    }
}
