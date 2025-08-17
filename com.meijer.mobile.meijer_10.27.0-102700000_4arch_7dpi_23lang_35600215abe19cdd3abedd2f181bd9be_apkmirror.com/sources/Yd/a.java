package Yd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class a extends AbstractC15136a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f40247a;

    /* renamed from: b, reason: collision with root package name */
    int f40248b;

    /* renamed from: c, reason: collision with root package name */
    boolean f40249c;

    /* renamed from: d, reason: collision with root package name */
    String f40250d;

    /* renamed from: e, reason: collision with root package name */
    String f40251e;

    /* renamed from: f, reason: collision with root package name */
    String f40252f;

    /* renamed from: g, reason: collision with root package name */
    String f40253g;

    /* renamed from: h, reason: collision with root package name */
    String f40254h;

    /* renamed from: i, reason: collision with root package name */
    String f40255i;

    private a() {
    }

    a(String str, int i10, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f40247a = str;
        this.f40248b = i10;
        this.f40249c = z10;
        this.f40250d = str2;
        this.f40251e = str3;
        this.f40252f = str4;
        this.f40253g = str5;
        this.f40254h = str6;
        this.f40255i = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, this.f40247a, false);
        C15137b.n(parcel, 2, this.f40248b);
        C15137b.c(parcel, 3, this.f40249c);
        C15137b.w(parcel, 4, this.f40250d, false);
        C15137b.w(parcel, 5, this.f40251e, false);
        C15137b.w(parcel, 6, this.f40252f, false);
        C15137b.w(parcel, 7, this.f40253g, false);
        C15137b.w(parcel, 8, this.f40254h, false);
        C15137b.w(parcel, 9, this.f40255i, false);
        C15137b.b(parcel, iA);
    }
}
