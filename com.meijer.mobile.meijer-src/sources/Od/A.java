package Od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.maps.model.LatLng;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public class A extends AbstractC15707a {
    public static final Parcelable.Creator<A> CREATOR = new l0();

    /* renamed from: a, reason: collision with root package name */
    public final C4477z[] f23559a;

    /* renamed from: b, reason: collision with root package name */
    public final LatLng f23560b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23561c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f23561c.equals(a10.f23561c) && this.f23560b.equals(a10.f23560b);
    }

    public int hashCode() {
        return C6660q.b(this.f23560b, this.f23561c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C4477z[] c4477zArr = this.f23559a;
        int iA = C15708b.a(parcel);
        C15708b.z(parcel, 2, c4477zArr, i10, false);
        C15708b.u(parcel, 3, this.f23560b, i10, false);
        C15708b.w(parcel, 4, this.f23561c, false);
        C15708b.b(parcel, iA);
    }

    public A(C4477z[] c4477zArr, LatLng latLng, String str) {
        this.f23559a = c4477zArr;
        this.f23560b = latLng;
        this.f23561c = str;
    }

    public String toString() {
        return C6660q.c(this).a("panoId", this.f23561c).a("position", this.f23560b.toString()).toString();
    }
}
