package com.google.android.gms.internal.pal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.pal.o1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10943o1 {

    /* renamed from: c, reason: collision with root package name */
    private static final C10943o1 f84093c = new C10943o1();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f84095b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC11022t1 f84094a = new X0();

    public static C10943o1 a() {
        return f84093c;
    }

    public final InterfaceC11006s1 b(Class cls) {
        J0.f(cls, "messageType");
        InterfaceC11006s1 interfaceC11006s1 = (InterfaceC11006s1) this.f84095b.get(cls);
        if (interfaceC11006s1 != null) {
            return interfaceC11006s1;
        }
        InterfaceC11006s1 interfaceC11006s1Zza = this.f84094a.zza(cls);
        J0.f(cls, "messageType");
        J0.f(interfaceC11006s1Zza, "schema");
        InterfaceC11006s1 interfaceC11006s12 = (InterfaceC11006s1) this.f84095b.putIfAbsent(cls, interfaceC11006s1Zza);
        return interfaceC11006s12 == null ? interfaceC11006s1Zza : interfaceC11006s12;
    }

    private C10943o1() {
    }
}
