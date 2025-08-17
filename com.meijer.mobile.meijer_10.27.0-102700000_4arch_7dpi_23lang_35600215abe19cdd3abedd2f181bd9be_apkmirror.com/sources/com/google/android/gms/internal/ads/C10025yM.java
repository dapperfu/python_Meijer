package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.yM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10025yM {

    /* renamed from: a, reason: collision with root package name */
    private int f80209a;

    /* renamed from: b, reason: collision with root package name */
    private int f80210b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f80211c;

    /* renamed from: d, reason: collision with root package name */
    private int f80212d;

    public final void c() {
        this.f80209a = 0;
        this.f80210b = 0;
    }

    public final boolean d() {
        return this.f80210b == 0;
    }

    public final long a() {
        if (this.f80210b != 0) {
            return this.f80211c[this.f80209a];
        }
        throw new NoSuchElementException();
    }

    public final long b() {
        int i10 = this.f80210b;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f80211c;
        int i11 = this.f80209a;
        long j10 = jArr[i11];
        this.f80209a = this.f80212d & (i11 + 1);
        this.f80210b = i10 - 1;
        return j10;
    }

    public C10025yM(int i10) {
        int i11 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        this.f80209a = 0;
        this.f80210b = 0;
        this.f80211c = new long[i11];
        this.f80212d = r3.length - 1;
    }
}
