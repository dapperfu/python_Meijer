package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class K3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f68858a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68859b;

    /* renamed from: c, reason: collision with root package name */
    public final long f68860c;

    /* renamed from: d, reason: collision with root package name */
    public final long f68861d;

    /* renamed from: e, reason: collision with root package name */
    public final long f68862e;

    /* renamed from: f, reason: collision with root package name */
    public final long f68863f;

    /* renamed from: g, reason: collision with root package name */
    public final C f68864g;

    /* renamed from: h, reason: collision with root package name */
    public final int f68865h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f68866i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f68867j;

    /* renamed from: k, reason: collision with root package name */
    public final int f68868k;

    /* renamed from: l, reason: collision with root package name */
    private final L3[] f68869l;

    public K3(int i10, int i11, long j10, long j11, long j12, long j13, C c10, int i12, L3[] l3Arr, int i13, long[] jArr, long[] jArr2) {
        this.f68858a = i10;
        this.f68859b = i11;
        this.f68860c = j10;
        this.f68861d = j11;
        this.f68862e = j12;
        this.f68863f = j13;
        this.f68864g = c10;
        this.f68865h = i12;
        this.f68869l = l3Arr;
        this.f68868k = i13;
        this.f68866i = jArr;
        this.f68867j = jArr2;
    }

    public final K3 a(C c10) {
        return new K3(this.f68858a, this.f68859b, this.f68860c, this.f68861d, this.f68862e, this.f68863f, c10, this.f68865h, this.f68869l, this.f68868k, this.f68866i, this.f68867j);
    }

    public final L3 b(int i10) {
        return this.f68869l[i10];
    }
}
