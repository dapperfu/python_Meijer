package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3374ga extends AbstractC15707a {
    public static final Parcelable.Creator<C3374ga> CREATOR = new wa();

    /* renamed from: a, reason: collision with root package name */
    private final int f10095a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10096b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10097c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10098d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10099e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10100f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10101g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10102h;

    public C3374ga(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f10095a = i10;
        this.f10096b = i11;
        this.f10097c = i12;
        this.f10098d = i13;
        this.f10099e = i14;
        this.f10100f = i15;
        this.f10101g = z10;
        this.f10102h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f10095a);
        C15708b.n(parcel, 2, this.f10096b);
        C15708b.n(parcel, 3, this.f10097c);
        C15708b.n(parcel, 4, this.f10098d);
        C15708b.n(parcel, 5, this.f10099e);
        C15708b.n(parcel, 6, this.f10100f);
        C15708b.c(parcel, 7, this.f10101g);
        C15708b.w(parcel, 8, this.f10102h, false);
        C15708b.b(parcel, iA);
    }
}
