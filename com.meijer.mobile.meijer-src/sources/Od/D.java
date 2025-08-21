package Od;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class D extends AbstractC15707a {
    public static final Parcelable.Creator<D> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    private final C f23575a;

    /* renamed from: b, reason: collision with root package name */
    private final double f23576b;

    public double B() {
        return this.f23576b;
    }

    public C T() {
        return this.f23575a;
    }

    public D(C c10, double d10) {
        if (d10 > 0.0d) {
            this.f23575a = c10;
            this.f23576b = d10;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, T(), i10, false);
        C15708b.i(parcel, 3, B());
        C15708b.b(parcel, iA);
    }
}
