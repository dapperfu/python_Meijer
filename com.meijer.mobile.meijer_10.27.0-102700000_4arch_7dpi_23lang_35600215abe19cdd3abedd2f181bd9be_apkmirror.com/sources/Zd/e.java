package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class e extends AbstractC15136a {
    public static final Parcelable.Creator<e> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    String f42615a;

    /* renamed from: b, reason: collision with root package name */
    String f42616b;

    public e(String str, String str2) {
        this.f42615a = str;
        this.f42616b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f42615a, false);
        C15137b.w(parcel, 3, this.f42616b, false);
        C15137b.b(parcel, iA);
    }
}
