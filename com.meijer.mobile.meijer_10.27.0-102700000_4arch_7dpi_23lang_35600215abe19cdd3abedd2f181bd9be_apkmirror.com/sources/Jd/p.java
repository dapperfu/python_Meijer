package Jd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class p extends AbstractC15136a {
    public static final Parcelable.Creator<p> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14851a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14852b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14853c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14854d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14855e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14856f;

    public boolean B() {
        return this.f14856f;
    }

    public boolean K0() {
        return this.f14851a || this.f14852b;
    }

    public boolean T() {
        return this.f14853c;
    }

    public boolean W0() {
        return this.f14855e;
    }

    public boolean c0() {
        return this.f14854d;
    }

    public boolean d1() {
        return this.f14852b;
    }

    public boolean q0() {
        return this.f14851a;
    }

    public p(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f14851a = z10;
        this.f14852b = z11;
        this.f14853c = z12;
        this.f14854d = z13;
        this.f14855e = z14;
        this.f14856f = z15;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.c(parcel, 1, q0());
        C15137b.c(parcel, 2, d1());
        C15137b.c(parcel, 3, T());
        C15137b.c(parcel, 4, c0());
        C15137b.c(parcel, 5, W0());
        C15137b.c(parcel, 6, B());
        C15137b.b(parcel, iA);
    }
}
