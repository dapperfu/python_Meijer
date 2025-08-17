package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C10493p3;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.c6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11116c6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f85390a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f85391b;

    /* renamed from: c, reason: collision with root package name */
    private final Od.G f85392c;

    /* renamed from: d, reason: collision with root package name */
    private final C10493p3 f85393d;

    public final String a() {
        return this.f85390a;
    }

    public final C10493p3 d() {
        return this.f85393d;
    }

    public final Map b() {
        Map map = this.f85391b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final Od.G c() {
        return this.f85392c;
    }

    C11116c6(String str, Map map, Od.G g10, C10493p3 c10493p3) {
        this.f85390a = str;
        this.f85391b = map;
        this.f85392c = g10;
        this.f85393d = c10493p3;
    }
}
