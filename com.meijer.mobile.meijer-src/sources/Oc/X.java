package Oc;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class X extends AbstractC15707a {
    public static final Parcelable.Creator<X> CREATOR = new C4442w0();

    /* renamed from: a, reason: collision with root package name */
    public final String f23352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23353b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23352a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.w(parcel, 2, this.f23353b, false);
        C15708b.b(parcel, iA);
    }

    public X(String str, String str2) {
        this.f23352a = str;
        this.f23353b = str2;
    }
}
