package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class r extends AbstractC15136a {
    public static final Parcelable.Creator<r> CREATOR = new f0();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f19472a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19473b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19474c;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f19472a;
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, latLng, i10, false);
        C15137b.w(parcel, 3, this.f19473b, false);
        C15137b.w(parcel, 4, this.f19474c, false);
        C15137b.b(parcel, iA);
    }

    public r(LatLng latLng, String str, String str2) {
        this.f19472a = latLng;
        this.f19473b = str;
        this.f19474c = str2;
    }
}
