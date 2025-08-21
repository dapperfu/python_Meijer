package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9660tp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f79471a;

    /* renamed from: b, reason: collision with root package name */
    private final C9446rp0 f79472b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f79473c;

    /* renamed from: d, reason: collision with root package name */
    private final Bo0 f79474d;

    /* synthetic */ C9660tp0(Map map, List list, C9446rp0 c9446rp0, Bo0 bo0, Class cls, C9553sp0 c9553sp0) {
        this.f79471a = map;
        this.f79472b = c9446rp0;
        this.f79473c = cls;
        this.f79474d = bo0;
    }

    public final Bo0 a() {
        return this.f79474d;
    }

    public final C9446rp0 c() {
        return this.f79472b;
    }

    public final Class d() {
        return this.f79473c;
    }

    public static C9340qp0 b(Class cls) {
        return new C9340qp0(cls, null);
    }

    public final Collection e() {
        return this.f79471a.values();
    }

    public final List f(byte[] bArr) {
        List list = (List) this.f79471a.get(Et0.b(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public final boolean g() {
        return !this.f79474d.a().isEmpty();
    }
}
