package Ke;

import com.google.crypto.tink.internal.C11421e;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes8.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f16577a = Logger.getLogger(A.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, Object> f16578b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Set<Class<?>> f16579c = Collections.unmodifiableSet(a());

    private static Set<Class<?>> a() {
        HashSet hashSet = new HashSet();
        hashSet.add(InterfaceC3886a.class);
        hashSet.add(InterfaceC3891f.class);
        hashSet.add(D.class);
        hashSet.add(h.class);
        hashSet.add(g.class);
        hashSet.add(w.class);
        hashSet.add(Ve.a.class);
        hashSet.add(y.class);
        hashSet.add(z.class);
        return hashSet;
    }

    private A() {
    }

    public static Class<?> b(Class<?> cls) {
        try {
            return com.google.crypto.tink.internal.t.c().a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P c(We.y yVar, Class<P> cls) throws GeneralSecurityException {
        return (P) d(yVar.d0(), yVar.e0(), cls);
    }

    public static <P> P d(String str, AbstractC11437h abstractC11437h, Class<P> cls) throws GeneralSecurityException {
        return C11421e.d().a(str, cls).d(abstractC11437h);
    }

    public static <B, P> P e(com.google.crypto.tink.internal.D<B> d10, Class<P> cls) throws GeneralSecurityException {
        return (P) com.google.crypto.tink.internal.t.c().f(d10, cls);
    }
}
