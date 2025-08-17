package Md;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class D extends AbstractC15136a {
    public static final Parcelable.Creator<D> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    private final C f19388a;

    /* renamed from: b, reason: collision with root package name */
    private final double f19389b;

    public double B() {
        return this.f19389b;
    }

    public C T() {
        return this.f19388a;
    }

    public D(C c10, double d10) {
        if (d10 > 0.0d) {
            this.f19388a = c10;
            this.f19389b = d10;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, T(), i10, false);
        C15137b.i(parcel, 3, B());
        C15137b.b(parcel, iA);
    }
}
