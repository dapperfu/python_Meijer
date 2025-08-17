package Xd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

@Deprecated
/* loaded from: classes6.dex */
public final class n extends AbstractC15136a {
    public static final Parcelable.Creator<n> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    String f39279a;

    /* renamed from: b, reason: collision with root package name */
    String f39280b;

    /* renamed from: c, reason: collision with root package name */
    String f39281c;

    /* renamed from: d, reason: collision with root package name */
    String f39282d;

    /* renamed from: e, reason: collision with root package name */
    String f39283e;

    /* renamed from: f, reason: collision with root package name */
    String f39284f;

    /* renamed from: g, reason: collision with root package name */
    String f39285g;

    /* renamed from: h, reason: collision with root package name */
    String f39286h;

    /* renamed from: i, reason: collision with root package name */
    String f39287i;

    /* renamed from: j, reason: collision with root package name */
    boolean f39288j;

    /* renamed from: k, reason: collision with root package name */
    String f39289k;

    n() {
    }

    n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10) {
        this.f39279a = str;
        this.f39280b = str2;
        this.f39281c = str3;
        this.f39282d = str4;
        this.f39283e = str5;
        this.f39284f = str6;
        this.f39285g = str7;
        this.f39286h = str8;
        this.f39287i = str9;
        this.f39288j = z10;
        this.f39289k = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f39279a, false);
        C15137b.w(parcel, 3, this.f39280b, false);
        C15137b.w(parcel, 4, this.f39281c, false);
        C15137b.w(parcel, 5, this.f39282d, false);
        C15137b.w(parcel, 6, this.f39283e, false);
        C15137b.w(parcel, 7, this.f39284f, false);
        C15137b.w(parcel, 8, this.f39285g, false);
        C15137b.w(parcel, 9, this.f39286h, false);
        C15137b.w(parcel, 10, this.f39287i, false);
        C15137b.c(parcel, 11, this.f39288j);
        C15137b.w(parcel, 12, this.f39289k, false);
        C15137b.b(parcel, iA);
    }
}
