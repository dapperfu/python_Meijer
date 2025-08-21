package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.la, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3434la extends AbstractC15707a {
    public static final Parcelable.Creator<C3434la> CREATOR = new Ba();

    /* renamed from: a, reason: collision with root package name */
    private final double f10200a;

    /* renamed from: b, reason: collision with root package name */
    private final double f10201b;

    public C3434la(double d10, double d11) {
        this.f10200a = d10;
        this.f10201b = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.i(parcel, 1, this.f10200a);
        C15708b.i(parcel, 2, this.f10201b);
        C15708b.b(parcel, iA);
    }
}
