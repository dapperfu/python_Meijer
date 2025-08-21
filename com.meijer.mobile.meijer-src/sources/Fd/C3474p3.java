package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.p3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3474p3 extends AbstractC15707a {
    public static final Parcelable.Creator<C3474p3> CREATOR = new Y9();

    /* renamed from: a, reason: collision with root package name */
    public String f10243a;

    /* renamed from: b, reason: collision with root package name */
    public String f10244b;

    /* renamed from: c, reason: collision with root package name */
    public String f10245c;

    /* renamed from: d, reason: collision with root package name */
    public String f10246d;

    /* renamed from: e, reason: collision with root package name */
    public String f10247e;

    /* renamed from: f, reason: collision with root package name */
    public O2 f10248f;

    /* renamed from: g, reason: collision with root package name */
    public O2 f10249g;

    public C3474p3() {
    }

    public C3474p3(String str, String str2, String str3, String str4, String str5, O2 o22, O2 o23) {
        this.f10243a = str;
        this.f10244b = str2;
        this.f10245c = str3;
        this.f10246d = str4;
        this.f10247e = str5;
        this.f10248f = o22;
        this.f10249g = o23;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f10243a, false);
        C15708b.w(parcel, 3, this.f10244b, false);
        C15708b.w(parcel, 4, this.f10245c, false);
        C15708b.w(parcel, 5, this.f10246d, false);
        C15708b.w(parcel, 6, this.f10247e, false);
        C15708b.u(parcel, 7, this.f10248f, i10, false);
        C15708b.u(parcel, 8, this.f10249g, i10, false);
        C15708b.b(parcel, iA);
    }
}
