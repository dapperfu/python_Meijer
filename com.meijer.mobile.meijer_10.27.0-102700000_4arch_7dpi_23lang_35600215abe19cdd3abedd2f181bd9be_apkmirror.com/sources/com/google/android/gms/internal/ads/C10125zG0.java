package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10125zG0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f80402a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f80403b;

    public C10125zG0(C c10, int i10) {
        this.f80402a = 1 == (c10.f65654e & 1);
        this.f80403b = GA0.a(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C10125zG0 c10125zG0) {
        return AbstractC7202Tg0.i().d(this.f80403b, c10125zG0.f80403b).d(this.f80402a, c10125zG0.f80402a).a();
    }
}
