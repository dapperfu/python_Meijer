package Oc;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class j2 extends AbstractC15707a {
    public static final Parcelable.Creator<j2> CREATOR = new k2();

    /* renamed from: a, reason: collision with root package name */
    public final int f23481a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23481a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, i11);
        C15708b.b(parcel, iA);
    }

    public j2(int i10) {
        this.f23481a = i10;
    }
}
