package Qc;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class a extends AbstractC15136a {
    public static final Parcelable.Creator<a> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    public String f29929a;

    /* renamed from: b, reason: collision with root package name */
    public int f29930b;

    /* renamed from: c, reason: collision with root package name */
    public int f29931c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29932d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29933e;

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
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f29929a, false);
        C15137b.n(parcel, 3, this.f29930b);
        C15137b.n(parcel, 4, this.f29931c);
        C15137b.c(parcel, 5, this.f29932d);
        C15137b.c(parcel, 6, this.f29933e);
        C15137b.b(parcel, iA);
    }

    a(String str, int i10, int i11, boolean z10, boolean z11) {
        this.f29929a = str;
        this.f29930b = i10;
        this.f29931c = i11;
        this.f29932d = z10;
        this.f29933e = z11;
    }
}
