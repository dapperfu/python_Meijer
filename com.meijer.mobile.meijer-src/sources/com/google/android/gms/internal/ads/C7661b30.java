package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.b30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7661b30 {

    /* renamed from: a, reason: collision with root package name */
    private final C9978wo f73542a;

    /* renamed from: b, reason: collision with root package name */
    private final int f73543b;

    public C7661b30(C9978wo c9978wo, int i10) {
        this.f73542a = c9978wo;
        this.f73543b = i10;
    }

    public final int a() {
        return this.f73543b;
    }

    public final PackageInfo b() {
        return this.f73542a.f80371f;
    }

    public final String c() {
        return this.f73542a.f80369d;
    }

    public final String d() {
        return C7392Vf0.c(this.f73542a.f80366a.getString("ms"));
    }

    public final String e() {
        return this.f73542a.f80373h;
    }

    public final List f() {
        return this.f73542a.f80370e;
    }

    final boolean g() {
        return this.f73542a.f80377l;
    }

    final boolean h() {
        return this.f73542a.f80366a.getBoolean("is_gbid");
    }

    final boolean i() {
        return this.f73542a.f80376k;
    }
}
