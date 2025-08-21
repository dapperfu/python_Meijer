package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class U5 extends AbstractC15707a {
    public static final Parcelable.Creator<U5> CREATOR = new C3327d();

    /* renamed from: a, reason: collision with root package name */
    public String f9569a;

    /* renamed from: b, reason: collision with root package name */
    public String f9570b;

    /* renamed from: c, reason: collision with root package name */
    public String f9571c;

    /* renamed from: d, reason: collision with root package name */
    public String f9572d;

    /* renamed from: e, reason: collision with root package name */
    public String f9573e;

    /* renamed from: f, reason: collision with root package name */
    public String f9574f;

    /* renamed from: g, reason: collision with root package name */
    public String f9575g;

    public U5() {
    }

    public U5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f9569a = str;
        this.f9570b = str2;
        this.f9571c = str3;
        this.f9572d = str4;
        this.f9573e = str5;
        this.f9574f = str6;
        this.f9575g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f9569a, false);
        C15708b.w(parcel, 3, this.f9570b, false);
        C15708b.w(parcel, 4, this.f9571c, false);
        C15708b.w(parcel, 5, this.f9572d, false);
        C15708b.w(parcel, 6, this.f9573e, false);
        C15708b.w(parcel, 7, this.f9574f, false);
        C15708b.w(parcel, 8, this.f9575g, false);
        C15708b.b(parcel, iA);
    }
}
