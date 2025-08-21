package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class O2 extends AbstractC15707a {
    public static final Parcelable.Creator<O2> CREATOR = new C3567x9();

    /* renamed from: a, reason: collision with root package name */
    public int f9484a;

    /* renamed from: b, reason: collision with root package name */
    public int f9485b;

    /* renamed from: c, reason: collision with root package name */
    public int f9486c;

    /* renamed from: d, reason: collision with root package name */
    public int f9487d;

    /* renamed from: e, reason: collision with root package name */
    public int f9488e;

    /* renamed from: f, reason: collision with root package name */
    public int f9489f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9490g;

    /* renamed from: h, reason: collision with root package name */
    public String f9491h;

    public O2() {
    }

    public O2(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f9484a = i10;
        this.f9485b = i11;
        this.f9486c = i12;
        this.f9487d = i13;
        this.f9488e = i14;
        this.f9489f = i15;
        this.f9490g = z10;
        this.f9491h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f9484a);
        C15708b.n(parcel, 3, this.f9485b);
        C15708b.n(parcel, 4, this.f9486c);
        C15708b.n(parcel, 5, this.f9487d);
        C15708b.n(parcel, 6, this.f9488e);
        C15708b.n(parcel, 7, this.f9489f);
        C15708b.c(parcel, 8, this.f9490g);
        C15708b.w(parcel, 9, this.f9491h, false);
        C15708b.b(parcel, iA);
    }
}
