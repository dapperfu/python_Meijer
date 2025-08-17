package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class W6 {

    /* renamed from: c, reason: collision with root package name */
    static final W6 f82933c;

    /* renamed from: d, reason: collision with root package name */
    static final W6 f82934d;

    /* renamed from: a, reason: collision with root package name */
    final boolean f82935a;

    /* renamed from: b, reason: collision with root package name */
    final Throwable f82936b;

    W6(boolean z10, Throwable th2) {
        this.f82935a = z10;
        this.f82936b = th2;
    }

    static {
        if (U6.f82903d) {
            f82934d = null;
            f82933c = null;
        } else {
            f82934d = new W6(false, null);
            f82933c = new W6(true, null);
        }
    }
}
