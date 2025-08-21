package Nc;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class l extends AbstractC15707a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20824a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20825b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20826c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20827d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20828e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20829f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20830g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20831h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20832i;

    l(boolean z10, boolean z11, String str, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this.f20824a = z10;
        this.f20825b = z11;
        this.f20826c = str;
        this.f20827d = z12;
        this.f20828e = f10;
        this.f20829f = i10;
        this.f20830g = z13;
        this.f20831h = z14;
        this.f20832i = z15;
    }

    public l(boolean z10, boolean z11, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this(z10, z11, null, z12, f10, -1, z13, z14, z15);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f20824a;
        int iA = C15708b.a(parcel);
        C15708b.c(parcel, 2, z10);
        C15708b.c(parcel, 3, this.f20825b);
        C15708b.w(parcel, 4, this.f20826c, false);
        C15708b.c(parcel, 5, this.f20827d);
        C15708b.k(parcel, 6, this.f20828e);
        C15708b.n(parcel, 7, this.f20829f);
        C15708b.c(parcel, 8, this.f20830g);
        C15708b.c(parcel, 9, this.f20831h);
        C15708b.c(parcel, 10, this.f20832i);
        C15708b.b(parcel, iA);
    }
}
