package Nc;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class a extends AbstractC15136a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final String f21523a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21524b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21525c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f21523a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.w(parcel, 2, this.f21524b, false);
        C15137b.w(parcel, 3, this.f21525c, false);
        C15137b.b(parcel, iA);
    }

    public a(String str, String str2, String str3) {
        this.f21523a = str;
        this.f21524b = str2;
        this.f21525c = str3;
    }
}
