package com.google.android.gms.internal.pal;

import java.util.Collection;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class V7 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f83762a;

    /* renamed from: b, reason: collision with root package name */
    private final O7 f83763b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f83764c;

    /* renamed from: d, reason: collision with root package name */
    private final C10724ab f83765d;

    /* synthetic */ V7(ConcurrentMap concurrentMap, O7 o72, C10724ab c10724ab, Class cls, U7 u72) {
        this.f83762a = concurrentMap;
        this.f83763b = o72;
        this.f83764c = cls;
        this.f83765d = c10724ab;
    }

    public final O7 a() {
        return this.f83763b;
    }

    public final C10724ab b() {
        return this.f83765d;
    }

    public final Class c() {
        return this.f83764c;
    }

    public final Collection d() {
        return this.f83762a.values();
    }

    public final boolean e() {
        return !this.f83765d.a().isEmpty();
    }
}
