package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7645c5 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f73092a;

    /* renamed from: b, reason: collision with root package name */
    public final X4 f73093b;

    public C7645c5(int i10, X4 x42) {
        this.f73092a = i10;
        this.f73093b = x42;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f73092a, ((C7645c5) obj).f73092a);
    }
}
