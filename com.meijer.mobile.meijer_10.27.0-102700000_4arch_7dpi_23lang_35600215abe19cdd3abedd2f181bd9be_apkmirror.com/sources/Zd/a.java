package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class a extends AbstractC15136a {
    public static final Parcelable.Creator<a> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    String f42601a;

    /* renamed from: b, reason: collision with root package name */
    String f42602b;

    public a(String str, String str2) {
        this.f42601a = str;
        this.f42602b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f42601a, false);
        C15137b.w(parcel, 3, this.f42602b, false);
        C15137b.b(parcel, iA);
    }
}
