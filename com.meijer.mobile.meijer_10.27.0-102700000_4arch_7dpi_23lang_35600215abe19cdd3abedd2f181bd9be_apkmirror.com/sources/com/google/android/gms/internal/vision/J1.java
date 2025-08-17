package com.google.android.gms.internal.vision;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
final class J1 {

    /* renamed from: c, reason: collision with root package name */
    private static final J1 f84382c = new J1();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, O1<?>> f84384b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Q1 f84383a = new C11057n1();

    public static J1 a() {
        return f84382c;
    }

    public final <T> O1<T> b(Class<T> cls) {
        S0.f(cls, "messageType");
        O1<T> o1Zza = (O1) this.f84384b.get(cls);
        if (o1Zza == null) {
            o1Zza = this.f84383a.zza(cls);
            S0.f(cls, "messageType");
            S0.f(o1Zza, "schema");
            O1<T> o12 = (O1) this.f84384b.putIfAbsent(cls, o1Zza);
            if (o12 != null) {
                return o12;
            }
        }
        return o1Zza;
    }

    private J1() {
    }

    public final <T> O1<T> c(T t10) {
        return b(t10.getClass());
    }
}
