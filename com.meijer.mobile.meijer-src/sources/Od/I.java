package Od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class I extends AbstractC15707a {
    public static final Parcelable.Creator<I> CREATOR = new T();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f23588a;

    /* renamed from: b, reason: collision with root package name */
    public final LatLng f23589b;

    /* renamed from: c, reason: collision with root package name */
    public final LatLng f23590c;

    /* renamed from: d, reason: collision with root package name */
    public final LatLng f23591d;

    /* renamed from: e, reason: collision with root package name */
    public final LatLngBounds f23592e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return this.f23588a.equals(i10.f23588a) && this.f23589b.equals(i10.f23589b) && this.f23590c.equals(i10.f23590c) && this.f23591d.equals(i10.f23591d) && this.f23592e.equals(i10.f23592e);
    }

    public int hashCode() {
        return C6660q.b(this.f23588a, this.f23589b, this.f23590c, this.f23591d, this.f23592e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f23588a;
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, latLng, i10, false);
        C15708b.u(parcel, 3, this.f23589b, i10, false);
        C15708b.u(parcel, 4, this.f23590c, i10, false);
        C15708b.u(parcel, 5, this.f23591d, i10, false);
        C15708b.u(parcel, 6, this.f23592e, i10, false);
        C15708b.b(parcel, iA);
    }

    public I(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f23588a = latLng;
        this.f23589b = latLng2;
        this.f23590c = latLng3;
        this.f23591d = latLng4;
        this.f23592e = latLngBounds;
    }

    public String toString() {
        return C6660q.c(this).a("nearLeft", this.f23588a).a("nearRight", this.f23589b).a("farLeft", this.f23590c).a("farRight", this.f23591d).a("latLngBounds", this.f23592e).toString();
    }
}
