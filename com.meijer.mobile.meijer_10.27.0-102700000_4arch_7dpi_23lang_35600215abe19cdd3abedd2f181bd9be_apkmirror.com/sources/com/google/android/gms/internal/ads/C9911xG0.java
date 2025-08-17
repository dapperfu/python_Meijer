package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9911xG0 extends IG0 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    private final int f79718e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f79719f;

    /* renamed from: g, reason: collision with root package name */
    private final String f79720g;

    /* renamed from: h, reason: collision with root package name */
    private final BG0 f79721h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f79722i;

    /* renamed from: j, reason: collision with root package name */
    private final int f79723j;

    /* renamed from: k, reason: collision with root package name */
    private final int f79724k;

    /* renamed from: l, reason: collision with root package name */
    private final int f79725l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f79726m;

    /* renamed from: n, reason: collision with root package name */
    private final int f79727n;

    /* renamed from: o, reason: collision with root package name */
    private final int f79728o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f79729p;

    /* renamed from: q, reason: collision with root package name */
    private final int f79730q;

    /* renamed from: r, reason: collision with root package name */
    private final int f79731r;

    /* renamed from: s, reason: collision with root package name */
    private final int f79732s;

    /* renamed from: t, reason: collision with root package name */
    private final int f79733t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f79734u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f79735v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f79736w;

    @Override // com.google.android.gms.internal.ads.IG0
    public final int a() {
        return this.f79718e;
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final /* bridge */ /* synthetic */ boolean b(IG0 ig0) {
        String str;
        C9911xG0 c9911xG0 = (C9911xG0) ig0;
        boolean z10 = this.f79721h.f65501K;
        C c10 = this.f67586d;
        int i10 = c10.f65641D;
        if (i10 == -1) {
            return false;
        }
        C c11 = c9911xG0.f67586d;
        if (i10 != c11.f65641D || (str = c10.f65664o) == null || !TextUtils.equals(str, c11.f65664o)) {
            return false;
        }
        boolean z11 = this.f79721h.f65500J;
        int i11 = this.f67586d.f65642E;
        return i11 != -1 && i11 == c9911xG0.f67586d.f65642E && this.f79734u == c9911xG0.f79734u && this.f79735v == c9911xG0.f79735v;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C9911xG0 c9911xG0) {
        AbstractC7068Ph0 abstractC7068Ph0A = (this.f79719f && this.f79722i) ? NG0.f68852j : NG0.f68852j.a();
        AbstractC7202Tg0 abstractC7202Tg0C = AbstractC7202Tg0.i().d(this.f79722i, c9911xG0.f79722i).c(Integer.valueOf(this.f79724k), Integer.valueOf(c9911xG0.f79724k), AbstractC7068Ph0.c().a()).b(this.f79723j, c9911xG0.f79723j).b(this.f79725l, c9911xG0.f79725l).d(this.f79729p, c9911xG0.f79729p).d(this.f79726m, c9911xG0.f79726m).c(Integer.valueOf(this.f79727n), Integer.valueOf(c9911xG0.f79727n), AbstractC7068Ph0.c().a()).b(this.f79728o, c9911xG0.f79728o).d(this.f79719f, c9911xG0.f79719f).c(Integer.valueOf(this.f79733t), Integer.valueOf(c9911xG0.f79733t), AbstractC7068Ph0.c().a());
        boolean z10 = this.f79721h.f68740z;
        AbstractC7202Tg0 abstractC7202Tg0C2 = abstractC7202Tg0C.d(this.f79734u, c9911xG0.f79734u).d(this.f79735v, c9911xG0.f79735v).d(this.f79736w, c9911xG0.f79736w).c(Integer.valueOf(this.f79730q), Integer.valueOf(c9911xG0.f79730q), abstractC7068Ph0A).c(Integer.valueOf(this.f79731r), Integer.valueOf(c9911xG0.f79731r), abstractC7068Ph0A);
        if (Objects.equals(this.f79720g, c9911xG0.f79720g)) {
            abstractC7202Tg0C2 = abstractC7202Tg0C2.c(Integer.valueOf(this.f79732s), Integer.valueOf(c9911xG0.f79732s), abstractC7068Ph0A);
        }
        return abstractC7202Tg0C2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9911xG0(int r8, com.google.android.gms.internal.ads.C9742vm r9, int r10, com.google.android.gms.internal.ads.BG0 r11, int r12, boolean r13, com.google.android.gms.internal.ads.InterfaceC6691Ef0 r14, int r15) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9911xG0.<init>(int, com.google.android.gms.internal.ads.vm, int, com.google.android.gms.internal.ads.BG0, int, boolean, com.google.android.gms.internal.ads.Ef0, int):void");
    }
}
