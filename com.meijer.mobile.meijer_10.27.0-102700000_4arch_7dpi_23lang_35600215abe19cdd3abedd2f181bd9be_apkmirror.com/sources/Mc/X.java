package Mc;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class X extends AbstractC15136a {
    public static final Parcelable.Creator<X> CREATOR = new C4164w0();

    /* renamed from: a, reason: collision with root package name */
    public final String f19165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19166b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f19165a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.w(parcel, 2, this.f19166b, false);
        C15137b.b(parcel, iA);
    }

    public X(String str, String str2) {
        this.f19165a = str;
        this.f19166b = str2;
    }
}
