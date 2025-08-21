package Sc;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class a extends AbstractC15707a {
    public static final Parcelable.Creator<a> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    public String f34479a;

    /* renamed from: b, reason: collision with root package name */
    public int f34480b;

    /* renamed from: c, reason: collision with root package name */
    public int f34481c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34482d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34483e;

    public a(int i10, int i11, boolean z10) {
        this(i10, i11, z10, false, false);
    }

    public a(int i10, int i11, boolean z10, boolean z11) {
        this(i10, i11, z10, false, z11);
    }

    public static a B() {
        return new a(12451000, 12451000, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        String str;
        if (z10) {
            str = "0";
        } else {
            str = z11 ? "2" : "1";
        }
        this("afma-sdk-a-v" + i10 + "." + i11 + "." + str, i10, i11, z10, z12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f34479a, false);
        C15708b.n(parcel, 3, this.f34480b);
        C15708b.n(parcel, 4, this.f34481c);
        C15708b.c(parcel, 5, this.f34482d);
        C15708b.c(parcel, 6, this.f34483e);
        C15708b.b(parcel, iA);
    }

    a(String str, int i10, int i11, boolean z10, boolean z11) {
        this.f34479a = str;
        this.f34480b = i10;
        this.f34481c = i11;
        this.f34482d = z10;
        this.f34483e = z11;
    }
}
