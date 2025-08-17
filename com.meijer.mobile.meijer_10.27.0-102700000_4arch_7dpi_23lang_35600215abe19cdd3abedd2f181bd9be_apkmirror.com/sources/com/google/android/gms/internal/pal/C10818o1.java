package com.google.android.gms.internal.pal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.pal.o1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10818o1 {

    /* renamed from: c, reason: collision with root package name */
    private static final C10818o1 f83253c = new C10818o1();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f83255b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10897t1 f83254a = new X0();

    public static C10818o1 a() {
        return f83253c;
    }

    public final InterfaceC10881s1 b(Class cls) {
        J0.f(cls, "messageType");
        InterfaceC10881s1 interfaceC10881s1 = (InterfaceC10881s1) this.f83255b.get(cls);
        if (interfaceC10881s1 != null) {
            return interfaceC10881s1;
        }
        InterfaceC10881s1 interfaceC10881s1Zza = this.f83254a.zza(cls);
        J0.f(cls, "messageType");
        J0.f(interfaceC10881s1Zza, "schema");
        InterfaceC10881s1 interfaceC10881s12 = (InterfaceC10881s1) this.f83255b.putIfAbsent(cls, interfaceC10881s1Zza);
        return interfaceC10881s12 == null ? interfaceC10881s1Zza : interfaceC10881s12;
    }

    private C10818o1() {
    }
}
