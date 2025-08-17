package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.r4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3274r4 extends AbstractC15136a {
    public static final Parcelable.Creator<C3274r4> CREATOR = new Na();

    /* renamed from: a, reason: collision with root package name */
    public String f6235a;

    /* renamed from: b, reason: collision with root package name */
    public String f6236b;

    /* renamed from: c, reason: collision with root package name */
    public String f6237c;

    /* renamed from: d, reason: collision with root package name */
    public String f6238d;

    /* renamed from: e, reason: collision with root package name */
    public String f6239e;

    /* renamed from: f, reason: collision with root package name */
    public String f6240f;

    /* renamed from: g, reason: collision with root package name */
    public String f6241g;

    /* renamed from: h, reason: collision with root package name */
    public String f6242h;

    /* renamed from: i, reason: collision with root package name */
    public String f6243i;

    /* renamed from: j, reason: collision with root package name */
    public String f6244j;

    /* renamed from: k, reason: collision with root package name */
    public String f6245k;

    /* renamed from: l, reason: collision with root package name */
    public String f6246l;

    /* renamed from: m, reason: collision with root package name */
    public String f6247m;

    /* renamed from: n, reason: collision with root package name */
    public String f6248n;

    public C3274r4() {
    }

    public C3274r4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f6235a = str;
        this.f6236b = str2;
        this.f6237c = str3;
        this.f6238d = str4;
        this.f6239e = str5;
        this.f6240f = str6;
        this.f6241g = str7;
        this.f6242h = str8;
        this.f6243i = str9;
        this.f6244j = str10;
        this.f6245k = str11;
        this.f6246l = str12;
        this.f6247m = str13;
        this.f6248n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f6235a, false);
        C15137b.w(parcel, 3, this.f6236b, false);
        C15137b.w(parcel, 4, this.f6237c, false);
        C15137b.w(parcel, 5, this.f6238d, false);
        C15137b.w(parcel, 6, this.f6239e, false);
        C15137b.w(parcel, 7, this.f6240f, false);
        C15137b.w(parcel, 8, this.f6241g, false);
        C15137b.w(parcel, 9, this.f6242h, false);
        C15137b.w(parcel, 10, this.f6243i, false);
        C15137b.w(parcel, 11, this.f6244j, false);
        C15137b.w(parcel, 12, this.f6245k, false);
        C15137b.w(parcel, 13, this.f6246l, false);
        C15137b.w(parcel, 14, this.f6247m, false);
        C15137b.w(parcel, 15, this.f6248n, false);
        C15137b.b(parcel, iA);
    }
}
