package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Mg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7088Mg extends AbstractC15707a {
    public static final Parcelable.Creator<C7088Mg> CREATOR = new C7122Ng();

    /* renamed from: a, reason: collision with root package name */
    public final int f69522a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69523b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69524c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f69525d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69526e;

    /* renamed from: f, reason: collision with root package name */
    public final Oc.R1 f69527f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f69528g;

    /* renamed from: h, reason: collision with root package name */
    public final int f69529h;

    /* renamed from: i, reason: collision with root package name */
    public final int f69530i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f69531j;

    /* renamed from: k, reason: collision with root package name */
    public final int f69532k;

    public C7088Mg(int i10, boolean z10, int i11, boolean z11, int i12, Oc.R1 r12, boolean z12, int i13, int i14, boolean z13, int i15) {
        this.f69522a = i10;
        this.f69523b = z10;
        this.f69524c = i11;
        this.f69525d = z11;
        this.f69526e = i12;
        this.f69527f = r12;
        this.f69528g = z12;
        this.f69529h = i13;
        this.f69531j = z13;
        this.f69530i = i14;
        this.f69532k = i15;
    }

    @Deprecated
    public C7088Mg(Jc.d dVar) {
        this(4, dVar.f(), dVar.b(), dVar.e(), dVar.a(), dVar.d() != null ? new Oc.R1(dVar.d()) : null, dVar.g(), dVar.c(), 0, false, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.nativead.a B(com.google.android.gms.internal.ads.C7088Mg r5) {
        /*
            com.google.android.gms.ads.nativead.a$a r0 = new com.google.android.gms.ads.nativead.a$a
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.a r5 = r0.a()
            return r5
        Lc:
            int r1 = r5.f69522a
            r2 = 2
            if (r1 == r2) goto L45
            r3 = 3
            if (r1 == r3) goto L39
            r4 = 4
            if (r1 == r4) goto L18
            goto L4a
        L18:
            boolean r1 = r5.f69528g
            r0.e(r1)
            int r1 = r5.f69529h
            r0.d(r1)
            int r1 = r5.f69530i
            boolean r4 = r5.f69531j
            r0.b(r1, r4)
            int r1 = r5.f69532k
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = r4
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = r3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            r0.q(r2)
        L39:
            Oc.R1 r1 = r5.f69527f
            if (r1 == 0) goto L45
            Gc.s r2 = new Gc.s
            r2.<init>(r1)
            r0.h(r2)
        L45:
            int r1 = r5.f69526e
            r0.c(r1)
        L4a:
            boolean r1 = r5.f69523b
            r0.g(r1)
            boolean r5 = r5.f69525d
            r0.f(r5)
            com.google.android.gms.ads.nativead.a r5 = r0.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7088Mg.B(com.google.android.gms.internal.ads.Mg):com.google.android.gms.ads.nativead.a");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f69522a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.c(parcel, 2, this.f69523b);
        C15708b.n(parcel, 3, this.f69524c);
        C15708b.c(parcel, 4, this.f69525d);
        C15708b.n(parcel, 5, this.f69526e);
        C15708b.u(parcel, 6, this.f69527f, i10, false);
        C15708b.c(parcel, 7, this.f69528g);
        C15708b.n(parcel, 8, this.f69529h);
        C15708b.n(parcel, 9, this.f69530i);
        C15708b.c(parcel, 10, this.f69531j);
        C15708b.n(parcel, 11, this.f69532k);
        C15708b.b(parcel, iA);
    }
}
