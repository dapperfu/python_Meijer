package Ld;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class p extends AbstractC15707a {
    public static final Parcelable.Creator<p> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18188a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18189b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18190c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18191d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18192e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f18193f;

    public boolean B() {
        return this.f18193f;
    }

    public boolean I0() {
        return this.f18188a || this.f18189b;
    }

    public boolean T() {
        return this.f18190c;
    }

    public boolean U0() {
        return this.f18192e;
    }

    public boolean b0() {
        return this.f18191d;
    }

    public boolean d1() {
        return this.f18189b;
    }

    public boolean r0() {
        return this.f18188a;
    }

    public p(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f18188a = z10;
        this.f18189b = z11;
        this.f18190c = z12;
        this.f18191d = z13;
        this.f18192e = z14;
        this.f18193f = z15;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.c(parcel, 1, r0());
        C15708b.c(parcel, 2, d1());
        C15708b.c(parcel, 3, T());
        C15708b.c(parcel, 4, b0());
        C15708b.c(parcel, 5, U0());
        C15708b.c(parcel, 6, B());
        C15708b.b(parcel, iA);
    }
}
