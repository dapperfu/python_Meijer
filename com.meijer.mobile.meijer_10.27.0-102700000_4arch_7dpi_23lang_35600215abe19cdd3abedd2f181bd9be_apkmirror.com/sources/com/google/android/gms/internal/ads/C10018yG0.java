package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10018yG0 extends IG0 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    private final int f80181e;

    /* renamed from: f, reason: collision with root package name */
    private final int f80182f;

    @Override // com.google.android.gms.internal.ads.IG0
    public final int a() {
        return this.f80181e;
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final /* bridge */ /* synthetic */ boolean b(IG0 ig0) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C10018yG0 c10018yG0) {
        return Integer.compare(this.f80182f, c10018yG0.f80182f);
    }

    public C10018yG0(int i10, C9742vm c9742vm, int i11, BG0 bg0, int i12) {
        super(i10, c9742vm, i11);
        this.f80181e = GA0.a(i12, bg0.f65505O) ? 1 : 0;
        this.f80182f = this.f67586d.a();
    }
}
