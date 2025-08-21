package com.google.android.gms.internal.pal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.pal.x5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11090x5 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f85041a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f85042b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    static final AtomicBoolean f85043c = new AtomicBoolean();

    static InterfaceC11058v5 a() {
        return (InterfaceC11058v5) f85041a.get();
    }

    static InterfaceC11074w5 b() {
        return (InterfaceC11074w5) f85042b.get();
    }

    public static void c(InterfaceC11058v5 interfaceC11058v5) {
        f85041a.set(interfaceC11058v5);
    }
}
