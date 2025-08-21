package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.ja, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3410ja extends AbstractC15707a {
    public static final Parcelable.Creator<C3410ja> CREATOR = new za();

    /* renamed from: a, reason: collision with root package name */
    private final String f10140a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10141b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10142c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10143d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10144e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10145f;

    /* renamed from: g, reason: collision with root package name */
    private final String f10146g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10147h;

    /* renamed from: i, reason: collision with root package name */
    private final String f10148i;

    /* renamed from: j, reason: collision with root package name */
    private final String f10149j;

    /* renamed from: k, reason: collision with root package name */
    private final String f10150k;

    /* renamed from: l, reason: collision with root package name */
    private final String f10151l;

    /* renamed from: m, reason: collision with root package name */
    private final String f10152m;

    /* renamed from: n, reason: collision with root package name */
    private final String f10153n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f10140a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.w(parcel, 2, this.f10141b, false);
        C15708b.w(parcel, 3, this.f10142c, false);
        C15708b.w(parcel, 4, this.f10143d, false);
        C15708b.w(parcel, 5, this.f10144e, false);
        C15708b.w(parcel, 6, this.f10145f, false);
        C15708b.w(parcel, 7, this.f10146g, false);
        C15708b.w(parcel, 8, this.f10147h, false);
        C15708b.w(parcel, 9, this.f10148i, false);
        C15708b.w(parcel, 10, this.f10149j, false);
        C15708b.w(parcel, 11, this.f10150k, false);
        C15708b.w(parcel, 12, this.f10151l, false);
        C15708b.w(parcel, 13, this.f10152m, false);
        C15708b.w(parcel, 14, this.f10153n, false);
        C15708b.b(parcel, iA);
    }

    public C3410ja(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f10140a = str;
        this.f10141b = str2;
        this.f10142c = str3;
        this.f10143d = str4;
        this.f10144e = str5;
        this.f10145f = str6;
        this.f10146g = str7;
        this.f10147h = str8;
        this.f10148i = str9;
        this.f10149j = str10;
        this.f10150k = str11;
        this.f10151l = str12;
        this.f10152m = str13;
        this.f10153n = str14;
    }
}
