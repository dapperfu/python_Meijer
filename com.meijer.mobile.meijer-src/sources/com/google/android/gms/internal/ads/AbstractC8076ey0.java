package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ey0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC8076ey0 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f74802a;

    final Map a() {
        return this.f74802a;
    }

    AbstractC8076ey0(Map map) {
        this.f74802a = Collections.unmodifiableMap(map);
    }
}
