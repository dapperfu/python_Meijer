package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class G2 extends AbstractC15707a {
    public static final Parcelable.Creator<G2> CREATOR = new I2();

    /* renamed from: a, reason: collision with root package name */
    public int f85143a;

    /* renamed from: b, reason: collision with root package name */
    public int f85144b;

    /* renamed from: c, reason: collision with root package name */
    public int f85145c;

    /* renamed from: d, reason: collision with root package name */
    public long f85146d;

    /* renamed from: e, reason: collision with root package name */
    public int f85147e;

    public G2() {
    }

    public G2(int i10, int i11, int i12, long j10, int i13) {
        this.f85143a = i10;
        this.f85144b = i11;
        this.f85145c = i12;
        this.f85146d = j10;
        this.f85147e = i13;
    }

    public static G2 B(Wd.c cVar) {
        G2 g22 = new G2();
        g22.f85143a = cVar.c().f();
        g22.f85144b = cVar.c().b();
        g22.f85147e = cVar.c().d();
        g22.f85145c = cVar.c().c();
        g22.f85146d = cVar.c().e();
        return g22;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f85143a);
        C15708b.n(parcel, 3, this.f85144b);
        C15708b.n(parcel, 4, this.f85145c);
        C15708b.s(parcel, 5, this.f85146d);
        C15708b.n(parcel, 6, this.f85147e);
        C15708b.b(parcel, iA);
    }
}
