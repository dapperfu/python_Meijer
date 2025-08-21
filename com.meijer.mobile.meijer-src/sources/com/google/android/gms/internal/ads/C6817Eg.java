package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Eg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6817Eg {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f67335a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f67336b = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static InterfaceC6749Cg a() {
        return (InterfaceC6749Cg) f67335a.get();
    }

    static InterfaceC6783Dg b() {
        return (InterfaceC6783Dg) f67336b.get();
    }

    public static void c(InterfaceC6749Cg interfaceC6749Cg) {
        f67335a.set(interfaceC6749Cg);
    }
}
