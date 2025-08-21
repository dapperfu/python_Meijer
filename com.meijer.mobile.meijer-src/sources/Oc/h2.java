package Oc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class h2 extends AbstractC15707a {
    public static final Parcelable.Creator<h2> CREATOR = new i2();

    /* renamed from: a, reason: collision with root package name */
    public final String f23455a;

    /* renamed from: b, reason: collision with root package name */
    public long f23456b;

    /* renamed from: c, reason: collision with root package name */
    public W0 f23457c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f23458d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23459e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23460f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23461g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23462h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23455a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.s(parcel, 2, this.f23456b);
        C15708b.u(parcel, 3, this.f23457c, i10, false);
        C15708b.e(parcel, 4, this.f23458d, false);
        C15708b.w(parcel, 5, this.f23459e, false);
        C15708b.w(parcel, 6, this.f23460f, false);
        C15708b.w(parcel, 7, this.f23461g, false);
        C15708b.w(parcel, 8, this.f23462h, false);
        C15708b.b(parcel, iA);
    }

    public h2(String str, long j10, W0 w02, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f23455a = str;
        this.f23456b = j10;
        this.f23457c = w02;
        this.f23458d = bundle;
        this.f23459e = str2;
        this.f23460f = str3;
        this.f23461g = str4;
        this.f23462h = str5;
    }
}
