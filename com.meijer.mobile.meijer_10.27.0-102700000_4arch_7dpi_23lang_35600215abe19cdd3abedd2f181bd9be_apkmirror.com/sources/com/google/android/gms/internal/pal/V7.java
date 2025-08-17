package com.google.android.gms.internal.pal;

import java.util.Collection;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class V7 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f82922a;

    /* renamed from: b, reason: collision with root package name */
    private final O7 f82923b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f82924c;

    /* renamed from: d, reason: collision with root package name */
    private final C10599ab f82925d;

    /* synthetic */ V7(ConcurrentMap concurrentMap, O7 o72, C10599ab c10599ab, Class cls, U7 u72) {
        this.f82922a = concurrentMap;
        this.f82923b = o72;
        this.f82924c = cls;
        this.f82925d = c10599ab;
    }

    public final O7 a() {
        return this.f82923b;
    }

    public final C10599ab b() {
        return this.f82925d;
    }

    public final Class c() {
        return this.f82924c;
    }

    public final Collection d() {
        return this.f82922a.values();
    }

    public final boolean e() {
        return !this.f82925d.a().isEmpty();
    }
}
