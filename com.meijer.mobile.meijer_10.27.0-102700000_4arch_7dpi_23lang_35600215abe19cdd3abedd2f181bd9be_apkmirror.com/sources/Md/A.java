package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.maps.model.LatLng;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public class A extends AbstractC15136a {
    public static final Parcelable.Creator<A> CREATOR = new l0();

    /* renamed from: a, reason: collision with root package name */
    public final C4199z[] f19372a;

    /* renamed from: b, reason: collision with root package name */
    public final LatLng f19373b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19374c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f19374c.equals(a10.f19374c) && this.f19373b.equals(a10.f19373b);
    }

    public int hashCode() {
        return C6535q.b(this.f19373b, this.f19374c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C4199z[] c4199zArr = this.f19372a;
        int iA = C15137b.a(parcel);
        C15137b.z(parcel, 2, c4199zArr, i10, false);
        C15137b.u(parcel, 3, this.f19373b, i10, false);
        C15137b.w(parcel, 4, this.f19374c, false);
        C15137b.b(parcel, iA);
    }

    public A(C4199z[] c4199zArr, LatLng latLng, String str) {
        this.f19372a = c4199zArr;
        this.f19373b = latLng;
        this.f19374c = str;
    }

    public String toString() {
        return C6535q.c(this).a("panoId", this.f19374c).a("position", this.f19373b.toString()).toString();
    }
}
