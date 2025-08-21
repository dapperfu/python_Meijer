package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

@Deprecated
/* loaded from: classes6.dex */
public final class n extends AbstractC15707a {
    public static final Parcelable.Creator<n> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    String f43757a;

    /* renamed from: b, reason: collision with root package name */
    String f43758b;

    /* renamed from: c, reason: collision with root package name */
    String f43759c;

    /* renamed from: d, reason: collision with root package name */
    String f43760d;

    /* renamed from: e, reason: collision with root package name */
    String f43761e;

    /* renamed from: f, reason: collision with root package name */
    String f43762f;

    /* renamed from: g, reason: collision with root package name */
    String f43763g;

    /* renamed from: h, reason: collision with root package name */
    String f43764h;

    /* renamed from: i, reason: collision with root package name */
    String f43765i;

    /* renamed from: j, reason: collision with root package name */
    boolean f43766j;

    /* renamed from: k, reason: collision with root package name */
    String f43767k;

    n() {
    }

    n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10) {
        this.f43757a = str;
        this.f43758b = str2;
        this.f43759c = str3;
        this.f43760d = str4;
        this.f43761e = str5;
        this.f43762f = str6;
        this.f43763g = str7;
        this.f43764h = str8;
        this.f43765i = str9;
        this.f43766j = z10;
        this.f43767k = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f43757a, false);
        C15708b.w(parcel, 3, this.f43758b, false);
        C15708b.w(parcel, 4, this.f43759c, false);
        C15708b.w(parcel, 5, this.f43760d, false);
        C15708b.w(parcel, 6, this.f43761e, false);
        C15708b.w(parcel, 7, this.f43762f, false);
        C15708b.w(parcel, 8, this.f43763g, false);
        C15708b.w(parcel, 9, this.f43764h, false);
        C15708b.w(parcel, 10, this.f43765i, false);
        C15708b.c(parcel, 11, this.f43766j);
        C15708b.w(parcel, 12, this.f43767k, false);
        C15708b.b(parcel, iA);
    }
}
