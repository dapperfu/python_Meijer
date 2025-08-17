package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3152ga extends AbstractC15136a {
    public static final Parcelable.Creator<C3152ga> CREATOR = new wa();

    /* renamed from: a, reason: collision with root package name */
    private final int f6062a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6063b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6064c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6065d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6066e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6067f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6068g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6069h;

    public C3152ga(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f6062a = i10;
        this.f6063b = i11;
        this.f6064c = i12;
        this.f6065d = i13;
        this.f6066e = i14;
        this.f6067f = i15;
        this.f6068g = z10;
        this.f6069h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f6062a);
        C15137b.n(parcel, 2, this.f6063b);
        C15137b.n(parcel, 3, this.f6064c);
        C15137b.n(parcel, 4, this.f6065d);
        C15137b.n(parcel, 5, this.f6066e);
        C15137b.n(parcel, 6, this.f6067f);
        C15137b.c(parcel, 7, this.f6068g);
        C15137b.w(parcel, 8, this.f6069h, false);
        C15137b.b(parcel, iA);
    }
}
