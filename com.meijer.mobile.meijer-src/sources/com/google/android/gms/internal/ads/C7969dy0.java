package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* renamed from: com.google.android.gms.internal.ads.dy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7969dy0 {

    /* renamed from: a, reason: collision with root package name */
    final LinkedHashMap f74567a;

    final C7969dy0 a(Object obj, InterfaceC9464ry0 interfaceC9464ry0) {
        C9358qy0.a(obj, "key");
        C9358qy0.a(interfaceC9464ry0, "provider");
        this.f74567a.put(obj, interfaceC9464ry0);
        return this;
    }

    C7969dy0(int i10) {
        this.f74567a = C8183fy0.b(i10);
    }
}
