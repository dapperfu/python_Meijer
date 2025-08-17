package com.google.android.gms.internal.atv_ads_framework;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10270x1 {

    /* renamed from: c, reason: collision with root package name */
    private static final C10270x1 f81076c = new C10270x1();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f81078b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final A1 f81077a = new C10223h1();

    public static C10270x1 a() {
        return f81076c;
    }

    public final InterfaceC10276z1 b(Class cls) {
        S0.c(cls, "messageType");
        InterfaceC10276z1 interfaceC10276z1 = (InterfaceC10276z1) this.f81078b.get(cls);
        if (interfaceC10276z1 != null) {
            return interfaceC10276z1;
        }
        InterfaceC10276z1 interfaceC10276z1Zza = this.f81077a.zza(cls);
        S0.c(cls, "messageType");
        S0.c(interfaceC10276z1Zza, "schema");
        InterfaceC10276z1 interfaceC10276z12 = (InterfaceC10276z1) this.f81078b.putIfAbsent(cls, interfaceC10276z1Zza);
        return interfaceC10276z12 == null ? interfaceC10276z1Zza : interfaceC10276z12;
    }

    private C10270x1() {
    }
}
