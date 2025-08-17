package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* renamed from: com.google.android.gms.internal.ads.dy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7844dy0 {

    /* renamed from: a, reason: collision with root package name */
    final LinkedHashMap f73727a;

    final C7844dy0 a(Object obj, InterfaceC9339ry0 interfaceC9339ry0) {
        C9233qy0.a(obj, "key");
        C9233qy0.a(interfaceC9339ry0, "provider");
        this.f73727a.put(obj, interfaceC9339ry0);
        return this;
    }

    C7844dy0(int i10) {
        this.f73727a = C8058fy0.b(i10);
    }
}
