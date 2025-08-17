package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class G2 extends AbstractC15136a {
    public static final Parcelable.Creator<G2> CREATOR = new I2();

    /* renamed from: a, reason: collision with root package name */
    public int f84303a;

    /* renamed from: b, reason: collision with root package name */
    public int f84304b;

    /* renamed from: c, reason: collision with root package name */
    public int f84305c;

    /* renamed from: d, reason: collision with root package name */
    public long f84306d;

    /* renamed from: e, reason: collision with root package name */
    public int f84307e;

    public G2() {
    }

    public G2(int i10, int i11, int i12, long j10, int i13) {
        this.f84303a = i10;
        this.f84304b = i11;
        this.f84305c = i12;
        this.f84306d = j10;
        this.f84307e = i13;
    }

    public static G2 B(Ud.c cVar) {
        G2 g22 = new G2();
        g22.f84303a = cVar.c().f();
        g22.f84304b = cVar.c().b();
        g22.f84307e = cVar.c().d();
        g22.f84305c = cVar.c().c();
        g22.f84306d = cVar.c().e();
        return g22;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f84303a);
        C15137b.n(parcel, 3, this.f84304b);
        C15137b.n(parcel, 4, this.f84305c);
        C15137b.s(parcel, 5, this.f84306d);
        C15137b.n(parcel, 6, this.f84307e);
        C15137b.b(parcel, iA);
    }
}
