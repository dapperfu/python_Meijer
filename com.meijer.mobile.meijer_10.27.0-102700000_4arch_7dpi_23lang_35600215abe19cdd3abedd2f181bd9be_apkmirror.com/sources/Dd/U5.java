package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class U5 extends AbstractC15136a {
    public static final Parcelable.Creator<U5> CREATOR = new C3105d();

    /* renamed from: a, reason: collision with root package name */
    public String f5536a;

    /* renamed from: b, reason: collision with root package name */
    public String f5537b;

    /* renamed from: c, reason: collision with root package name */
    public String f5538c;

    /* renamed from: d, reason: collision with root package name */
    public String f5539d;

    /* renamed from: e, reason: collision with root package name */
    public String f5540e;

    /* renamed from: f, reason: collision with root package name */
    public String f5541f;

    /* renamed from: g, reason: collision with root package name */
    public String f5542g;

    public U5() {
    }

    public U5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f5536a = str;
        this.f5537b = str2;
        this.f5538c = str3;
        this.f5539d = str4;
        this.f5540e = str5;
        this.f5541f = str6;
        this.f5542g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f5536a, false);
        C15137b.w(parcel, 3, this.f5537b, false);
        C15137b.w(parcel, 4, this.f5538c, false);
        C15137b.w(parcel, 5, this.f5539d, false);
        C15137b.w(parcel, 6, this.f5540e, false);
        C15137b.w(parcel, 7, this.f5541f, false);
        C15137b.w(parcel, 8, this.f5542g, false);
        C15137b.b(parcel, iA);
    }
}
