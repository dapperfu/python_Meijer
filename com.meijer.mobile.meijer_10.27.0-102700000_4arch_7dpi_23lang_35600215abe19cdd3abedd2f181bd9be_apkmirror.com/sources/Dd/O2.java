package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class O2 extends AbstractC15136a {
    public static final Parcelable.Creator<O2> CREATOR = new C3345x9();

    /* renamed from: a, reason: collision with root package name */
    public int f5451a;

    /* renamed from: b, reason: collision with root package name */
    public int f5452b;

    /* renamed from: c, reason: collision with root package name */
    public int f5453c;

    /* renamed from: d, reason: collision with root package name */
    public int f5454d;

    /* renamed from: e, reason: collision with root package name */
    public int f5455e;

    /* renamed from: f, reason: collision with root package name */
    public int f5456f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5457g;

    /* renamed from: h, reason: collision with root package name */
    public String f5458h;

    public O2() {
    }

    public O2(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f5451a = i10;
        this.f5452b = i11;
        this.f5453c = i12;
        this.f5454d = i13;
        this.f5455e = i14;
        this.f5456f = i15;
        this.f5457g = z10;
        this.f5458h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f5451a);
        C15137b.n(parcel, 3, this.f5452b);
        C15137b.n(parcel, 4, this.f5453c);
        C15137b.n(parcel, 5, this.f5454d);
        C15137b.n(parcel, 6, this.f5455e);
        C15137b.n(parcel, 7, this.f5456f);
        C15137b.c(parcel, 8, this.f5457g);
        C15137b.w(parcel, 9, this.f5458h, false);
        C15137b.b(parcel, iA);
    }
}
