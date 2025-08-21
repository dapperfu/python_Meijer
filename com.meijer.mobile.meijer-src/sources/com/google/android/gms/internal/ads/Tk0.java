package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class Tk0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f71287a = 0;

    private Tk0() {
    }

    static {
        Logger.getLogger(Tk0.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(InterfaceC9543sk0.class);
        hashSet.add(InterfaceC10185yk0.class);
        hashSet.add(Vk0.class);
        hashSet.add(Ak0.class);
        hashSet.add(InterfaceC10292zk0.class);
        hashSet.add(Pk0.class);
        hashSet.add(Lq0.class);
        hashSet.add(Rk0.class);
        hashSet.add(Sk0.class);
        Collections.unmodifiableSet(hashSet);
    }

    public static Class a(Class cls) {
        try {
            return Uo0.a().b(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object b(Zr0 zr0, Class cls) throws GeneralSecurityException {
        String strG0 = zr0.g0();
        return C8803lo0.c().a(strG0, cls).b(zr0.f0());
    }
}
