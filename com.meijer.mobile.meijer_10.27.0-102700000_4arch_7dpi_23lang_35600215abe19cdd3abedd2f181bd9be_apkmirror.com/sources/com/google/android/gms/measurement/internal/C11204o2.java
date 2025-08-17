package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.o2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11204o2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f85729a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f85730b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f85731c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11218q2 f85732d;

    public final void a(String str) {
        this.f85732d.w(this.f85729a, this.f85730b, this.f85731c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f85732d.w(this.f85729a, this.f85730b, this.f85731c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f85732d.w(this.f85729a, this.f85730b, this.f85731c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f85732d.w(this.f85729a, this.f85730b, this.f85731c, str, obj, obj2, obj3);
    }

    C11204o2(C11218q2 c11218q2, int i10, boolean z10, boolean z11) {
        Objects.requireNonNull(c11218q2);
        this.f85732d = c11218q2;
        this.f85729a = i10;
        this.f85730b = z10;
        this.f85731c = z11;
    }
}
