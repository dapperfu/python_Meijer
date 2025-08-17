package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Mg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6963Mg extends AbstractC15136a {
    public static final Parcelable.Creator<C6963Mg> CREATOR = new C6997Ng();

    /* renamed from: a, reason: collision with root package name */
    public final int f68682a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f68683b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68684c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68685d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68686e;

    /* renamed from: f, reason: collision with root package name */
    public final Mc.R1 f68687f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f68688g;

    /* renamed from: h, reason: collision with root package name */
    public final int f68689h;

    /* renamed from: i, reason: collision with root package name */
    public final int f68690i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f68691j;

    /* renamed from: k, reason: collision with root package name */
    public final int f68692k;

    public C6963Mg(int i10, boolean z10, int i11, boolean z11, int i12, Mc.R1 r12, boolean z12, int i13, int i14, boolean z13, int i15) {
        this.f68682a = i10;
        this.f68683b = z10;
        this.f68684c = i11;
        this.f68685d = z11;
        this.f68686e = i12;
        this.f68687f = r12;
        this.f68688g = z12;
        this.f68689h = i13;
        this.f68691j = z13;
        this.f68690i = i14;
        this.f68692k = i15;
    }

    @Deprecated
    public C6963Mg(Hc.d dVar) {
        this(4, dVar.f(), dVar.b(), dVar.e(), dVar.a(), dVar.d() != null ? new Mc.R1(dVar.d()) : null, dVar.g(), dVar.c(), 0, false, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.nativead.a B(com.google.android.gms.internal.ads.C6963Mg r5) {
        /*
            com.google.android.gms.ads.nativead.a$a r0 = new com.google.android.gms.ads.nativead.a$a
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.a r5 = r0.a()
            return r5
        Lc:
            int r1 = r5.f68682a
            r2 = 2
            if (r1 == r2) goto L45
            r3 = 3
            if (r1 == r3) goto L39
            r4 = 4
            if (r1 == r4) goto L18
            goto L4a
        L18:
            boolean r1 = r5.f68688g
            r0.e(r1)
            int r1 = r5.f68689h
            r0.d(r1)
            int r1 = r5.f68690i
            boolean r4 = r5.f68691j
            r0.b(r1, r4)
            int r1 = r5.f68692k
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
            Mc.R1 r1 = r5.f68687f
            if (r1 == 0) goto L45
            Ec.s r2 = new Ec.s
            r2.<init>(r1)
            r0.h(r2)
        L45:
            int r1 = r5.f68686e
            r0.c(r1)
        L4a:
            boolean r1 = r5.f68683b
            r0.g(r1)
            boolean r5 = r5.f68685d
            r0.f(r5)
            com.google.android.gms.ads.nativead.a r5 = r0.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6963Mg.B(com.google.android.gms.internal.ads.Mg):com.google.android.gms.ads.nativead.a");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f68682a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.c(parcel, 2, this.f68683b);
        C15137b.n(parcel, 3, this.f68684c);
        C15137b.c(parcel, 4, this.f68685d);
        C15137b.n(parcel, 5, this.f68686e);
        C15137b.u(parcel, 6, this.f68687f, i10, false);
        C15137b.c(parcel, 7, this.f68688g);
        C15137b.n(parcel, 8, this.f68689h);
        C15137b.n(parcel, 9, this.f68690i);
        C15137b.c(parcel, 10, this.f68691j);
        C15137b.n(parcel, 11, this.f68692k);
        C15137b.b(parcel, iA);
    }
}
