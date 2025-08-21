package Pc;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class a extends AbstractC15707a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final String f25758a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25759b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25760c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f25758a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.w(parcel, 2, this.f25759b, false);
        C15708b.w(parcel, 3, this.f25760c, false);
        C15708b.b(parcel, iA);
    }

    public a(String str, String str2, String str3) {
        this.f25758a = str;
        this.f25759b = str2;
        this.f25760c = str3;
    }
}
