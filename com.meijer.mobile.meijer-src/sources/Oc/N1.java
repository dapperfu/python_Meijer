package Oc;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class N1 extends AbstractC15707a {
    public static final Parcelable.Creator<N1> CREATOR = new O1();

    /* renamed from: a, reason: collision with root package name */
    public final String f23338a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23338a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 15, str, false);
        C15708b.b(parcel, iA);
    }

    N1(String str) {
        this.f23338a = str;
    }
}
