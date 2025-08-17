package com.google.android.gms.internal.pal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.pal.x5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10965x5 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f84201a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f84202b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    static final AtomicBoolean f84203c = new AtomicBoolean();

    static InterfaceC10933v5 a() {
        return (InterfaceC10933v5) f84201a.get();
    }

    static InterfaceC10949w5 b() {
        return (InterfaceC10949w5) f84202b.get();
    }

    public static void c(InterfaceC10933v5 interfaceC10933v5) {
        f84201a.set(interfaceC10933v5);
    }
}
