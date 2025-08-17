package Mc;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class j2 extends AbstractC15136a {
    public static final Parcelable.Creator<j2> CREATOR = new k2();

    /* renamed from: a, reason: collision with root package name */
    public final int f19294a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19294a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, i11);
        C15137b.b(parcel, iA);
    }

    public j2(int i10) {
        this.f19294a = i10;
    }
}
