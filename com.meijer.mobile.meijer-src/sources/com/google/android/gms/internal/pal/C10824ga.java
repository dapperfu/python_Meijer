package com.google.android.gms.internal.pal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.pal.ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10824ga {

    /* renamed from: b, reason: collision with root package name */
    private static final C10824ga f83978b = new C10824ga();

    /* renamed from: c, reason: collision with root package name */
    private static final C10808fa f83979c = new C10808fa(null);

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f83980a = new AtomicReference();

    public static C10824ga a() {
        return f83978b;
    }

    public final InterfaceC10758cb b() {
        InterfaceC10758cb interfaceC10758cb = (InterfaceC10758cb) this.f83980a.get();
        return interfaceC10758cb == null ? f83979c : interfaceC10758cb;
    }
}
