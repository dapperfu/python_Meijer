package com.google.android.gms.internal.atv_ads_framework;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10395x1 {

    /* renamed from: c, reason: collision with root package name */
    private static final C10395x1 f81916c = new C10395x1();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f81918b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final A1 f81917a = new C10348h1();

    public static C10395x1 a() {
        return f81916c;
    }

    public final InterfaceC10401z1 b(Class cls) {
        S0.c(cls, "messageType");
        InterfaceC10401z1 interfaceC10401z1 = (InterfaceC10401z1) this.f81918b.get(cls);
        if (interfaceC10401z1 != null) {
            return interfaceC10401z1;
        }
        InterfaceC10401z1 interfaceC10401z1Zza = this.f81917a.zza(cls);
        S0.c(cls, "messageType");
        S0.c(interfaceC10401z1Zza, "schema");
        InterfaceC10401z1 interfaceC10401z12 = (InterfaceC10401z1) this.f81918b.putIfAbsent(cls, interfaceC10401z1Zza);
        return interfaceC10401z12 == null ? interfaceC10401z1Zza : interfaceC10401z12;
    }

    private C10395x1() {
    }
}
