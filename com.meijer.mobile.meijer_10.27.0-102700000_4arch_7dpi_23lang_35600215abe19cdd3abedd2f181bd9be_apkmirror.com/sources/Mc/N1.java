package Mc;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class N1 extends AbstractC15136a {
    public static final Parcelable.Creator<N1> CREATOR = new O1();

    /* renamed from: a, reason: collision with root package name */
    public final String f19151a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f19151a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 15, str, false);
        C15137b.b(parcel, iA);
    }

    N1(String str) {
        this.f19151a = str;
    }
}
