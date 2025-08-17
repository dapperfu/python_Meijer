package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class g extends AbstractC15136a {
    public static final Parcelable.Creator<g> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    String f42619a;

    /* renamed from: b, reason: collision with root package name */
    String f42620b;

    g() {
    }

    public g(String str, String str2) {
        this.f42619a = str;
        this.f42620b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f42619a, false);
        C15137b.w(parcel, 3, this.f42620b, false);
        C15137b.b(parcel, iA);
    }
}
