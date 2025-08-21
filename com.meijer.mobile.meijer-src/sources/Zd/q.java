package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

@Deprecated
/* loaded from: classes6.dex */
public final class q extends AbstractC15707a {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    final String f43768a;

    /* renamed from: b, reason: collision with root package name */
    final String f43769b;

    /* renamed from: c, reason: collision with root package name */
    final int f43770c;

    /* renamed from: d, reason: collision with root package name */
    final int f43771d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f43768a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, str, false);
        C15708b.w(parcel, 3, this.f43769b, false);
        C15708b.n(parcel, 4, this.f43770c);
        C15708b.n(parcel, 5, this.f43771d);
        C15708b.b(parcel, iA);
    }

    public q(String str, String str2, int i10, int i11) {
        this.f43768a = str;
        this.f43769b = str2;
        this.f43770c = i10;
        this.f43771d = i11;
    }
}
