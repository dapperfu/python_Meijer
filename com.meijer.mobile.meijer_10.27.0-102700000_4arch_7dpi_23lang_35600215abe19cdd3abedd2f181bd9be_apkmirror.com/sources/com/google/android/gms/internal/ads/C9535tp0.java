package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9535tp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f78631a;

    /* renamed from: b, reason: collision with root package name */
    private final C9321rp0 f78632b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f78633c;

    /* renamed from: d, reason: collision with root package name */
    private final Bo0 f78634d;

    /* synthetic */ C9535tp0(Map map, List list, C9321rp0 c9321rp0, Bo0 bo0, Class cls, C9428sp0 c9428sp0) {
        this.f78631a = map;
        this.f78632b = c9321rp0;
        this.f78633c = cls;
        this.f78634d = bo0;
    }

    public final Bo0 a() {
        return this.f78634d;
    }

    public final C9321rp0 c() {
        return this.f78632b;
    }

    public final Class d() {
        return this.f78633c;
    }

    public static C9215qp0 b(Class cls) {
        return new C9215qp0(cls, null);
    }

    public final Collection e() {
        return this.f78631a.values();
    }

    public final List f(byte[] bArr) {
        List list = (List) this.f78631a.get(Et0.b(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public final boolean g() {
        return !this.f78634d.a().isEmpty();
    }
}
