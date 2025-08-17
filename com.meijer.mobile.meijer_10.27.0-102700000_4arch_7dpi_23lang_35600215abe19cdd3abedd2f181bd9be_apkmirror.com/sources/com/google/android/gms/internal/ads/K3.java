package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class K3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f68018a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68019b;

    /* renamed from: c, reason: collision with root package name */
    public final long f68020c;

    /* renamed from: d, reason: collision with root package name */
    public final long f68021d;

    /* renamed from: e, reason: collision with root package name */
    public final long f68022e;

    /* renamed from: f, reason: collision with root package name */
    public final long f68023f;

    /* renamed from: g, reason: collision with root package name */
    public final C f68024g;

    /* renamed from: h, reason: collision with root package name */
    public final int f68025h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f68026i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f68027j;

    /* renamed from: k, reason: collision with root package name */
    public final int f68028k;

    /* renamed from: l, reason: collision with root package name */
    private final L3[] f68029l;

    public K3(int i10, int i11, long j10, long j11, long j12, long j13, C c10, int i12, L3[] l3Arr, int i13, long[] jArr, long[] jArr2) {
        this.f68018a = i10;
        this.f68019b = i11;
        this.f68020c = j10;
        this.f68021d = j11;
        this.f68022e = j12;
        this.f68023f = j13;
        this.f68024g = c10;
        this.f68025h = i12;
        this.f68029l = l3Arr;
        this.f68028k = i13;
        this.f68026i = jArr;
        this.f68027j = jArr2;
    }

    public final K3 a(C c10) {
        return new K3(this.f68018a, this.f68019b, this.f68020c, this.f68021d, this.f68022e, this.f68023f, c10, this.f68025h, this.f68029l, this.f68028k, this.f68026i, this.f68027j);
    }

    public final L3 b(int i10) {
        return this.f68029l[i10];
    }
}
