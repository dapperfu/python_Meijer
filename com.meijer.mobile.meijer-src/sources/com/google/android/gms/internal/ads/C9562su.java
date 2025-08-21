package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.su, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9562su {

    /* renamed from: a, reason: collision with root package name */
    private final Sc.a f79153a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f79154b;

    /* renamed from: c, reason: collision with root package name */
    private final long f79155c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference f79156d;

    /* synthetic */ C9562su(C9242pu c9242pu, C9349qu c9349qu) {
        this.f79153a = c9242pu.f78492a;
        this.f79154b = c9242pu.f78493b;
        this.f79156d = c9242pu.f78495d;
        this.f79155c = c9242pu.f78494c;
    }

    final long a() {
        return this.f79155c;
    }

    final Context b() {
        return this.f79154b;
    }

    final C6885Gg d() {
        return new C6885Gg(this.f79154b);
    }

    final WeakReference g() {
        return this.f79156d;
    }

    public final Nc.k c() {
        return new Nc.k(this.f79154b, this.f79153a);
    }

    final Sc.a e() {
        return this.f79153a;
    }

    final String f() {
        return Nc.v.t().H(this.f79154b, this.f79153a.f34479a);
    }
}
