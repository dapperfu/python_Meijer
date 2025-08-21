package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class Z7 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f83861a = Logger.getLogger(Z7.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f83862b = new AtomicReference(new B7());

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap f83863c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f83864d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap f83865e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap f83866f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private static final ConcurrentMap f83867g = new ConcurrentHashMap();

    private Z7() {
    }

    @Deprecated
    public static InterfaceC10917m7 a(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentMap concurrentMap = f83865e;
        Locale locale = Locale.US;
        InterfaceC10917m7 interfaceC10917m7 = (InterfaceC10917m7) concurrentMap.get(str.toLowerCase(locale));
        if (interfaceC10917m7 != null) {
            return interfaceC10917m7;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            strConcat = strConcat.concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tink")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(strConcat);
    }

    public static InterfaceC11044u7 b(String str) throws GeneralSecurityException {
        return ((B7) f83862b.get()).b(str);
    }

    public static synchronized C11002rd c(C11082wd c11082wd) throws GeneralSecurityException {
        InterfaceC11044u7 interfaceC11044u7B;
        interfaceC11044u7B = b(c11082wd.y());
        if (!((Boolean) f83864d.get(c11082wd.y())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(c11082wd.y())));
        }
        return interfaceC11044u7B.c(c11082wd.w());
    }

    public static synchronized InterfaceC10815g1 d(C11082wd c11082wd) throws GeneralSecurityException {
        InterfaceC11044u7 interfaceC11044u7B;
        interfaceC11044u7B = b(c11082wd.y());
        if (!((Boolean) f83864d.get(c11082wd.y())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(c11082wd.y())));
        }
        return interfaceC11044u7B.d(c11082wd.w());
    }

    public static Class e(Class cls) {
        W7 w72 = (W7) f83866f.get(cls);
        if (w72 == null) {
            return null;
        }
        return w72.zza();
    }

    public static Object g(String str, AbstractC10730b0 abstractC10730b0, Class cls) throws GeneralSecurityException {
        return ((B7) f83862b.get()).a(str, cls).a(abstractC10730b0);
    }

    public static Object h(String str, InterfaceC10815g1 interfaceC10815g1, Class cls) throws GeneralSecurityException {
        return ((B7) f83862b.get()).a(str, cls).b(interfaceC10815g1);
    }

    public static Object j(V7 v72, Class cls) throws GeneralSecurityException {
        W7 w72 = (W7) f83866f.get(cls);
        if (w72 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(v72.c().getName()));
        }
        if (w72.zza().equals(v72.c())) {
            return w72.a(v72);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + w72.zza().toString() + ", got " + v72.c().toString());
    }

    static synchronized Map k() {
        return Collections.unmodifiableMap(f83867g);
    }

    public static synchronized void l(AbstractC10968pa abstractC10968pa, Y9 y92, boolean z10) throws GeneralSecurityException {
        try {
            AtomicReference atomicReference = f83862b;
            B7 b72 = new B7((B7) atomicReference.get());
            b72.c(abstractC10968pa, y92);
            String strD = abstractC10968pa.d();
            String strD2 = y92.d();
            p(strD, abstractC10968pa.a().c(), true);
            p(strD2, Collections.EMPTY_MAP, false);
            if (!((B7) atomicReference.get()).f(strD)) {
                f83863c.put(strD, new Y7(abstractC10968pa));
                q(abstractC10968pa.d(), abstractC10968pa.a().c());
            }
            ConcurrentMap concurrentMap = f83864d;
            concurrentMap.put(strD, Boolean.TRUE);
            concurrentMap.put(strD2, Boolean.FALSE);
            atomicReference.set(b72);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void m(InterfaceC11044u7 interfaceC11044u7, boolean z10) throws GeneralSecurityException {
        if (interfaceC11044u7 == null) {
            throw new IllegalArgumentException("key manager must be non-null.");
        }
        AtomicReference atomicReference = f83862b;
        B7 b72 = new B7((B7) atomicReference.get());
        b72.d(interfaceC11044u7);
        if (!W8.a(1)) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        String strZzf = interfaceC11044u7.zzf();
        p(strZzf, Collections.EMPTY_MAP, z10);
        f83864d.put(strZzf, Boolean.valueOf(z10));
        atomicReference.set(b72);
    }

    public static synchronized void n(Y9 y92, boolean z10) throws GeneralSecurityException {
        try {
            AtomicReference atomicReference = f83862b;
            B7 b72 = new B7((B7) atomicReference.get());
            b72.e(y92);
            String strD = y92.d();
            p(strD, y92.a().c(), true);
            if (!((B7) atomicReference.get()).f(strD)) {
                f83863c.put(strD, new Y7(y92));
                q(strD, y92.a().c());
            }
            f83864d.put(strD, Boolean.TRUE);
            atomicReference.set(b72);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void o(W7 w72) throws GeneralSecurityException {
        try {
            if (w72 == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class clsZzb = w72.zzb();
            ConcurrentMap concurrentMap = f83866f;
            if (concurrentMap.containsKey(clsZzb)) {
                W7 w73 = (W7) concurrentMap.get(clsZzb);
                if (!w72.getClass().getName().equals(w73.getClass().getName())) {
                    f83861a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(clsZzb.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsZzb.getName(), w73.getClass().getName(), w72.getClass().getName()));
                }
            }
            concurrentMap.put(clsZzb, w72);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static synchronized void p(String str, Map map, boolean z10) throws GeneralSecurityException {
        if (z10) {
            try {
                ConcurrentMap concurrentMap = f83864d;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((B7) f83862b.get()).f(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f83867g.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f83867g.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Object f(C11002rd c11002rd, Class cls) throws GeneralSecurityException {
        return g(c11002rd.z(), c11002rd.y(), cls);
    }

    public static Object i(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return g(str, AbstractC10730b0.s(bArr), cls);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.pal.g1, java.lang.Object] */
    private static void q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f83867g.put((String) entry.getKey(), D7.d(str, ((V9) entry.getValue()).f83767a.i(), ((V9) entry.getValue()).f83768b));
        }
    }
}
