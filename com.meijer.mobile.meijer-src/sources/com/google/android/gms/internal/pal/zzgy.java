package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class zzgy extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f85096a;

    public final int a() {
        return this.f85096a;
    }

    public zzgy(int i10) {
        super("Signal SDK error code: " + i10);
        this.f85096a = i10;
    }
}
