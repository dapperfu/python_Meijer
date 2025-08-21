package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class W6 extends AbstractC15707a {
    public static final Parcelable.Creator<W6> CREATOR = new C3351f();

    /* renamed from: a, reason: collision with root package name */
    public String f9604a;

    /* renamed from: b, reason: collision with root package name */
    public String f9605b;

    public W6() {
    }

    public W6(String str, String str2) {
        this.f9604a = str;
        this.f9605b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f9604a, false);
        C15708b.w(parcel, 3, this.f9605b, false);
        C15708b.b(parcel, iA);
    }
}
