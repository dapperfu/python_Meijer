package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10250zG0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f81242a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f81243b;

    public C10250zG0(C c10, int i10) {
        this.f81242a = 1 == (c10.f66494e & 1);
        this.f81243b = GA0.a(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C10250zG0 c10250zG0) {
        return AbstractC7327Tg0.i().d(this.f81243b, c10250zG0.f81243b).d(this.f81242a, c10250zG0.f81242a).a();
    }
}
