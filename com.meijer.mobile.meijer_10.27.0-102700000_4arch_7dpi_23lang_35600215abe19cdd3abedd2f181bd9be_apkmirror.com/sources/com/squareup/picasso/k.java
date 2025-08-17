package com.squareup.picasso;

/* loaded from: classes11.dex */
public enum k {
    NO_CACHE(1),
    NO_STORE(2);


    /* renamed from: a, reason: collision with root package name */
    final int f126538a;

    static boolean a(int i10) {
        return (i10 & NO_CACHE.f126538a) == 0;
    }

    static boolean b(int i10) {
        return (i10 & NO_STORE.f126538a) == 0;
    }

    k(int i10) {
        this.f126538a = i10;
    }
}
