package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.la, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3212la extends AbstractC15136a {
    public static final Parcelable.Creator<C3212la> CREATOR = new Ba();

    /* renamed from: a, reason: collision with root package name */
    private final double f6167a;

    /* renamed from: b, reason: collision with root package name */
    private final double f6168b;

    public C3212la(double d10, double d11) {
        this.f6167a = d10;
        this.f6168b = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.i(parcel, 1, this.f6167a);
        C15137b.i(parcel, 2, this.f6168b);
        C15137b.b(parcel, iA);
    }
}
