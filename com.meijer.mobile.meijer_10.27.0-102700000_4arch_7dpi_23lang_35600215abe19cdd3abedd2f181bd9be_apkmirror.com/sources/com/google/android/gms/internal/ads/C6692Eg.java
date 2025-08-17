package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Eg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6692Eg {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f66495a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f66496b = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static InterfaceC6624Cg a() {
        return (InterfaceC6624Cg) f66495a.get();
    }

    static InterfaceC6658Dg b() {
        return (InterfaceC6658Dg) f66496b.get();
    }

    public static void c(InterfaceC6624Cg interfaceC6624Cg) {
        f66495a.set(interfaceC6624Cg);
    }
}
