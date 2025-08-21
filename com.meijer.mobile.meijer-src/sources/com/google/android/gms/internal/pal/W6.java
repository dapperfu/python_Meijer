package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class W6 {

    /* renamed from: c, reason: collision with root package name */
    static final W6 f83773c;

    /* renamed from: d, reason: collision with root package name */
    static final W6 f83774d;

    /* renamed from: a, reason: collision with root package name */
    final boolean f83775a;

    /* renamed from: b, reason: collision with root package name */
    final Throwable f83776b;

    W6(boolean z10, Throwable th2) {
        this.f83775a = z10;
        this.f83776b = th2;
    }

    static {
        if (U6.f83743d) {
            f83774d = null;
            f83773c = null;
        } else {
            f83774d = new W6(false, null);
            f83773c = new W6(true, null);
        }
    }
}
