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
    private static final Logger f83021a = Logger.getLogger(Z7.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f83022b = new AtomicReference(new B7());

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap f83023c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f83024d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap f83025e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap f83026f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private static final ConcurrentMap f83027g = new ConcurrentHashMap();

    private Z7() {
    }

    @Deprecated
    public static InterfaceC10792m7 a(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentMap concurrentMap = f83025e;
        Locale locale = Locale.US;
        InterfaceC10792m7 interfaceC10792m7 = (InterfaceC10792m7) concurrentMap.get(str.toLowerCase(locale));
        if (interfaceC10792m7 != null) {
            return interfaceC10792m7;
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

    public static InterfaceC10919u7 b(String str) throws GeneralSecurityException {
        return ((B7) f83022b.get()).b(str);
    }

    public static synchronized C10877rd c(C10957wd c10957wd) throws GeneralSecurityException {
        InterfaceC10919u7 interfaceC10919u7B;
        interfaceC10919u7B = b(c10957wd.y());
        if (!((Boolean) f83024d.get(c10957wd.y())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(c10957wd.y())));
        }
        return interfaceC10919u7B.c(c10957wd.w());
    }

    public static synchronized InterfaceC10690g1 d(C10957wd c10957wd) throws GeneralSecurityException {
        InterfaceC10919u7 interfaceC10919u7B;
        interfaceC10919u7B = b(c10957wd.y());
        if (!((Boolean) f83024d.get(c10957wd.y())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(c10957wd.y())));
        }
        return interfaceC10919u7B.d(c10957wd.w());
    }

    public static Class e(Class cls) {
        W7 w72 = (W7) f83026f.get(cls);
        if (w72 == null) {
            return null;
        }
        return w72.zza();
    }

    public static Object g(String str, AbstractC10605b0 abstractC10605b0, Class cls) throws GeneralSecurityException {
        return ((B7) f83022b.get()).a(str, cls).a(abstractC10605b0);
    }

    public static Object h(String str, InterfaceC10690g1 interfaceC10690g1, Class cls) throws GeneralSecurityException {
        return ((B7) f83022b.get()).a(str, cls).b(interfaceC10690g1);
    }

    public static Object j(V7 v72, Class cls) throws GeneralSecurityException {
        W7 w72 = (W7) f83026f.get(cls);
        if (w72 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(v72.c().getName()));
        }
        if (w72.zza().equals(v72.c())) {
            return w72.a(v72);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + w72.zza().toString() + ", got " + v72.c().toString());
    }

    static synchronized Map k() {
        return Collections.unmodifiableMap(f83027g);
    }

    public static synchronized void l(AbstractC10843pa abstractC10843pa, Y9 y92, boolean z10) throws GeneralSecurityException {
        try {
            AtomicReference atomicReference = f83022b;
            B7 b72 = new B7((B7) atomicReference.get());
            b72.c(abstractC10843pa, y92);
            String strD = abstractC10843pa.d();
            String strD2 = y92.d();
            p(strD, abstractC10843pa.a().c(), true);
            p(strD2, Collections.EMPTY_MAP, false);
            if (!((B7) atomicReference.get()).f(strD)) {
                f83023c.put(strD, new Y7(abstractC10843pa));
                q(abstractC10843pa.d(), abstractC10843pa.a().c());
            }
            ConcurrentMap concurrentMap = f83024d;
            concurrentMap.put(strD, Boolean.TRUE);
            concurrentMap.put(strD2, Boolean.FALSE);
            atomicReference.set(b72);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void m(InterfaceC10919u7 interfaceC10919u7, boolean z10) throws GeneralSecurityException {
        if (interfaceC10919u7 == null) {
            throw new IllegalArgumentException("key manager must be non-null.");
        }
        AtomicReference atomicReference = f83022b;
        B7 b72 = new B7((B7) atomicReference.get());
        b72.d(interfaceC10919u7);
        if (!W8.a(1)) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        String strZzf = interfaceC10919u7.zzf();
        p(strZzf, Collections.EMPTY_MAP, z10);
        f83024d.put(strZzf, Boolean.valueOf(z10));
        atomicReference.set(b72);
    }

    public static synchronized void n(Y9 y92, boolean z10) throws GeneralSecurityException {
        try {
            AtomicReference atomicReference = f83022b;
            B7 b72 = new B7((B7) atomicReference.get());
            b72.e(y92);
            String strD = y92.d();
            p(strD, y92.a().c(), true);
            if (!((B7) atomicReference.get()).f(strD)) {
                f83023c.put(strD, new Y7(y92));
                q(strD, y92.a().c());
            }
            f83024d.put(strD, Boolean.TRUE);
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
            ConcurrentMap concurrentMap = f83026f;
            if (concurrentMap.containsKey(clsZzb)) {
                W7 w73 = (W7) concurrentMap.get(clsZzb);
                if (!w72.getClass().getName().equals(w73.getClass().getName())) {
                    f83021a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(clsZzb.toString()));
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
                ConcurrentMap concurrentMap = f83024d;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((B7) f83022b.get()).f(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f83027g.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f83027g.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Object f(C10877rd c10877rd, Class cls) throws GeneralSecurityException {
        return g(c10877rd.z(), c10877rd.y(), cls);
    }

    public static Object i(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return g(str, AbstractC10605b0.s(bArr), cls);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.pal.g1, java.lang.Object] */
    private static void q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f83027g.put((String) entry.getKey(), D7.d(str, ((V9) entry.getValue()).f82927a.i(), ((V9) entry.getValue()).f82928b));
        }
    }
}
