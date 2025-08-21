package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10036xG0 extends IG0 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    private final int f80558e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f80559f;

    /* renamed from: g, reason: collision with root package name */
    private final String f80560g;

    /* renamed from: h, reason: collision with root package name */
    private final BG0 f80561h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f80562i;

    /* renamed from: j, reason: collision with root package name */
    private final int f80563j;

    /* renamed from: k, reason: collision with root package name */
    private final int f80564k;

    /* renamed from: l, reason: collision with root package name */
    private final int f80565l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f80566m;

    /* renamed from: n, reason: collision with root package name */
    private final int f80567n;

    /* renamed from: o, reason: collision with root package name */
    private final int f80568o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f80569p;

    /* renamed from: q, reason: collision with root package name */
    private final int f80570q;

    /* renamed from: r, reason: collision with root package name */
    private final int f80571r;

    /* renamed from: s, reason: collision with root package name */
    private final int f80572s;

    /* renamed from: t, reason: collision with root package name */
    private final int f80573t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f80574u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f80575v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f80576w;

    @Override // com.google.android.gms.internal.ads.IG0
    public final int a() {
        return this.f80558e;
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final /* bridge */ /* synthetic */ boolean b(IG0 ig0) {
        String str;
        C10036xG0 c10036xG0 = (C10036xG0) ig0;
        boolean z10 = this.f80561h.f66341K;
        C c10 = this.f68426d;
        int i10 = c10.f66481D;
        if (i10 == -1) {
            return false;
        }
        C c11 = c10036xG0.f68426d;
        if (i10 != c11.f66481D || (str = c10.f66504o) == null || !TextUtils.equals(str, c11.f66504o)) {
            return false;
        }
        boolean z11 = this.f80561h.f66340J;
        int i11 = this.f68426d.f66482E;
        return i11 != -1 && i11 == c10036xG0.f68426d.f66482E && this.f80574u == c10036xG0.f80574u && this.f80575v == c10036xG0.f80575v;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C10036xG0 c10036xG0) {
        AbstractC7193Ph0 abstractC7193Ph0A = (this.f80559f && this.f80562i) ? NG0.f69692j : NG0.f69692j.a();
        AbstractC7327Tg0 abstractC7327Tg0C = AbstractC7327Tg0.i().d(this.f80562i, c10036xG0.f80562i).c(Integer.valueOf(this.f80564k), Integer.valueOf(c10036xG0.f80564k), AbstractC7193Ph0.c().a()).b(this.f80563j, c10036xG0.f80563j).b(this.f80565l, c10036xG0.f80565l).d(this.f80569p, c10036xG0.f80569p).d(this.f80566m, c10036xG0.f80566m).c(Integer.valueOf(this.f80567n), Integer.valueOf(c10036xG0.f80567n), AbstractC7193Ph0.c().a()).b(this.f80568o, c10036xG0.f80568o).d(this.f80559f, c10036xG0.f80559f).c(Integer.valueOf(this.f80573t), Integer.valueOf(c10036xG0.f80573t), AbstractC7193Ph0.c().a());
        boolean z10 = this.f80561h.f69580z;
        AbstractC7327Tg0 abstractC7327Tg0C2 = abstractC7327Tg0C.d(this.f80574u, c10036xG0.f80574u).d(this.f80575v, c10036xG0.f80575v).d(this.f80576w, c10036xG0.f80576w).c(Integer.valueOf(this.f80570q), Integer.valueOf(c10036xG0.f80570q), abstractC7193Ph0A).c(Integer.valueOf(this.f80571r), Integer.valueOf(c10036xG0.f80571r), abstractC7193Ph0A);
        if (Objects.equals(this.f80560g, c10036xG0.f80560g)) {
            abstractC7327Tg0C2 = abstractC7327Tg0C2.c(Integer.valueOf(this.f80572s), Integer.valueOf(c10036xG0.f80572s), abstractC7193Ph0A);
        }
        return abstractC7327Tg0C2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10036xG0(int r8, com.google.android.gms.internal.ads.C9867vm r9, int r10, com.google.android.gms.internal.ads.BG0 r11, int r12, boolean r13, com.google.android.gms.internal.ads.InterfaceC6816Ef0 r14, int r15) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10036xG0.<init>(int, com.google.android.gms.internal.ads.vm, int, com.google.android.gms.internal.ads.BG0, int, boolean, com.google.android.gms.internal.ads.Ef0, int):void");
    }
}
