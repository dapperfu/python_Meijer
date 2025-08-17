package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class d extends AbstractC15136a {
    public static final Parcelable.Creator<d> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    int f42609a;

    /* renamed from: b, reason: collision with root package name */
    String f42610b;

    /* renamed from: c, reason: collision with root package name */
    double f42611c;

    /* renamed from: d, reason: collision with root package name */
    String f42612d;

    /* renamed from: e, reason: collision with root package name */
    long f42613e;

    /* renamed from: f, reason: collision with root package name */
    int f42614f;

    d() {
        this.f42614f = -1;
        this.f42609a = -1;
        this.f42611c = -1.0d;
    }

    d(int i10, String str, double d10, String str2, long j10, int i11) {
        this.f42609a = i10;
        this.f42610b = str;
        this.f42611c = d10;
        this.f42612d = str2;
        this.f42613e = j10;
        this.f42614f = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f42609a);
        C15137b.w(parcel, 3, this.f42610b, false);
        C15137b.i(parcel, 4, this.f42611c);
        C15137b.w(parcel, 5, this.f42612d, false);
        C15137b.s(parcel, 6, this.f42613e);
        C15137b.n(parcel, 7, this.f42614f);
        C15137b.b(parcel, iA);
    }
}
