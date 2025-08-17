package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ey0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC7951ey0 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f73962a;

    final Map a() {
        return this.f73962a;
    }

    AbstractC7951ey0(Map map) {
        this.f73962a = Collections.unmodifiableMap(map);
    }
}
