package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.r4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3496r4 extends AbstractC15707a {
    public static final Parcelable.Creator<C3496r4> CREATOR = new Na();

    /* renamed from: a, reason: collision with root package name */
    public String f10268a;

    /* renamed from: b, reason: collision with root package name */
    public String f10269b;

    /* renamed from: c, reason: collision with root package name */
    public String f10270c;

    /* renamed from: d, reason: collision with root package name */
    public String f10271d;

    /* renamed from: e, reason: collision with root package name */
    public String f10272e;

    /* renamed from: f, reason: collision with root package name */
    public String f10273f;

    /* renamed from: g, reason: collision with root package name */
    public String f10274g;

    /* renamed from: h, reason: collision with root package name */
    public String f10275h;

    /* renamed from: i, reason: collision with root package name */
    public String f10276i;

    /* renamed from: j, reason: collision with root package name */
    public String f10277j;

    /* renamed from: k, reason: collision with root package name */
    public String f10278k;

    /* renamed from: l, reason: collision with root package name */
    public String f10279l;

    /* renamed from: m, reason: collision with root package name */
    public String f10280m;

    /* renamed from: n, reason: collision with root package name */
    public String f10281n;

    public C3496r4() {
    }

    public C3496r4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f10268a = str;
        this.f10269b = str2;
        this.f10270c = str3;
        this.f10271d = str4;
        this.f10272e = str5;
        this.f10273f = str6;
        this.f10274g = str7;
        this.f10275h = str8;
        this.f10276i = str9;
        this.f10277j = str10;
        this.f10278k = str11;
        this.f10279l = str12;
        this.f10280m = str13;
        this.f10281n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f10268a, false);
        C15708b.w(parcel, 3, this.f10269b, false);
        C15708b.w(parcel, 4, this.f10270c, false);
        C15708b.w(parcel, 5, this.f10271d, false);
        C15708b.w(parcel, 6, this.f10272e, false);
        C15708b.w(parcel, 7, this.f10273f, false);
        C15708b.w(parcel, 8, this.f10274g, false);
        C15708b.w(parcel, 9, this.f10275h, false);
        C15708b.w(parcel, 10, this.f10276i, false);
        C15708b.w(parcel, 11, this.f10277j, false);
        C15708b.w(parcel, 12, this.f10278k, false);
        C15708b.w(parcel, 13, this.f10279l, false);
        C15708b.w(parcel, 14, this.f10280m, false);
        C15708b.w(parcel, 15, this.f10281n, false);
        C15708b.b(parcel, iA);
    }
}
