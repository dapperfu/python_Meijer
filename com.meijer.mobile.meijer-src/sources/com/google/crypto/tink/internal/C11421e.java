package com.google.crypto.tink.internal;

import Pe.b;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.internal.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11421e {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f89034c = Logger.getLogger(C11421e.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final C11421e f89035d = new C11421e();

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentMap<String, Ke.k<?>> f89036a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Boolean> f89037b = new ConcurrentHashMap();

    private synchronized Ke.k<?> b(String str) throws GeneralSecurityException {
        if (!this.f89036a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return this.f89036a.get(str);
    }

    private synchronized void e(Ke.k<?> kVar, boolean z10, boolean z11) throws GeneralSecurityException {
        try {
            String strC = kVar.c();
            if (z11 && this.f89037b.containsKey(strC) && !this.f89037b.get(strC).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strC);
            }
            Ke.k<?> kVar2 = this.f89036a.get(strC);
            if (kVar2 != null && !kVar2.getClass().equals(kVar.getClass())) {
                f89034c.warning("Attempted overwrite of a registered key manager for key type " + strC);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strC, kVar2.getClass().getName(), kVar.getClass().getName()));
            }
            if (z10) {
                this.f89036a.put(strC, kVar);
            } else {
                this.f89036a.putIfAbsent(strC, kVar);
            }
            this.f89037b.put(strC, Boolean.valueOf(z11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized <P> void g(Ke.k<P> kVar, boolean z10) throws GeneralSecurityException {
        h(kVar, b.EnumC0429b.f25764a, z10);
    }

    public synchronized <P> void h(Ke.k<P> kVar, b.EnumC0429b enumC0429b, boolean z10) throws GeneralSecurityException {
        if (!enumC0429b.a()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(kVar, false, z10);
    }

    public static C11421e d() {
        return f89035d;
    }

    public boolean f(String str) {
        return this.f89037b.get(str).booleanValue();
    }

    public <P> Ke.k<P> a(String str, Class<P> cls) throws GeneralSecurityException {
        Ke.k<P> kVar = (Ke.k<P>) b(str);
        if (kVar.a().equals(cls)) {
            return kVar;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + kVar.getClass() + ", which only supports: " + kVar.a());
    }

    public Ke.k<?> c(String str) throws GeneralSecurityException {
        return b(str);
    }
}
