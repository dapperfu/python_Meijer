package be;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: be.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6361d extends AbstractC15707a {
    public static final Parcelable.Creator<C6361d> CREATOR = new C6370m();

    /* renamed from: a, reason: collision with root package name */
    int f60276a;

    /* renamed from: b, reason: collision with root package name */
    String f60277b;

    /* renamed from: c, reason: collision with root package name */
    double f60278c;

    /* renamed from: d, reason: collision with root package name */
    String f60279d;

    /* renamed from: e, reason: collision with root package name */
    long f60280e;

    /* renamed from: f, reason: collision with root package name */
    int f60281f;

    C6361d() {
        this.f60281f = -1;
        this.f60276a = -1;
        this.f60278c = -1.0d;
    }

    C6361d(int i10, String str, double d10, String str2, long j10, int i11) {
        this.f60276a = i10;
        this.f60277b = str;
        this.f60278c = d10;
        this.f60279d = str2;
        this.f60280e = j10;
        this.f60281f = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f60276a);
        C15708b.w(parcel, 3, this.f60277b, false);
        C15708b.i(parcel, 4, this.f60278c);
        C15708b.w(parcel, 5, this.f60279d, false);
        C15708b.s(parcel, 6, this.f60280e);
        C15708b.n(parcel, 7, this.f60281f);
        C15708b.b(parcel, iA);
    }
}
