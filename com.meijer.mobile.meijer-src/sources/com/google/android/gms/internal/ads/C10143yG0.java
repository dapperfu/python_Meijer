package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10143yG0 extends IG0 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    private final int f81021e;

    /* renamed from: f, reason: collision with root package name */
    private final int f81022f;

    @Override // com.google.android.gms.internal.ads.IG0
    public final int a() {
        return this.f81021e;
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final /* bridge */ /* synthetic */ boolean b(IG0 ig0) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C10143yG0 c10143yG0) {
        return Integer.compare(this.f81022f, c10143yG0.f81022f);
    }

    public C10143yG0(int i10, C9867vm c9867vm, int i11, BG0 bg0, int i12) {
        super(i10, c9867vm, i11);
        this.f81021e = GA0.a(i12, bg0.f66345O) ? 1 : 0;
        this.f81022f = this.f68426d.a();
    }
}
