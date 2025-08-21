package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.o2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11329o2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f86569a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f86570b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f86571c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11343q2 f86572d;

    public final void a(String str) {
        this.f86572d.w(this.f86569a, this.f86570b, this.f86571c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f86572d.w(this.f86569a, this.f86570b, this.f86571c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f86572d.w(this.f86569a, this.f86570b, this.f86571c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f86572d.w(this.f86569a, this.f86570b, this.f86571c, str, obj, obj2, obj3);
    }

    C11329o2(C11343q2 c11343q2, int i10, boolean z10, boolean z11) {
        Objects.requireNonNull(c11343q2);
        this.f86572d = c11343q2;
        this.f86569a = i10;
        this.f86570b = z10;
        this.f86571c = z11;
    }
}
