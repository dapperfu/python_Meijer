package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C10618p3;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.c6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11241c6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f86230a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f86231b;

    /* renamed from: c, reason: collision with root package name */
    private final Qd.G f86232c;

    /* renamed from: d, reason: collision with root package name */
    private final C10618p3 f86233d;

    public final String a() {
        return this.f86230a;
    }

    public final C10618p3 d() {
        return this.f86233d;
    }

    public final Map b() {
        Map map = this.f86231b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final Qd.G c() {
        return this.f86232c;
    }

    C11241c6(String str, Map map, Qd.G g10, C10618p3 c10618p3) {
        this.f86230a = str;
        this.f86231b = map;
        this.f86232c = g10;
        this.f86233d = c10618p3;
    }
}
