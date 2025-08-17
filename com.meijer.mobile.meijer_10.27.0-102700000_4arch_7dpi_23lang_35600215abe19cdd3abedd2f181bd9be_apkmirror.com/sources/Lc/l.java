package Lc;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class l extends AbstractC15136a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18004a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18005b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18006c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18007d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18008e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18009f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18010g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18011h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18012i;

    l(boolean z10, boolean z11, String str, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this.f18004a = z10;
        this.f18005b = z11;
        this.f18006c = str;
        this.f18007d = z12;
        this.f18008e = f10;
        this.f18009f = i10;
        this.f18010g = z13;
        this.f18011h = z14;
        this.f18012i = z15;
    }

    public l(boolean z10, boolean z11, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this(z10, z11, null, z12, f10, -1, z13, z14, z15);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f18004a;
        int iA = C15137b.a(parcel);
        C15137b.c(parcel, 2, z10);
        C15137b.c(parcel, 3, this.f18005b);
        C15137b.w(parcel, 4, this.f18006c, false);
        C15137b.c(parcel, 5, this.f18007d);
        C15137b.k(parcel, 6, this.f18008e);
        C15137b.n(parcel, 7, this.f18009f);
        C15137b.c(parcel, 8, this.f18010g);
        C15137b.c(parcel, 9, this.f18011h);
        C15137b.c(parcel, 10, this.f18012i);
        C15137b.b(parcel, iA);
    }
}
