package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class W6 extends AbstractC15136a {
    public static final Parcelable.Creator<W6> CREATOR = new C3129f();

    /* renamed from: a, reason: collision with root package name */
    public String f5571a;

    /* renamed from: b, reason: collision with root package name */
    public String f5572b;

    public W6() {
    }

    public W6(String str, String str2) {
        this.f5571a = str;
        this.f5572b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f5571a, false);
        C15137b.w(parcel, 3, this.f5572b, false);
        C15137b.b(parcel, iA);
    }
}
