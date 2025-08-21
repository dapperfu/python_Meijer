package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.t5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3519t5 extends AbstractC15707a {
    public static final Parcelable.Creator<C3519t5> CREATOR = new C3315c();

    /* renamed from: a, reason: collision with root package name */
    public double f10312a;

    /* renamed from: b, reason: collision with root package name */
    public double f10313b;

    public C3519t5() {
    }

    public C3519t5(double d10, double d11) {
        this.f10312a = d10;
        this.f10313b = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.i(parcel, 2, this.f10312a);
        C15708b.i(parcel, 3, this.f10313b);
        C15708b.b(parcel, iA);
    }
}
