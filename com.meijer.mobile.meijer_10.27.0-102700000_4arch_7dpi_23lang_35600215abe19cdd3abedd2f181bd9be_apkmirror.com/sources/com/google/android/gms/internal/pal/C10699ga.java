package com.google.android.gms.internal.pal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.pal.ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10699ga {

    /* renamed from: b, reason: collision with root package name */
    private static final C10699ga f83138b = new C10699ga();

    /* renamed from: c, reason: collision with root package name */
    private static final C10683fa f83139c = new C10683fa(null);

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f83140a = new AtomicReference();

    public static C10699ga a() {
        return f83138b;
    }

    public final InterfaceC10633cb b() {
        InterfaceC10633cb interfaceC10633cb = (InterfaceC10633cb) this.f83140a.get();
        return interfaceC10633cb == null ? f83139c : interfaceC10633cb;
    }
}
