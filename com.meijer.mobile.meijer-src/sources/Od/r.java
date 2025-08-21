package Od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class r extends AbstractC15707a {
    public static final Parcelable.Creator<r> CREATOR = new f0();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f23659a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23660b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23661c;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f23659a;
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, latLng, i10, false);
        C15708b.w(parcel, 3, this.f23660b, false);
        C15708b.w(parcel, 4, this.f23661c, false);
        C15708b.b(parcel, iA);
    }

    public r(LatLng latLng, String str, String str2) {
        this.f23659a = latLng;
        this.f23660b = str;
        this.f23661c = str2;
    }
}
