package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class k extends AbstractC15707a {
    public static final Parcelable.Creator<k> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    int f43742a;

    /* renamed from: b, reason: collision with root package name */
    String f43743b;

    private k() {
    }

    k(int i10, String str) {
        this.f43742a = i10;
        this.f43743b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f43742a);
        C15708b.w(parcel, 3, this.f43743b, false);
        C15708b.b(parcel, iA);
    }
}
