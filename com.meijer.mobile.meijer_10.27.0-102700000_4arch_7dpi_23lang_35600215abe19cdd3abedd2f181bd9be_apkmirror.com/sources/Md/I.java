package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class I extends AbstractC15136a {
    public static final Parcelable.Creator<I> CREATOR = new T();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f19401a;

    /* renamed from: b, reason: collision with root package name */
    public final LatLng f19402b;

    /* renamed from: c, reason: collision with root package name */
    public final LatLng f19403c;

    /* renamed from: d, reason: collision with root package name */
    public final LatLng f19404d;

    /* renamed from: e, reason: collision with root package name */
    public final LatLngBounds f19405e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return this.f19401a.equals(i10.f19401a) && this.f19402b.equals(i10.f19402b) && this.f19403c.equals(i10.f19403c) && this.f19404d.equals(i10.f19404d) && this.f19405e.equals(i10.f19405e);
    }

    public int hashCode() {
        return C6535q.b(this.f19401a, this.f19402b, this.f19403c, this.f19404d, this.f19405e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f19401a;
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, latLng, i10, false);
        C15137b.u(parcel, 3, this.f19402b, i10, false);
        C15137b.u(parcel, 4, this.f19403c, i10, false);
        C15137b.u(parcel, 5, this.f19404d, i10, false);
        C15137b.u(parcel, 6, this.f19405e, i10, false);
        C15137b.b(parcel, iA);
    }

    public I(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f19401a = latLng;
        this.f19402b = latLng2;
        this.f19403c = latLng3;
        this.f19404d = latLng4;
        this.f19405e = latLngBounds;
    }

    public String toString() {
        return C6535q.c(this).a("nearLeft", this.f19401a).a("nearRight", this.f19402b).a("farLeft", this.f19403c).a("farRight", this.f19404d).a("latLngBounds", this.f19405e).toString();
    }
}
