package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.yM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10150yM {

    /* renamed from: a, reason: collision with root package name */
    private int f81049a;

    /* renamed from: b, reason: collision with root package name */
    private int f81050b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f81051c;

    /* renamed from: d, reason: collision with root package name */
    private int f81052d;

    public final void c() {
        this.f81049a = 0;
        this.f81050b = 0;
    }

    public final boolean d() {
        return this.f81050b == 0;
    }

    public final long a() {
        if (this.f81050b != 0) {
            return this.f81051c[this.f81049a];
        }
        throw new NoSuchElementException();
    }

    public final long b() {
        int i10 = this.f81050b;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f81051c;
        int i11 = this.f81049a;
        long j10 = jArr[i11];
        this.f81049a = this.f81052d & (i11 + 1);
        this.f81050b = i10 - 1;
        return j10;
    }

    public C10150yM(int i10) {
        int i11 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        this.f81049a = 0;
        this.f81050b = 0;
        this.f81051c = new long[i11];
        this.f81052d = r3.length - 1;
    }
}
