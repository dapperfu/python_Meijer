package com.google.crypto.tink.internal;

import Ne.b;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.internal.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11296e {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f88194c = Logger.getLogger(C11296e.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final C11296e f88195d = new C11296e();

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentMap<String, Ie.k<?>> f88196a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Boolean> f88197b = new ConcurrentHashMap();

    private synchronized Ie.k<?> b(String str) throws GeneralSecurityException {
        if (!this.f88196a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return this.f88196a.get(str);
    }

    private synchronized void e(Ie.k<?> kVar, boolean z10, boolean z11) throws GeneralSecurityException {
        try {
            String strC = kVar.c();
            if (z11 && this.f88197b.containsKey(strC) && !this.f88197b.get(strC).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strC);
            }
            Ie.k<?> kVar2 = this.f88196a.get(strC);
            if (kVar2 != null && !kVar2.getClass().equals(kVar.getClass())) {
                f88194c.warning("Attempted overwrite of a registered key manager for key type " + strC);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strC, kVar2.getClass().getName(), kVar.getClass().getName()));
            }
            if (z10) {
                this.f88196a.put(strC, kVar);
            } else {
                this.f88196a.putIfAbsent(strC, kVar);
            }
            this.f88197b.put(strC, Boolean.valueOf(z11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized <P> void g(Ie.k<P> kVar, boolean z10) throws GeneralSecurityException {
        h(kVar, b.EnumC0342b.f21529a, z10);
    }

    public synchronized <P> void h(Ie.k<P> kVar, b.EnumC0342b enumC0342b, boolean z10) throws GeneralSecurityException {
        if (!enumC0342b.a()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(kVar, false, z10);
    }

    public static C11296e d() {
        return f88195d;
    }

    public boolean f(String str) {
        return this.f88197b.get(str).booleanValue();
    }

    public <P> Ie.k<P> a(String str, Class<P> cls) throws GeneralSecurityException {
        Ie.k<P> kVar = (Ie.k<P>) b(str);
        if (kVar.a().equals(cls)) {
            return kVar;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + kVar.getClass() + ", which only supports: " + kVar.a());
    }

    public Ie.k<?> c(String str) throws GeneralSecurityException {
        return b(str);
    }
}
