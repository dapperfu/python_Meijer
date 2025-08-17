package Mc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class h2 extends AbstractC15136a {
    public static final Parcelable.Creator<h2> CREATOR = new i2();

    /* renamed from: a, reason: collision with root package name */
    public final String f19268a;

    /* renamed from: b, reason: collision with root package name */
    public long f19269b;

    /* renamed from: c, reason: collision with root package name */
    public W0 f19270c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f19271d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19272e;

    /* renamed from: f, reason: collision with root package name */
    public final String f19273f;

    /* renamed from: g, reason: collision with root package name */
    public final String f19274g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19275h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f19268a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.s(parcel, 2, this.f19269b);
        C15137b.u(parcel, 3, this.f19270c, i10, false);
        C15137b.e(parcel, 4, this.f19271d, false);
        C15137b.w(parcel, 5, this.f19272e, false);
        C15137b.w(parcel, 6, this.f19273f, false);
        C15137b.w(parcel, 7, this.f19274g, false);
        C15137b.w(parcel, 8, this.f19275h, false);
        C15137b.b(parcel, iA);
    }

    public h2(String str, long j10, W0 w02, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f19268a = str;
        this.f19269b = j10;
        this.f19270c = w02;
        this.f19271d = bundle;
        this.f19272e = str2;
        this.f19273f = str3;
        this.f19274g = str4;
        this.f19275h = str5;
    }
}
